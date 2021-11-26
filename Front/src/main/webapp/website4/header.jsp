<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>쇼핑모올</title>
	
	
	<!-- 부트스트랩 가져오기 css -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	<!-- 직접 작성한 css 가져오기 -->
	<link href="css/main.css" rel="stylesheet">
	<!-- 상대경로[현재파일 위치기준] -->
	
	<!-- 아이콘 사용 -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
</head>
<body>
		
		<!-- 헤더 start -->
		<div class="fixed-top bg-white"> <!-- 헤더 고정 -->
		<div class="container"> <!-- 전체 헤더 메뉴 -->
			<header class="py-3"> <!-- 상단 메뉴 -->
				<div class="row justify-content-between align-items-center">
					<div class="col-4 offset-4 text-center">
						<a href="main.jsp" class="text-dark header-logo">안산 남자 쇼핑몰</a>
					</div>
					
					<div class="col-4 d-flex justify-content-end align-items-center">
						<ul class="nav header-topmenu"> <!-- "nav" 넣으면 가로로 바뀐다. -->
							<li> <a href="#" class="text-info mx-1"> 로그인</a> | </li>
							<li> <a href="#" class="text-info mx-1"> 회원가입</a> | </li>
							<li> <a href="#" class="text-info mx-1"> 나의쇼핑</a> | </li>
						</ul>
					</div>
					
					
				</div>
			</header>
			
			<nav class="navbar navbar-expand-lg navbar-light bg-white"> <!-- 본 메뉴 -->
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#header-mainmenu">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="header-mainmenu">
					<ul class="navbar-nav col-lg-12 justify-content-between" >
						<li class="nav-item"> <a href="#" class="nav-link"> 베스트 상품</a></li>
						<li class="nav-item"> <a href="#" class="nav-link"> 슈트 </a></li>
						<li class="nav-item"> <a href="#" class="nav-link"> 아우터 </a></li>
						<li class="nav-item"> <a href="#" class="nav-link"> 상의</a></li>
						<li class="nav-item"> <a href="#" class="nav-link"> 니트 </a></li>
						<li class="nav-item"> <a href="#" class="nav-link"> 셔츠 </a></li>
						<li class="nav-item"> <a href="#" class="nav-link"> 바지 </a></li>
						<li class="nav-item"> <a href="#" class="nav-link"> 신발 </a></li>
						<li class="nav-item"> <a href="#" class="nav-link"> 악세사리 </a></li>
						<li class="nav-item"> <a href="#" class="nav-link"> 스타일 </a></li>
						<li class="nav-item"> <a href="#" class="nav-link"> 리뷰 </a></li>
						<li class="nav-item"> <a href="board.jsp" class="nav-link"> 고객센터 </a></li>
						<li class="nav-item"> <a href="#" class="nav-link"> <i class="fas fa-search"></i> </a></li>	 <!-- 아이콘 사이즈변경은 fx-숫자x -->
					</ul>
				</div>
			</nav>		
		</div>
		</div>
		<!-- 헤더 end -->
		
		<!-- carousel -->
		
		
	<!-- 부트스트랩 가져오기 js/jquery -->	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>