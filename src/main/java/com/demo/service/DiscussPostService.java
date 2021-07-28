package com.demo.service;

import com.demo.dao.DiscussPostMapper;
import com.demo.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Author zhanggaoyuan
 * @CreateTime 2021/7/28 1:30
 * @Version 1.0.0
 */
@Service
public class DiscussPostService {
//注入
    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    public int findDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }

}
