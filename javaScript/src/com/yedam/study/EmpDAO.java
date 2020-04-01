package com.yedam.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.board.Board;

public class EmpDAO {
	Connection conn = null; // 연결

	public EmpDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("연결에 성공하였습니다.");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("연결에 실패하였습니다.");
			e.printStackTrace();
		}
	}

	public List<Student> getEmpList() {
		String sql = "select first_name, salary, email from emp";
		List<Student> list = new ArrayList<>();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Student s1 = new Student(rs.getString("first_name"), rs.getInt("salary"), rs.getString("email"));
				list.add(s1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
////한 건 조회
	public Student getBoardInfo(int id){
	String sql =" select first_name, salary, email from employees where employee_id = ?";  
		Student emp = new Student();
		
	try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery(); //쿼리 실행
			if(rs.next()) {
			emp.setName(rs.getString("first_name"));
			emp.setAge(rs.getInt("salary"));
			emp.setSchool(rs.getString("email"));
		
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return emp;
	}	
	
}
