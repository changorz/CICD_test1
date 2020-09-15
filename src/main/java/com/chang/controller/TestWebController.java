package com.chang.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestWebController {

    @GetMapping("/hello")
    public String getHello(){
        return "hello word!!227  hhh  6";
    }


}
