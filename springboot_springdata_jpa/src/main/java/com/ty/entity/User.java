package com.ty.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2018/5/12.
 */
@Entity
@Table(name="tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_name", length = 50)
    private String userName;
    @Column(name = "email",length = 100)
    private String email;

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
