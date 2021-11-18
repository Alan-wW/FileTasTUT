package com.alan.filetask.service.impl;

import com.alan.filetask.entity.User;
import com.alan.filetask.mapper.UserMapper;
import com.alan.filetask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByUserName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public User getAutorNameById(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }
}
