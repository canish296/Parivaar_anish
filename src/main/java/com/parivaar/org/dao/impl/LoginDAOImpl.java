/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parivaar.org.dao.impl;

import com.parivaar.org.dao.ItemDao;
import com.parivaar.org.dao.LoginDAO;
import com.parivaar.org.dao.SupplierDao;
import com.parivaar.org.hb.entity.Item;
import com.parivaar.org.hb.entity.Login;
import com.parivaar.org.hb.entity.Supplier;
import com.parivaar.org.pojo.ItemPojo;
import com.parivaar.org.pojo.SupplierPojo;
import com.parivaar.org.util.HibernateUtil;
import com.parivaar.org.util.ItemUtil;
import java.io.Serializable;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.primefaces.PrimeFaces;
import org.primefaces.expression.impl.ThisExpressionResolver;

/**
 *
 * @author Anish
 */

@Named(value = "loginDao")
@ApplicationScoped
public class LoginDAOImpl implements LoginDAO, Serializable {
    
       private static Transaction transObj;
    private static SessionFactory sessionObj = HibernateUtil.getSessionFactory();

    @Override
    public Login getLoginById(String id) {
        Transaction transaction = null;
        Login login = null;
        
     try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // Obtain an entity using byId() method
            login = session.byId(Login.class).getReference(id);

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return login; }
    
    
    public Boolean login(String user, String password){
        
 
        FacesMessage message = null;
        boolean loggedIn = false;
         
        if(user != null && user.equals("admin") && password != null && password.equals("admin")) {
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", user);
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
        }
         
        return loggedIn;
      
    }
//           return reqLogin.getPassword().equals(password);

    }
    




 