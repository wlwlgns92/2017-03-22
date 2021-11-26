<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%@include file="header.jsp" %>
	
	<!-- carousel start -->
	<div id="carouselcontent" class="carousel slide" data-ride="carousel" data-interval="2000">
		
		<!-- 현재 슬라이드 위치 알려주는 리스트 -->
		<ol class="carousel-indicators">
			<li data-target="#carouselcontent" data-slide-to="0" class="active"></li>
			<li data-target="#carouselcontent" data-slide-to="1"></li>
			<li data-target="#carouselcontent" data-slide-to="2"></li>
			<li data-target="#carouselcontent" data-slide-to="3"></li> 
		</ol>
		
		<!-- carousel에 이미지 넣기 -->
		<div class="carousel-inner">
			<div class="carousel-item active"><img src="img/대문1.jpeg"></div>
			<div class="carousel-item"><img src="img/대문2.jpeg"></div>
			<div class="carousel-item"><img src="img/대문3.jpeg"></div>
			<div class="carousel-item"><img src="img/대문4.jpeg"></div>
		</div>
		
		<!-- carousel 이미지 이동 버튼 -->
		<a class="carousel-control-prev" href="#carouselcontent" data-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</a>
		
		<a class="carousel-control-next" href="#carouselcontent" data-slide="next">
			<span class="carousel-control-next-icon"></span>
		</a>
		
	</div>
	<!-- carousel end -->
	
	<hr> <!-- 구분선 -->
	<div class="container text-center">
		<h3> New ARRIVAL </h3>
		<P> 신상품 </P>
	</div>
	
	
	<!-- 제품 start -->
	<hr> <!-- 구분선 -->
	<div class="container"> <!-- 1300px 박스권 -->
		<div class="row mb-2">	<!-- 가로 12 그리드 mb-2 = margin-bottom-2 -->
			<div class="col-md-4 col-sm-6"> <!-- col-md-4 : 700~900, col-sm-6 : 570~760 my : 위아래 margin-->
				<div class="card">
					<img class="card-img-top" src="img/패딩.gif"> <!-- card-img-top : 카드 상단 이미지 -->
					<div class="card-body"><!-- 카드 내용 -->
						<p class="card-text"> 액티브 멜론 패딩 </p> 
						<hr>
						<p class="item p-1">
							프리미엄 고고고고고고고고고고고고고고고
							고고고고고고고고고고<br><br>
							<span class="price mr-2"> 79,000</span> 75,900원<br>
							<span class="badge badge-pill badge-warning"> 주문폭주 </span>
							<span class="badge badge-pill badge-danger"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
		
		
			<div class="col-md-4 col-sm-6">
				<div class="card">
					<img class="card-img-top" src="img/패딩.gif">
					<div class="card-body">
						<p class="card-text"> 액티브 멜론 패딩 </p> 
						<hr>
						<p class="item p-1">
							프리미엄 고고고고고고고고고고고고고고고
							고고고고고고고고고고<br><br>
							<span class="price"> 79,000</span> <br>
							<span class="badge badge-pill badge-warning"> 주문폭주 </span>
							<span class="badge badge-pill badge-danger"> 품절임박 </span>
						</p>
					</div>
				</div>
			
			</div>
		
			<div class="col-md-4 col-sm-6">
				<div class="card">
					<img class="card-img-top" src="img/패딩.gif">
					<div class="card-body">
						<p class="card-text"> 액티브 멜론 패딩 </p> 
						<hr>
						<p class="item p-1">
							프리미엄 고고고고고고고고고고고고고고고
							고고고고고고고고고고<br><br>
							<span class="price"> 79,000</span> <br>
							<span class="badge badge-pill badge-warning"> 주문폭주 </span>
							<span class="badge badge-pill badge-danger"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-4 col-sm-6">
				<div class="card">
					<img class="card-img-top" src="img/패딩.gif">
					<div class="card-body">
						<p class="card-text"> 액티브 멜론 패딩 </p> 
						<hr>
						<p class="item p-1">
							프리미엄 고고고고고고고고고고고고고고고
							고고고고고고고고고고<br><br>
							<span class="price"> 79,000</span> <br>
							<span class="badge badge-pill badge-warning"> 주문폭주 </span>
							<span class="badge badge-pill badge-danger"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-4 col-sm-6">
				<div class="card">
					<img class="card-img-top" src="img/패딩.gif">
					<div class="card-body">
						<p class="card-text"> 액티브 멜론 패딩 </p> 
						<hr>
						<p class="item p-1">
							프리미엄 고고고고고고고고고고고고고고고
							고고고고고고고고고고<br><br>
							<span class="price"> 79,000</span> <br>
							<span class="badge badge-pill badge-warning"> 주문폭주 </span>
							<span class="badge badge-pill badge-danger"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-4 col-sm-6">
				<div class="card">
					<img class="card-img-top" src="img/패딩.gif">
					<div class="card-body">
						<p class="card-text"> 액티브 멜론 패딩 </p> 
						<hr>
						<p class="item p-1">
							프리미엄 고고고고고고고고고고고고고고고
							고고고고고고고고고고<br><br>
							<span class="price"> 79,000</span> <br>
							<span class="badge badge-pill badge-warning"> 주문폭주 </span>
							<span class="badge badge-pill badge-danger"> 품절임박 </span>
						</p>
					</div>
				</div>	
		</div>
		</div>
	</div>
	<!-- 제품 end -->
	
	<%@include file="footer.jsp" %>
</body>
</html>