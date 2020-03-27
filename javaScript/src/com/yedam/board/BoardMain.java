package com.yedam.board;

import java.util.List;

import com.yedam.dev.EmpDAO;
import com.yedam.dev.Employee;

public class BoardMain {

	public static void main(String[] args) {
//		BoardDAO e = new BoardDAO();
//		List<Board> elist = e.getBoardList();
//		for (Board brd : elist) {
//			System.out.println(brd);
//		}
//		Board board = new Board();
//		board.setWriter("user1");
//		board.setContent("java test");
//		e.insertbr(board);
//	}
	BoardDAO b = new BoardDAO();
	Board brd = b.getBoardInfo(1);
	System.out.println(brd);

	}
}