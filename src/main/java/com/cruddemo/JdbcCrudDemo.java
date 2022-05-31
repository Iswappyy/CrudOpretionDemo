package com.cruddemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCrudDemo {
	
	public void createStudent(Student1 student) throws SQLException {
		
		Connection con1 = getConnection.getConnection1();
		
		String query = "insert into student2 values(?,?,?)";
		PreparedStatement pst = con1.prepareStatement(query);
		pst.setInt(1,student.getRollnum());
		pst.setString(2, student.getName());
		pst.setString(3, student.getCity());
		
		pst.executeUpdate();
		
		System.out.println("Done...");
		getConnection.closeConnection();
		
		
	}
	
	public Student1 getStudentByRoll(int roll) throws SQLException
	 {  
		
		Student1 s = new Student1();
		s.rollnum = roll;
		String query = "select name from student2 where rollnum = " + roll ;
		
		Connection con1 = getConnection.getConnection1();
	
	    Statement st = con1.createStatement();  
     	 ResultSet rs = st.executeQuery(query);
		rs.next();
		 String name = rs.getString(1);
			s.name = name;
			getConnection.closeConnection();
		return s;
	
	}

	public void updateStudent(Student1 student) throws SQLException
	
	{
		
		String query = "update student2 set name='swapnil' where rollnum=38";
		Connection con1 = getConnection.getConnection1();
		PreparedStatement pst = con1.prepareStatement(query);
//		pst.setString(2,student.getName());
//		pst.setString(3,student.getCity());
//		pst.setInt(1,student.getRollnum());
		
		pst.executeUpdate();
		  
		  getConnection.closeConnection();
	}
	
	public Student1 deleteStudentByRoll(int roll) throws SQLException
	{
		
		Connection con1 = getConnection.getConnection1();
		String query = "delete from student2 where rollnum = ?";
		PreparedStatement pst = con1.prepareStatement(query);
		pst.setInt(1, roll);
		pst.executeUpdate(); 
		 
		getConnection.closeConnection();
		return  null;
		
	}


}