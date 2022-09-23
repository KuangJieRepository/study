package org.example.apo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @Author: kj
 * @Date: 2022/08/31/11:37
 */
@Aspect
@Component
public class MyAspect implements Ordered {

    @Pointcut("execution(* org.example.pojo.Student.testAspect(String))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知。。。" + joinPoint.getArgs()[0] + joinPoint.getTarget());
    }

    /**
     * 优先级排序接口
     */
    @Override
    public int getOrder() {
        return 10;
    }
}
