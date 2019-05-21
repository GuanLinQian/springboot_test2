package com.lq.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 时间:15:22
 * 作者：Maibenben
 **/
/*@ControllerAdvice//控制器切面
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public Map showErrorMsg(){
    System.out.println("---------进入异常---------");
Map<String,Object> map=new HashMap<>();
map.put("code","500");
map.put("msg","系统响应错误");
return  map;
    }
}*/
