package com.example.kafkaspringboot.aop;

import com.example.kafkaspringboot.pojo.ErrorLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.*;

/**
 * @Author: kj
 * @Date: 2022/11/02/14:26
 */
@Aspect
@Component
@Slf4j
public class LogAspect {
    @Resource
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Pointcut("execution(* com.example.kafkaspringboot.controller.KafkaTest.sendErrorLog(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before() {
        log.info("before:{}", "before22222222222");
    }

    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        log.error("error:{}", e);
        String error = String.valueOf(e);
        ErrorLog errorLog = new ErrorLog();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            e.printStackTrace(printStream);
            error = byteArrayOutputStream.toString();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        errorLog.setMethodName(joinPoint.getSignature().getName());
        errorLog.setErrorMsg(error);
        kafkaTemplate.send("newTopic", errorLog.toString());
    }
}
