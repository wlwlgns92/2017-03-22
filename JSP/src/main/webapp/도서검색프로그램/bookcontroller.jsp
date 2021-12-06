<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<%
	
	String search = request.getParameter("search");
	
	for(int i = 0; i < booklist.length i++) {
		if(booklist.get(i).getBookname().contains(search)) {
			out.print(booklist.get(i).getBookname());
		}
	}
	%>
</body>
</html>