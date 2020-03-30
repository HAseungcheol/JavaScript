package com.yedam.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.dev.Employee;

public class BoardDAO {
	Connection conn = null;
 //디비 연결
	public BoardDAO() {
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

	}
//보드 형식 리스트 만들기
	public List<Board> getBoardList() {
		String sql = "select * from board order by 1 desc"; //역순보기
		List<Board> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board br = new Board();
				br.setBoardNo(rs.getInt("board_no")); //컬럼명 
				br.setContent(rs.getString("content"));
				br.setWriter(rs.getString("writer"));
				br.setDate(rs.getString("create_date"));

				list.add(br);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
//한 건 입력
	public void insertbr(Board br) {
		String sql = "INSERT INTO board VALUES((select nvl(max(board_no),0)+1 from board), ?, ?, sysdate)"; 
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, br.getContent());
			pstmt.setString(2, br.getWriter());
			int iCnt = pstmt.executeUpdate();
			System.out.println(iCnt + "건 입력.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//한건 조회	
	public Board getBoardInfo(int boardNo){
	String sql =" select board_no, content, writer, create_date from board where board_no = ?";  
		Board brd = new Board();
	
	try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			ResultSet rs = pstmt.executeQuery(); //쿼리 실행
			if(rs.next()) {
			brd.setBoardNo(rs.getInt("board_no"));
			brd.setContent(rs.getString("content"));
			brd.setWriter(rs.getString("writer"));
			brd.setDate(rs.getString("create_date"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return brd;
	}
}



