<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<%@include file="header.jsp" %>
	
	<div id="carouselcontent" class="carousel slide" data-ride=" carousel" data-interval="3000">
		<ol>
			<li data-target="#carouselcontent" data-slide-to="0" class="active"></li>
		</ol>
	
		<div class="carousel-inner">
			<div class="carousel-item active"><img src=""> </div>
		</div>
		
		<a class="carousel-control-prev" href="#carouselcontent" data-slide="prev">
			<span class="carousel-control-prev-incon"></span>
		</a>
		<a class="carousel-control-next" href="#carouselcontent" data-slide="next">
			<span class="carousel-control-next-incon"></span>
		</a>
	</div>	
	
	<%@include file="footer.jsp" %>
	
</body>
</html>