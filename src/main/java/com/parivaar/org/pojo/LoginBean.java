/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parivaar.org.pojo;

/**
 *
 * @author Anish
 */
import com.parivaar.org.Util;
import com.parivaar.org.dao.impl.LoginDAOImpl;
import com.parivaar.org.hb.entity.Login;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import javax.inject.Inject;
import org.primefaces.model.DialogFrameworkOptions;
 
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {
 
    private static final long serialVersionUID = 1L;
    
    @Inject
    private LoginDAOImpl loginDao;
    private String password;
    private String message, uname;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getUname() {
        return uname;
    }
 
    public void setUname(String uname) {
        this.uname = uname;
    }
 
    public String loginProject() {
        boolean result = loginDao.login(uname, password);
        
          if (result) {

            // get Http Session and store username
            HttpSession session = Util.getSession();
            session.setAttribute("username", uname);            
            return "home";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                    "Invalid Login!",
                    "Please Try Again!"));
            
             // invalidate session, and redirect to other pages
             //message = "Invalid Login. Please Try Again!";
            return "login";
        }
//        if (result) {
//
//            // get Http Session and store username
//            HttpSession session = Util.getSession();
//            session.setAttribute("username", uname);            
//            return "faces/home";
//        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
//                    "Invalid Login!",
//                    "Please Try Again!"));
//            
//             // invalidate session, and redirect to other pages
//             //message = "Invalid Login. Please Try Again!";
//            return "login";
//        }
    }
      public String changePasswordDial() {
        DialogFrameworkOptions options = DialogFrameworkOptions.builder()
                .modal(true)
                .fitViewport(true)
                .responsive(true)
                .width("900px")
                .contentWidth("100%")
                .resizeObserver(true)
                .resizeObserverCenter(true)
                .resizable(false)
                .styleClass("max-w-screen")
                .iframeStyleClass("max-w-screen")
                .build();

//        PrimeFaces.current().dialog().openDynamic("changePassword", options, null);
        
       return "changePassword";
    }
    
    public void changePass(){
    
//        HttpSession session = Util.getSession();
        
//     Login newLogin = new Login(   session.getAttribute("username").toString() ,password) ;
        
     
    }
    
    public String cancle(){
        return "home";
    }
 
    public String logout() {
      HttpSession session = Util.getSession();
      session.invalidate();
      return "login";
   }
}
