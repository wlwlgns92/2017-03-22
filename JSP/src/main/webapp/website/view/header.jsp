<%@page import="dto.Login"%>
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
			Login login = (Login)session.getAttribute("login");
			String loginid = null; // 전역변수로 사용하기 위해 if문 밖에서 선언 / null을 넣지않으면 초기값이 없기때문에 비교(같다,작다,크다)를 하지 못한다.
			if(login != null) {	// 세션이 있을경우에만 로그인 아이디를 부여 
				loginid = login.getM_id();
			}
		%>
		<div class="fixed-top bg-white">	<!-- 상단 고정 , 배경 흰색 -->
			<div class="container"> <!-- 박스권 -->
				<header class="py-3">	<!-- p : 안쪽여백  // m : 바깥여백	// y : 위아래 , x : 왼쪽오른쪽 -->
					<div class="row">	<!-- 가로배치 -->
						<div class="col-md-4 offset-4 text-center"> <!-- 로고[웹사이트명] -->
							 <a href="/JSP/website/view/main.jsp" class="header_logo">SUPER CAR SHOP </a> 
						</div>
						<div class="col-md-4 d-flex justify-content-end">	<!-- 상단 메뉴 -->
							<ul class="nav">
								<%
								
								if(loginid != null ) {
									if(loginid.equals("admin")) {
								%>	
									<li><a href="/JSP/website/view/admin/dashboard.jsp">  관리자 </a> </li>
								<% } %>
								
									<li><a href="/JSP/website/view/member/myinfo.jsp">  회원정보 </a></li>
									<li><a a href="/JSP/website/controller/logoutcontroller.jsp"> 로그아웃 </a></li>
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
						</div>
					</div>
				</header>
				<!-- 메인 메뉴  -->
				<nav class="navbar navbar-expand-lg navbar-light bg-white">
					<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main_manu">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="main_manu">
						<ul class="navbar-nav col-md-12 justify-content-between">
							<li class="nav-item"> <a href="#" class="nav-link">신차</a> </li>
							<li class="nav-item"> <a href="#" class="nav-link">베스트</a> </li>
							<li class="nav-item"> <a href="#" class="nav-link">브랜드별</a> </li>
							<li class="nav-item"> <a href="#" class="nav-link">국산차</a> </li>
							<li class="nav-item"> <a href="#" class="nav-link">수입차</a> </li>
							<li class="nav-item"> <a href="#" class="nav-link">이벤트</a> </li>
							<li class="nav-item"> <a href="#" class="nav-link">구매후기</a> </li>
							<li class="nav-item"> <a href="/JSP/website/view/board/boardlist.jsp" class="nav-link">고객센터</a> </li>					
						</ul>
					</div>
				</nav>
			</div>
		</div>
	<!-- 헤더 end -->
	
		<br><br><br><br><br><br><br>
</body>
</html>