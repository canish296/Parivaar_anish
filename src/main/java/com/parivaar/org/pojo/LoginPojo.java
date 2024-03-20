/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parivaar.org.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author Anish
 */
@Named
@Dependent
public class LoginPojo implements Serializable{
    
    private String userId;
    private String password;

    public LoginPojo(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public LoginPojo() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
