package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Hunter on 2020-06-16.
 */
@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
