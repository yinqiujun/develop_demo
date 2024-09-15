package org.example.easycode;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2024-09-17 15:18:25
 */
public class User implements Serializable {
    private static final long serialVersionUID = -10725010766120148L;
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


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}

