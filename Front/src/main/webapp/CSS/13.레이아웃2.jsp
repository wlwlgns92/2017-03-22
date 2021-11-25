<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	#web{
	 margin: 0 auto;
	 border: solid 1px red;
	 }
	 #header{
	 	background-color: green;
	 	text-align: center;
	 }
	 #container{
	 	width: 1200px;
	 	background-color: orange;
	 	margin: 0 auto;
	 	text-align: center;
	 	font-size: 40px;
	 	height: 600px;
	 }
	 #footer{
	 	background-color: gray;
	 	text-align: center;
	 	font-size: 40px;
	 	clear: both;
	 }
	 #left{
		 width: 900px;
		 background-color: red;
		 float: left;
	 }
	 #right{
	 	width: 300px;
	 	background-color: blue;
	 	float: right;
	 }
	 
	 header{ text-align: center; background-color: green; font-size: 40px;}
	 footer{ background-color: gray; text-align: center; font-size: 40px; clear: both; }
	 section{ width: 900px; background-color: red; height: 600px; float: left;}
	 aside{ width: 300px; background-color: blue; height: 500px; float: right;}
	</style>
</head>
<body>
	<div id="web"> 
		<div id="header"> 상단 헤더 </div>
		<div id="container"> 
			<div id="left">메인 왼쪽 메뉴</div>
			<div id="right">메인 오른쪽 메뉴</div>
		</div>
		<div id="footer"> 하단 푸터 </div>
	</div>
	
	<div id="web">
	<header> 상단 헤더 </header>
	<div id="container">
		<section> 메인 섹션</section>
		<aside> 사이드바 </aside>
	</div>
	<footer> 하단 푸터 </footer>
	</div>
	
</body>
</html>