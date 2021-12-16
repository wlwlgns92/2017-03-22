<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
li{
list-style-type: none;
}
</style>
</head>
<body>
		<%@include file="header.jsp"%>
		
		<div id="carouselcontent" class="carousel slide" data-ride="carousel" data-interval="3000">
			<ol>
				<li data-target="#carouselcontent" data-slide-to="0" class="active"></li>
				<li data-target="#carouselcontent" data-slide-to="1"></li>
				<li data-target="#carouselcontent" data-slide-to="2"></li>
				<li data-target="#carouselcontent" data-slide-to="3"></li>
				<li data-target="#carouselcontent" data-slide-to="4"></li>
			</ol>
			<div class="carousel-inner" style="text-align: center;">
				<div class="carousel-item active"><img class="img-fluid mx-auto" src="../img/coffee1.jpg" style="width: 70%; height: 500px;"></div>
				<div class="carousel-item"><img src="../img/coffee2.jpg" style="width: 70%; height: 500px;"></div>
				<div class="carousel-item"><img src="../img/coffee3.jpg" style="width: 70%; height: 500px;"></div>
				<div class="carousel-item"><img src="../img/coffee4.jpg" style="width: 70%; height: 500px;"></div>
				<div class="carousel-item"><img src="../img/coffee5.jpg" style="width: 70%; height: 500px;"></div>
			</div>
			<a class="carousel-control-prev" href="#carouselcontent" data-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</a>
			<a class="carousel-control-next" href="#carouselcontent" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>
		</div>
		
		
		<%@include file="footer.jsp"%>
</body>
</html>