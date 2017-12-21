package com.ccq.article.dto;


import com.ccq.article.lang.ConstantStatus;

import java.io.Serializable;
import java.util.Date;

public class UserInfoDto implements Serializable{

    private Long id;

    private String username;

    private String avatar;

    private Integer sex;

    private String phone;

    private String email;

    private String addr;

    private Integer score;

    private String city;

    private Long createTime;

    private Long status;

    private String horner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getHorner() {
        return horner;
    }

    public void setHorner(String horner) {
        this.horner = horner;
    }

    public static UserInfoDto getDefaultUser() {
        UserInfoDto user = new UserInfoDto();
        user.setAddr("默认地址");
        user.setAvatar("默认头像");
        user.setCity("默认城市");
        user.setCreateTime(new Date().getTime());
        user.setScore(0);
        user.setEmail("*@*.*");
        user.setStatus(ConstantStatus.USING);
        return user;
    }
}
