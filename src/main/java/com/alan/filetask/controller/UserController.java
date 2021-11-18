package com.alan.filetask.controller;

import com.alan.filetask.entity.User;
import com.alan.filetask.entity.resp.Result;
import com.alan.filetask.service.UserService;
import com.alan.filetask.utils.JwtUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/login")
    public Result login(String username, String password){
        if(StringUtils.isBlank(username) || StringUtils.isBlank(password)){
            return Result.error().message("参数不合法");
        }
        User user = userService.getUserByUserName(username);
        if(user == null){
            return Result.error().message("用户不存在");
        }
        if(StringUtils.isBlank(user.getPassword()) || !StringUtils.equals(user.getPassword(),password)){
            return Result.error().message("密码错误");
        }
        Map<String, String> map = new HashMap<>();
        map.put("userId",String.valueOf(user.getId()));
        map.put("username",user.getName());
        String token = JwtUtils.getToken(map);
        return Result.ok().data("token",token);
    }

    @PostMapping("/register")
    public Result register(User user){
        //根据用户名查找用户是否存在
        User userByUserName = userService.getUserByUserName(user.getUsername());
        if(userByUserName != null){
            return Result.error().message("用户名已存在");
        }
        userService.save(user);
        return Result.ok();
    }
}
