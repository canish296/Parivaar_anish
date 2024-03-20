/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parivaar.org.dao;

/**
 *
 * @author Anish
 */
import com.parivaar.org.hb.entity.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;



public interface LoginDAO {  

     public Login getLoginById(String id);
//	public static boolean login(String user, String password) {
//		Connection con = null;
//		PreparedStatement ps = null;
//		DBCon dbcon = new DBCon();
//		try {
//			con = dbcon.getConnection();
//			ps = con.prepareStatement(
//					"SELECT username, password FROM UserLogin WHERE username= ? and password= ? ");
//			ps.setString(1, user);
//			ps.setString(2, password);
//
//			ResultSet rs = ps.executeQuery();
//			if (rs.next()) // found
//			{
//				System.out.println(rs.getString("username"));
//				return true;
//			}
//			else {
//				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
//						"LoginDAO!",
//						"Wrong password message test!"));
//				return false;
//			}
//		} 
//		catch (Exception ex) {
//			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
//					"Database Error",
//					"Unable to connect database"));            
//			System.out.println("Error in login() -->" + ex.getMessage());
//			return false;
//		} finally {
//			dbcon.close(con);
//		}
//	}
//
//	public static void main(String[] args) { 
//		System.out.println(LoginDAO.login("user", "pass"));
//	}
}