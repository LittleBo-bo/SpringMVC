package com.cb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController{
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","陈博大哥");
        return "hello";
    }
}
