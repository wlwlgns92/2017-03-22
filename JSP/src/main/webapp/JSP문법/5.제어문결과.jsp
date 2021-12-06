<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<%
		request.setCharacterEncoding("EUC-KR"); // 요청시 사용되는 인코딩 타입
		String name = request.getParameter("name");  // request : 요청객체 .getParameter("변수명") : 해당 변수명 요청
		String color = request.getParameter("color");
	%>
</head>
<body bgcolor=<%=color %>>

	
	
	이름 : <%=name %>
</body>
</html>