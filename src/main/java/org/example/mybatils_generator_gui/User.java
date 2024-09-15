package org.example.mybatils_generator_gui;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 用户表
 */
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    private String uid;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 生日
     */
    private Date birthday;

    private static final long serialVersionUID = 1L;
}