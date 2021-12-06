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
	<br><br><br><br>
	<h3> 회원가입 구역</h3>
	<br><br><br>
	<form action="signupcontroller.jsp" method="post"> <!-- action="이동페이지경로" method=" 전송방식 get or post " -->
		<input type="text" name="id" placeholder="Enter ID"> <br>
		<input type="password" name="password" placeholder="Enter password"><br>
		<input type="text" name="name" placeholder="Enter Name"> <br>
		<input type="submit" value="회원가입"> <!-- submit 클릭시 form 전송 -->
	</form>
</body>
</html>