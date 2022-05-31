package com.cruddemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class getConnection {
	
	  static Connection con	;
     public static Connection getConnection1() {
    	 
    	 String url = "jdbc:mysql://localhost:3306/learn";
   	     String uname = "root";
   	     String pass = "0902";
    	 
    	 try {
			con = DriverManager.getConnection(url,uname,pass);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
    	 
     }
     
     public static void closeConnection() {
    	 if(con != null) {
    		 try {
				con.close();
				System.out.println("connection closed..");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
    	 }
     }
}
