package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.getCon();
		
		String query = "insert into StudentRegistration values(?,?,?,?,?,?)";
		
		//PreparedStatement pst = con.prepareStatement(query);
		PreparedStatement pst = con.prepareStatement(query);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student First Name");
		
		String firstName = sc.next();
		
		System.out.println("Enter Student Last Name");
		
		String lastName = sc.next();
		
		System.out.println("Enter Student User Name");
		
		String userName = sc.next();
		
		System.out.println("Enter Student Password");
		
		String password = sc.next();
		
		System.out.println("Enter Student City");
		
		String city = sc.next();
		
		System.out.println("Enter Student Contact");
		
		long contact = sc.nextLong();
		
		
		
		pst.setString(1, firstName);
		pst.setString(2, lastName);
		pst.setString(3, userName);
		pst.setString(4, password);
		pst.setString(5, city);
		pst.setLong(6, contact);
		
		int i = pst.executeUpdate();
		System.out.println(i+"Data Inserted Successfully");
		
		System.out.println("***** Student Login *****");
		
		StudentLogin st = new StudentLogin();
		String query1 = "Insert into StudentLogin values(?,?)";
		PreparedStatement pst1 = con.prepareStatement(query1);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter User Name");
        String stud_userName = sc1.next();
        
		System.out.println("Enter Student Password");
		String stud_password = sc.next();
		
		pst1.setString(1, stud_userName);
		pst1.setString(2, stud_password);
		
		int j = pst1.executeUpdate();
		System.out.println(j+"Student Login Successfully");
		
		con.close();
		pst.close();
	}
      
      
}
