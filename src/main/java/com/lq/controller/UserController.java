package com.lq.controller;

import com.lq.pojo.User;
import com.lq.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 时间:7:56
 * 作者：Maibenben
 **/
@Controller

public class UserController {

    @ResponseBody
    @RequestMapping("user/{id}")
  public User showUser(@PathVariable("id") Integer id){
        User user=new User(id,"lisi","123");

        return  user;


  }

private Logger logger=Logger.getLogger(UserController.class);
@Autowired
private UserService userService;
    @RequestMapping("register")
    @ResponseBody
  public String register(HttpServletRequest request,String name, String password){
        logger.info("用户ip:"+request.getRemoteHost()+"用户："+name+"密码："+password);
        userService.register(name,password);

return  "success";
  }
  @ResponseBody
  @RequestMapping("findUser")
  public User findUser(Integer id){
           System.out.println("id:"+id);
        return userService.findUser(id);
  }
//    public static void main(String[] args) {
//        SpringApplication.run(UserController.class,args);
//    }
}
