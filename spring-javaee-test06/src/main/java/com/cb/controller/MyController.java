package com.cb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mc")
public class MyController {


    @RequestMapping("/submit")
    public String ouxiang(@RequestParam("yy")String name, @RequestParam("age")int age, Model model){
        System.out.println("姓名是："+name);
        System.out.println("年龄是："+age);
        model.addAttribute("name",name);
        model.addAttribute("age",age+1);

        return "success";
    }

}
