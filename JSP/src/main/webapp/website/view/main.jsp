<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아무거나</title>
</head>
<body>	
		<%@include file="header.jsp" %>
		<h3> 메인 부분 </h3>
		<%
		MemberDao.getMemberDao();
		%>
		<%@include file="footer.jsp" %>
</body>
</html>