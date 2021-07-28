package com.demo.dao;

import com.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author zhanggaoyuan
 * @CreateTime 2021/7/28 1:58
 * @Version 1.0.0
 */
@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);

}
