<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	.carousel-item{
		width: 50% !important; /* 우선순위 : !important > id > class > 태드 > *   */
		height: 200px; 
	 }
	.container{border: solid 1px black;}
		
	</style>
</head>
<body>
	<%@include file="1.Bootstrap.jsp" %>
	
	<h3> 이미지 슬라이드 [캐러셀]</h3>
	<div class="container"> 
		<div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="1000">
			<!-- carousel slide : 이미지 슬라이드 data-interval : 1000/1초 -->
			
			<ol class="carousel-indicators">
				<li data-target="#carouselcontents" data-slide-ta="0" class="active"> </li>
				<li data-target="#carouselcontents" data-slide-ta="1"> </li>
				<li data-target="#carouselcontents" data-slide-ta="2"> </li>
			</ol>
			<div class="carousel-item active">
				<img alt="첫번째 슬라이드" src="호나우두.jpg">
				<div class="carousel-caption">
				<h3>호나우두</h3>
				<p>안녕하세요 호나우두 입니다.</p>
				</div>
			</div>
			<div class="carousel-item">
				<img alt="두번째 슬라이드" src="머신.jpg">
			</div>
			<div class="carousel-item">
				<img alt="세번째 슬라이드" src="호나우두.jpg">
			</div>
			
			
			<!-- 버튼 -->
			<a class="carousel-control-prev" href="#carouselcontents" data-slide="prev"> <!-- 이전 이미지 버튼 -->
				<span class="carousel-control-prev-icon"></span>		
			</a>
			<a class="carousel-control-next" href="#carouselcontents" data-slide="next"> <!-- 다음 이미지 버튼 -->
				<span class="carousel-control-next-icon"></span>		
			</a>
		</div>
		
	</div>
	
</body>
</html>