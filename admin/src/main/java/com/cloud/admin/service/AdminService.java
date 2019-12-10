package com.cloud.admin.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.restaurant.entity.User;

import java.util.Map;

/**
 * @author zhangqiao
 * @date 2019/9/30 13:54
 */
public interface AdminService extends IService<User> {
    /**
     * @author: zhangqiao
     * @date: 15:12 2019/9/30
     * @description: 后台用户登录
     * @param jsonObject 用户名和密码
     * @return: Map
     */
    Map login(JSONObject jsonObject);
}
