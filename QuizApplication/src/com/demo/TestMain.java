package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("****** Student Registration******");
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
		
		
		con.close();
		pst.close();
		
		
	}

}
