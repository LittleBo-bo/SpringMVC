package com.cb.controller;

import com.alibaba.fastjson.JSON;
import com.cb.pojo.User;
import com.cb.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller  //走视图解析器
@RestController //返回字符串
public class UserController {
    /*@RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")*/  //乱码问题
    @RequestMapping("/j1")
   // @ResponseBody //不会走视图解析器，会直接返回一个字符串  有@RestController就不用
    public  String json1() throws JsonProcessingException {
        //jackson objectMapper
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User("陈博大哥",23,"男");

        String str = mapper.writeValueAsString(user);
        return str;
    }


    @RequestMapping("/j2")
    public  String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<User>();
        User user1 = new User("陈博大哥1",23,"男");
        User user2 = new User("陈博大哥2",23,"男");
        User user3 = new User("陈博大哥3",23,"男");
        User user4 = new User("陈博大哥4",23,"男");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
       /* String str = mapper.writeValueAsString(userList);
        return str;*/
       return JsonUtils.getJson(userList);
    }

    @RequestMapping("/j3")
    public  String json3() throws JsonProcessingException {

        //纯java格式
  /*      ObjectMapper mapper = new ObjectMapper();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sdf.format(date);
        String str = mapper.writeValueAsString(format);
        return str;*/



/*
         //使用ObjectMapper  来格式化输出
        ObjectMapper mapper = new ObjectMapper();
        //不用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        mapper.setDateFormat(sdf);
        return mapper.writeValueAsString(date);*/

        Date date = new Date();
        return JsonUtils.getJson(date,"yyyy-MM-dd hh:mm:ss");

    }

    @RequestMapping("/j4")
    public  String json4() throws JsonProcessingException {


        List<User> userList = new ArrayList<User>();
        User user1 = new User("陈博大哥1",23,"男");
        User user2 = new User("陈博大哥2",23,"男");
        User user3 = new User("陈博大哥3",23,"男");
        User user4 = new User("陈博大哥4",23,"男");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String s = JSON.toJSONString(userList);
        return s;
    }
}
