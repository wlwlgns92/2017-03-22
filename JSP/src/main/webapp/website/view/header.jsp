<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<!-- 부트스트랩 설정 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<!-- 본인 css 호출 -->
	<link rel="stylesheet" href="/jsp/website/view/css/main.css">
</head>
<body>
	<!-- 부트스트랩 js 설정 -->
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<!--  본인 js 호출 -->
	<script type="text/javascript" src="/JSP/website/js/main.js"></script>
	<!-- 다음 주소 api 호출 -->
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	
	
		<h3> 헤더 부분 </h3>
		
		<%
			String loginid = (String)session.getAttribute("loginid");
		%>
		<div> <a href="/JSP/website/view/main.jsp">로고</a> </div>
		
		
		<ul>
			<%
			
			if(loginid != null ) {
				if(loginid.equals("admin")) {
			%>	
				<li> 관리자 </li>
			<% } %>
			
				<li><a href="/JSP/website/view/member/myinfo.jsp">  회원정보 </a></li>
				<li> 로그아웃 </li>
			<%	
				
			%>	
				
			<%
			}else {
			%>
			<li> <a href="/JSP/website/view/member/signup.jsp"> 회원가입 </a> </li>
			<li> <a href="/JSP/website/view/member/login.jsp"> 로그인 </a> </li>
			<%	
			}
			%>
	
		</ul>
</body>
</html>