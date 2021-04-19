package com.example.springboot1.example03;

import com.example.springboot1.example01.Account;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Slf4j
@SpringBootTest
public class AccountServiceTest {
   @Autowired
   private AccountService accountService;
    @Test
    public void  accountService01() throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        // 预并发数量
        int count = 2;
        // 并发计数器，用于阻塞测试线程
        // 否则，创建的并发子线程没有执行完毕，测试线程就结束了
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < 2; i++) {
            service.execute(() -> {

                try {
                    Thread.sleep(10);
                    Account a = accountService.buy(1, 600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    latch.countDown();
                }


            }
            );
        }
        // 阻塞线程，当内部计数器为0时，线程继续
        latch.await();
        // 关闭线程池
        service.shutdown();
    }
}
