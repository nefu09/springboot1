package com.example.springboot1.example03;

import com.example.springboot1.example01.Account;
import com.example.springboot1.example02.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;
    public Account buy(Integer uid, float expense) {
        Account account = accountMapper.selectById(uid);
        float balance = account.getBalance() - expense;
        if (balance < 0) {
            throw new RuntimeException("余额不足");
        }
        account.setBalance(balance);
        // 返回影响记录的行数。0，没有更新记录
        int update = accountMapper.updateById(account);
        if (update == 0) {
            throw new RuntimeException("乐观锁，余额不足");
        }
        return account;
    }
}
