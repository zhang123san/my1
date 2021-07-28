package com.demo.dao;

import com.demo.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author zhanggaoyuan
 * @CreateTime 2021/7/28 0:06
 * @Version 1.0.0
 */
@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId,int offset ,int limit);//传入0时忽略查询条件,起始行号，每页最多显示多少数据

    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.
    int selectDiscussPostRows(@Param("userId") int userId);//查询行数

}
