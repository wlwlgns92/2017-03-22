<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3> 스크립트 문</h3>
	<br> <%! int one; String msg;  %>
	<br> <% int one = 31; String msg = "서블릿 스크립트"; %>
	
	<br> one : <%=one %> <!-- 스크립트 -->
	<br> msg : <%=msg %> <!-- 스크립트 -->
	
	<br> 선언문 one : <%=this.one %>
	<br> 선언문 msg : <%=this.msg %>
	<br> 서블릿 경로 : <%=application.getRealPath("/") %>  <!-- 서블릿 경로 -->
	
	<%
		float f = 2.3f;
		int i = Math.round(f);
		Date date = new Date(); // java 라이브러리 호출 가능
	%>
	<br> 실수 f의 반올림값은 : <%=f %>
	<br> 현재 날짜와 시간은 : <%=date.toString() %>
</body>
</html>