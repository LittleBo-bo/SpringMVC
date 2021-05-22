package com.cb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest {

    @RequestMapping("/t1")
    public String test(Model model){
        model.addAttribute("msg","陈博大哥！");
       /* return "forward:/WEB-INF/jsp/hello.jsp";*/
        return "redirect:/index.jsp";
    }
}
