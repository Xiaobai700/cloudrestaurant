package com.cloud.restaurant.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangqiao
 * @date 2019/9/30 14:22
 */
@Setter
@Getter
public class User {

    @TableId
    private Integer id;

    private String username;

    private String password;
}
