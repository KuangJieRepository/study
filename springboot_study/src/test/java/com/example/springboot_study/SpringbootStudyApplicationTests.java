package com.example.springboot_study;

import com.example.springboot_study.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootStudyApplicationTests {
    @Autowired
    private HelloController helloController;

    @Test
    void contextLoads() {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                helloController.h2();
            }, "t" + i).start();
        }
    }

}
