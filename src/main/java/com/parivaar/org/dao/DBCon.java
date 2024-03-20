/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parivaar.org.dao;

/**
 *
 * @author Anish
 */
    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

//	public Connection getConnection() {
//		Connection con = null;
//
//		try {
//			String dbDriver = "com.mysql.jdbc.Driver";
//			String dbURL = "jdbc:mysql://root:root@localhost:3306/parivar_db";
////                                + "database=login;user=root;password=root";
//
//			Class.forName(dbDriver);
//			con = DriverManager.getConnection(dbURL);
//			System.out.println("DB Connecting");
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//			System.out.println("Database.getConnection() Error -->" + e.getMessage());
//		}
//		return con;
//	}
//    public void close(Connection con) {
//        try {
//            con.close();
//        } catch (Exception ex) {
//        }
//    }
}