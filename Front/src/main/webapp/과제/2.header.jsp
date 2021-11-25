<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	
	<style type="text/css">
	
	*{margin:0; padding:0; box-sizing: border-box;}
	
	li{ list-style-type: none;}
	header{ position: relative; height: 80px; border-bottom: solid 1px black;}
	header .logo{ position: absolute; left: 30px; padding-top: 20px;}
	header .mainmenu{position: absolute; ; right: 30px; padding-top:20px;}
	header .mainmenu li{ display: inline; margin-right: 50px;}
	
	a{text-decoration: none; color: black;}
	
	header .serch{ position: absolute; top: 45px; right:85px;}
	header .serch li{ display: inline; }
	
	
	[class*="col_"]{ float: left; }
		.col_s_1{ width: 8.33%;}	.col_s_2{ width: 16.66%;}	.col_s_3{ width: 25%;}
		.col_s_4{ width: 33.33%;}	.col_s_5{ width: 41.66%;}	.col_s_6{ width: 50%;}
		.col_s_7{ width: 58.33%;}	.col_s_8{ width: 66.66%;}	.col_s_9{ width: 75%;}
		.col_s_10{ width: 83.33%;} .col_s_11{ width: 91.66%;} .col_s_12{ width: 100%; }
		
		@media only screen and (min-width: 770px) {
			/* 태블릿 CSS*/
		.col_m_1{ width: 8.33%;}  .col_m_2{ width: 16.66%;}	.col_m_3{ width: 25%;}
		.col_m_4{ width: 33.33%;} .col_m_5{ width: 41.66%;}	.col_m_6{ width: 50%;}
		.col_m_7{ width: 58.33%;} .col_m_8{ width: 66.66%;}	.col_m_9{ width: 75%;}
		.col_m_10{ width: 83.33%;}.col_m_11{ width: 91.66%;}.col_m_12{ width: 100%; }
		.box{position: relative; max-width: 1200px;	margin: 0 auto;}
		}
		
		@media only screen and ( min-width: 1200px) {
			/* 데탑 CSS */
		.col_1{ width: 8.33%;} .col_2{ width: 16.66%;} .col_3{ width: 25%;}
		.col_4{ width: 33.33%;} .col_5{ width: 41.66%;} .col_6{ width: 50%;}
		.col_7{ width: 58.33%;} .col_8{ width: 66.66%;} .col_9{ width: 75%;}
		.col_10{ width: 83.33%;} .col_11{ width: 91.66%;} .col_12{ width: 100%; }
		.box{position: relative; max-width: 1200px;	margin: 0 auto;}
		}
	</style>
</head>
<body>
		
	<header>
		<div class="box">
			<h2 class="logo"><a href="index.jsp">Ezen 건담</a></h2>
			<ul class="mainmenu">
				<li><a href="#">건담프라모델</a></li>
				<li><a href="#">피규어</a></li>
				<li><a href="#">프라모델공구</a></li>
				<li><a href="#">고객센터</a></li>
			</ul>
			<ul class="serch">
				<li><input type="text"></li>
				<li><button type="button" class="btn-success"> 검색 </button></li>
			</ul> 
		</div>
	</header>
	
	123
</body>
</html>