package com.xinguan14.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by XL on 2016/7/31.
 */
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private Integer id ;
    @NotNull
    private String email;
    @NotNull
    private String name;
    public User(){

    }
    public User(Integer id){
        this.id=id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
