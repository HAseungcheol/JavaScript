<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	 	<% 
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String strname = request.getParameter("name");
		String strmajor = request.getParameter("subject");
		String strid=request.getParameter("ID");	
		out.print("�̸���:"+strname+",������:"+strmajor+",���̵�:"+strid);

	   %> 
</body>
</html>