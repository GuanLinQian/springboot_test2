package com.lq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 时间:14:08
 * 作者：Maibenben
 **/
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("hello/{name}")
    public  String hello(@PathVariable("name") String name){
        System.out.println("------------进入hello-----------");

        return name+"hello,world!";
    }
}
