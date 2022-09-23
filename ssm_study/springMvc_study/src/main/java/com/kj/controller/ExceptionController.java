package com.kj.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author: kj
 * @Date: 2022/09/01/10:57
 */
@ControllerAdvice
public class ExceptionController{

    @ExceptionHandler(Exception.class)
    public void test(Exception exception) {
        System.out.println(exception.toString());
    }
}
