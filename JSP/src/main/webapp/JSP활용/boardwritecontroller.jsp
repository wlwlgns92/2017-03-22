<%@page import="Test.Board"%>
<%@page import="java.io.FileOutputStream"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		
		Board board = new Board( title , contents , "asd");
		
		FileOutputStream fileOutputStream = new FileOutputStream("D:/조지훈/JSP/src/main/java/Test/boardList.txt", true);
		String outstring = board.getTitle()+","+board.getContents()+","+board.getWriter()+"\n";
		fileOutputStream.write(outstring.getBytes());
		response.sendRedirect("boardlist.jsp");
	
	%>
</body>
</html>