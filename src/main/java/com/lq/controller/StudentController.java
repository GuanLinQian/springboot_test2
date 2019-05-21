package com.lq.controller;

import com.lq.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 时间:19:08
 * 作者：Maibenben
 **/
@RequestMapping("/stu")
@Controller
public class StudentController {
    @RequestMapping("/list")
    public String showList(Map<String,Object> map){
        System.out.println("---------进入student--------");
          map.put("name","glq");
          map.put("age",22);
        List<Student> list=new ArrayList<>();

        list.add(new Student(10001,"李四","男"));
        list.add(new Student(10002,"张三","男"));
        list.add(new Student(10003,"王五","男"));
        map.put("lists",list);
        return  "stu/lists";
    }
}
