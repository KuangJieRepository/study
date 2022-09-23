package com.kj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: kj
 * @Date: 2022/09/01/9:54
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String toIndex() {
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        System.out.println("test...");
        int q = 10 / 0;
        return "test";
    }
}
