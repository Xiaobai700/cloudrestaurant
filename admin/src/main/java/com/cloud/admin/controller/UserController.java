package com.cloud.admin.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cloud.admin.service.AdminService;
import com.cloud.restaurant.entity.User;
import com.cloud.restaurant.mapper.UserMapper;
import io.github.hengyunabc.zabbix.api.ZabbixApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangqiao
 * @date 2019/9/30 15:07
 */
@RestController
@RequestMapping("/login")
public class UserController implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private AdminService adminService;

    @Autowired
    private UserMapper userMapper;



    @RequestMapping("/auth")
    public Map login(@RequestBody JSONObject jsonObject) {
        return adminService.login(jsonObject);
    }

    @RequestMapping("/userInfo")
    public List<User> getAllUser() {
        List<User> userList = adminService.list();

        return userList;
    }

    //@Scheduled(cron = "0 */1 * * * *")
    public void testDemo1() {
        String format = "yyyy-MM-dd HH:mm:ss";

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        System.out.println("0 */1 * * * *");
        System.out.println(sdf.format(new Date(System.currentTimeMillis())));
    }

    //@Scheduled(cron = "0 */1 * * * ?")
    public void testDemo() {
        String format = "yyyy-MM-dd HH:mm:ss";

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        System.out.println("0 */1 * * * ?");
        System.out.println(sdf.format(new Date(System.currentTimeMillis())));
    }

    //@Scheduled(cron = "0 */1 * * * ?")
    public void testDemo2() {
        JSONArray jsonArray = JSONArray.parseArray("");
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //testDemo();
    }
}
