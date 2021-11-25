<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
	*{padding: 0; margin:0;}
	.box{width: 1100px; margin:0 auto;}
	header { height: 150px;}
	li{ list-style-type: none;}
	#logo{float:left; margin: 45px 0 0 60px;}
	#menus{float: right; margin-right: 45px; text-align: right;}
	#menus li {display: inline;}
	#top_menu{ margin: 20px 0 30px 0;}
	#top_menu li { margin: 30px 0 0 10px;}
	#main_menu{ margin-top: 20px; font-size: 20px; color: black; }
	#main_menu li { 
		margin: 50px 0 0 80px;
		font-size: 20px;
		font-weight: bold;
		font-family: "궁서"
		}
	</style>
</head>
<body>
	<header>
	<div class="box">
		<div id="logo">
			<img alt="" src="img/logo2.png">
		</div>
		<div id="menus">
			<ul id="top_menu">
				<li>김지영</li> <li>|</li>
				<li> 로그아웃 </li> <li>|</li>
				<li> 정보수정 </li>
			</ul>
			<ul id="main_menu">
				<li>HOME</li>
				<li>출석부</li>
				<li>작품갤러리</li>
				<li>게시판</li>
			</ul>
		</div>
		</div>
	</header>
</body>
</html>