package com.cloudiip.pojo.entity;

/**
 *
 * @author huangruibin
 * @Date 2021/11/16 18:00
 *
 */
public class UserEntity {
    private Long userId;
    private String userName;
    private String Password;
    private String Email;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String userPassword) {
        this.Password = userPassword;
    }

    public String getUserEmail() {
        return Email;
    }

    public void setUserEmail(String userEmail) {
        this.Email = userEmail;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + Password + '\'' +
                ", userEmail='" + Email + '\'' +
                '}';
    }
}
