package com.yedam.countries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.board.Board;
import com.yedam.study.Student;

public class CountriesDAO {
	Connection conn = null; // 연결

	public CountriesDAO() {
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
	public List< Countries> getCon() {
		String sql = "select * from COUNTRIES";
		List< Countries> list = new ArrayList<>();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				 Countries s1 = new  Countries(rs.getString("country_id"), rs.getString("country_name"), rs.getInt("region_id"));
				list.add(s1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}

