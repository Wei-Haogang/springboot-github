package com.whg.hz.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Controller
public class TestController {

    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello world");
    }
}
