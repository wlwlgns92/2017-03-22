<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		//1. 쿠키와 달리 세션은 내장객체(미리만들어진 객체)
		session.setAttribute("id", "qweqwe"); // 세션 저장소 [ 톰캣 ]
		session.setAttribute("pw", "123"); //
		session.setMaxInactiveInterval(60); // 현재 60초 [ 기본 생명주기가 30분(초기값 30분) [ 30분간 행동을 안하면 사망 ] ]
	%>
	
	<p>세션 만들기</p>
	<p> <a href="13.세션테스트.jsp">확인 </a>
</body>
</html>