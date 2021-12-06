<%@page import="Test.Member"%>
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
	<!-- 사용자 뷰 x [ 컨트롤러 이기 때문 ] -->
	
	<% // 스크립트 문
	request.setCharacterEncoding("UTF-8"); // 변수 값을 한글로 요청
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	String name = request.getParameter("name");
	
	System.out.print(id+pw+name);
 	//객체화
	Member member = new Member(id, pw, name);
	// DB 처리
	
	// 파일 처리
	FileOutputStream fileOutputStream = new FileOutputStream("D:/조지훈/JSP/src/main/java/Test/smemberList.txt", true); // true까지 넣어야 이어쓰기 가능
	String outstring = id+","+pw+","+name+"\n";
	
	fileOutputStream.write( outstring.getBytes());
	
	// 페이지 이동
	response.sendRedirect("main.jsp");
	%>
</body>
</html>