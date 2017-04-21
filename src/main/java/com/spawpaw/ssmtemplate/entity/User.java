package com.spawpaw.ssmtemplate.entity;

/**
 * @author BenBenShang 2017/4/21.
 * @version: 1.0 2017.2.21
 * @copyright: <p> 2017.2.21 spawpaw@hotmail.com CC-BY-NC-SA.<br/>
 * This work is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.</br>
 * view details: https://creativecommons.org/licenses/by-nc-sa/4.0/
 * </p>
 * <p>
 * Description for this class:
 * <p>$desc
 */
public class User {
    private String user_name;
    private String password;
    private String name;
    private int age;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
