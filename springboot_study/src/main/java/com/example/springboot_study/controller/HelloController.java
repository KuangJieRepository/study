package com.example.springboot_study.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kj
 * @Date: 2022/09/05/11:13
 */
//@Scope("")
@RestController
@RequestMapping("/hello")
public class HelloController {

    private Integer num = 0;

    @RequestMapping("/h1")
    public String h1() {
        return "h1";
    }

    @RequestMapping("/h2")
    public void h2() {
        ++num;
        System.out.println(num);
    }



}
