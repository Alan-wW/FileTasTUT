package com.alan.filetask.mapper;

import com.alan.filetask.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * UserMapper继承基类
 */
@Mapper
public interface UserMapper extends MyBatisBaseDao<User, Integer> {
    User getUserByName(@Param("username") String username);
}