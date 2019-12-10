package com.cloud.admin.controller;

import com.alibaba.fastjson.JSONObject;
import com.cloud.admin.service.AdminService;
import com.cloud.restaurant.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author zhangqiao
 * @date 2019/9/30 15:07
 */
@RestController
@RequestMapping("/login")
public class UserController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/auth")
    public Map login(@RequestBody JSONObject jsonObject){
        return adminService.login(jsonObject);
    }

    @RequestMapping("/userInfo")
    public List<User> getAllUser(){
        List<User> userList = adminService.list();
        return userList;
    }
}
