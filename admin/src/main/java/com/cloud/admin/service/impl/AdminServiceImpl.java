package com.cloud.admin.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cloud.admin.service.AdminService;
import com.cloud.restaurant.entity.User;
import com.cloud.restaurant.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangqiao
 * @date 2019/9/30 13:54
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Map login(JSONObject jsonObject) {
        Map returnMap = new HashMap();
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        User user1 = new User();
        user1.setUsername(username);
        user1.setPassword(password);
        User user = userMapper.selectOne(user1);
        if(user != null){
            returnMap.put("code",100);
            returnMap.put("msg","登录成功！");
        }
        return returnMap;
    }
}
