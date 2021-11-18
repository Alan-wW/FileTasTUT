package com.alan.filetask.service;

import com.alan.filetask.entity.User;

public interface UserService {
    User getUserByUserName(String username);

    void save(User user);

    User getAutorNameById(Integer uid);
}
