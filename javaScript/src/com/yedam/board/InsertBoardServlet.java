package com.yedam.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.dev.EmpDAO;
import com.yedam.dev.Employee;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@WebServlet("/InsertBoardServlet")
public class InsertBoardServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
     
    public InsertBoardServlet() {
        super();
       
    }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //response.getWriter().append("Served at: ").append(request.getContextPath());
      String content = request.getParameter("content");
      String writer = request.getParameter("writer");
      System.out.println("content : "+content+", writer : "+writer);
      //db입력처리
      Board bad = new Board();
      bad.setContent(content);
      bad.setWriter(writer);
      BoardDAO dao = new BoardDAO();
      dao.insertbr(bad);
      
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

}
