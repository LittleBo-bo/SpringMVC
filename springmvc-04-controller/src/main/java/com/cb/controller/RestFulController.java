package com.cb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {
    @RequestMapping("/add/{a}/{b}")
    public String test(Model model, @PathVariable int a,@PathVariable int b){
        int res = a + b;
        model.addAttribute("msg","结果为："+res);
        return "hello";
    }
    //@GetMapping("/add/{a}/{b}")  跟下面的一样
    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)   //使用get方法
    public String test2(Model model, @PathVariable int a,@PathVariable int b){
        int res = a + b;
        model.addAttribute("msg","结果2为："+res);
        return "hello";
    }
}
