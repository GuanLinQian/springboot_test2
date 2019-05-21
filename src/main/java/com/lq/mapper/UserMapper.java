package com.lq.mapper;

import com.lq.pojo.User;

/**
 * 时间:19:14
 * 作者：Maibenben
 **/
public interface UserMapper {

    void save(String name,String password);
    User getUserById(Integer id);

}
