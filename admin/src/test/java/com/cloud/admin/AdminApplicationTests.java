package com.cloud.admin;

import com.alibaba.fastjson.JSONObject;
import com.cloud.admin.service.AdminService;
import com.cloud.restaurant.entity.User;
import com.cloud.restaurant.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AdminService adminService;

    @Test
    public void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(1, userList.size());
        userList.forEach(System.out::println);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userName","zzz");
        jsonObject.put("password","zzzz");
        adminService.login(jsonObject);
    }

}
