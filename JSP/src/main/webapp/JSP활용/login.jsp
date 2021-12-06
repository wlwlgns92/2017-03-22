<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	
	<h1> 로그인 페이지 </h1>
	<br><br><br>
	<form action="logincontroller.jsp" method="post">
		아이디 : <input type="text" name="id" placeholder="아이디 입력"> <br>
		비밀번호 : <input type="password" name="password" placeholder="비밀번호 입력"> <br>
		<input type="submit" value="로그인">
	</form>
	<%	String result = request.getParameter("result");
		if(result != null) { %>
		<h4> 로그인 실패 </h4>
	<% } %>
</body>
</html>