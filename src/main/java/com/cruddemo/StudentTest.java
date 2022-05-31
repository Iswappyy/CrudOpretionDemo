package com.cruddemo;

import java.sql.SQLException;

public class StudentTest {
	public static void main(String[] args) throws SQLException {
		
		
		JdbcCrudDemo obj1 = new JdbcCrudDemo();
		
		Student1 s1 = new Student1(38,"Raj","Pune");
		Student1 s2 = new Student1(58,"Anu","Nagpur");
		Student1 s3 = new Student1(38,"Swap","Nasik");
		Student1 s4 = new Student1(28,"Mayu","Mumbai");
		
		obj1.createStudent(s1);                 //Create
		obj1.getStudentByRoll(s1.rollnum);      //Read
		obj1.updateStudent(s1);                 //Update
		obj1.deleteStudentByRoll(18);           //Delete
		

		
	
		 
		
		  
		
	}

}
	