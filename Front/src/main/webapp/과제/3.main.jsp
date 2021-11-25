<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	.carousel-item img{ width: 100%; }
	</style>
 <!-- 부트스트랩의 css 가져오기   -->
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
   
</head>
<body>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<!-- 메인 -->
	<div class="box">	
		<div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="3000">
			<ol>
				<li data-target="#carouselcontents" data-slide-ta="0" class="active"> </li>
				<li data-target="#carouselcontents" data-slide-ta="1"> </li>
				<li data-target="#carouselcontents" data-slide-ta="2"> </li>
				<li data-target="#carouselcontents" data-slide-ta="3"> </li>
			</ol>
			
			<div class="carousel-item active">
				<img alt="첫번째 슬라이드" src="더블오라이저.jpg">
			</div>
			<div class="carousel-item">
				<img alt="두번째 슬라이드" src="엑시아.jpg">
			</div>
			<div class="carousel-item">
				<img alt="세번째 슬라이드" src="저스티스.jpg">
			</div>
			<div class="carousel-item">
				<img alt="네번째 슬라이드" src="프리덤.jpg">
			</div>
			
			<a class="carousel-control-prev" href="#carouselcontents" data-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</a>
			<a class="carousel-control-next" href="#carouselcontents" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>
		</div>
	</div>	
	
</body>
</html>