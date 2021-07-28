package com.demo.service;

import com.demo.dao.UserMapper;
import com.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhanggaoyuan
 * @CreateTime 2021/7/28 1:56
 * @Version 1.0.0
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }

}
