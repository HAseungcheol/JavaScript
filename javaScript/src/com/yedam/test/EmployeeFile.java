package com.yedam.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFile {
private static char[] rs;

public static void main(String[] args) throws SQLException {
	Connection conn = null;
    String user = "hr";
    String pass = "hr";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    try {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       conn = DriverManager.getConnection(url, user, pass);
    } catch (ClassNotFoundException e) {
       e.printStackTrace();
    } catch (SQLException e) {
       e.printStackTrace();
    }
    
     // Employee 테이블 전체 데이터 Stream으로 생성.
     List<Employee> list = new ArrayList<>();
     try {
        PreparedStatement pstmt = conn.prepareStatement("select first_name, salary from Employees");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
           list.add(new Employee(rs.getString("first_name"), rs.getInt("salary")));
        }
     } catch (SQLException e) {
        System.out.println("SQL문을 확인해보세요.");
     }
	
	PreparedStatement txt = conn.prepareStatement("select first_name, salary from Employees");
	String fileName = "D:\\Employeefile.txt";
	
	try {
		BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
		fw.write(url);
		fw.flush();
		fw.close();
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
