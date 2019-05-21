package com.lq.service;

import com.lq.mapper.UserMapper;
import com.lq.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 时间:18:37
 * 作者：Maibenben
 **/
@Service
@Transactional
public class UserServiceImpl implements  UserService {
@Autowired
private    UserMapper userMapper;

    @Override
    public User findUser(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void register(String name, String password) {
 userMapper.save(name,password);

    }
}
