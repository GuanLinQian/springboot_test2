package com.lq.service;

import com.lq.pojo.User;

/**
 * 时间:18:36
 * 作者：Maibenben
 **/

public interface UserService {

    void register(String name,String password);
    User findUser(Integer id);
}
