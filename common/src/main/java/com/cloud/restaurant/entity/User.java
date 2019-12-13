package com.cloud.restaurant.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangqiao
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户id
     */
      private Integer id;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 盐
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String mobile;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 状态 0：禁用 1：正常
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDate createTime;


}
