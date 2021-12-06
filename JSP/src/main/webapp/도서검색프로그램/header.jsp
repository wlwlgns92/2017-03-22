<%@page import="java.io.FileInputStream"%>
<%@page import="Test.Book"%>
<%@page import="Test.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> header 페이지 구역</h3>

	<form action="header.jsp">
	<input type="text" name="search" placeholder="검색 입력"> 
	<input type="submit" value="검색">
	</form>
	<% String[] booklist = { "된다! 네이버 블로그&포스트","스프링 부트 실전 활용 마스터","Tucker의 Go 언어 프로그래밍","혼자 공부하는 C 언어"}; %>
	
	
	
	
</body>
</html>