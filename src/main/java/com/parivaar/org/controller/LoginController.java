/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.parivaar.org.controller;

import com.parivaar.org.dao.LoginDAO;
import com.parivaar.org.pojo.LoginPojo;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author Anish
 */
@Named(value = "loginController")
@Dependent
public class LoginController {

    /**
     * Creates a new instance of LoginController
     */
    public LoginController() {
    }
    
    private LoginPojo loginPojo;
    
      @Inject
    private LoginDAO loginDao;
    
    public void login(){
        
    }
        
}
