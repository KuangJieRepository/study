package com.example.springboot_study.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @Author: kj
 * @Date: 2022/09/05/11:19
 */
@Component
@Aspect
//@EnableAspectJAutoProxy
@Slf4j
public class MyAspect implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Pointcut("execution(* com.example.springboot_study.controller.*.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        log.info("方法名称：{}", joinPoint.getSignature().getName());
        System.out.println(applicationContext);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
