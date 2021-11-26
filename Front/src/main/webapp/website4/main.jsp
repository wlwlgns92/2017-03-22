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
		
		<!-- ���� �����̵� ��ġ �˷��ִ� ����Ʈ -->
		<ol class="carousel-indicators">
			<li data-target="#carouselcontent" data-slide-to="0" class="active"></li>
			<li data-target="#carouselcontent" data-slide-to="1"></li>
			<li data-target="#carouselcontent" data-slide-to="2"></li>
			<li data-target="#carouselcontent" data-slide-to="3"></li> 
		</ol>
		
		<!-- carousel�� �̹��� �ֱ� -->
		<div class="carousel-inner">
			<div class="carousel-item active"><img src="img/�빮1.jpeg"></div>
			<div class="carousel-item"><img src="img/�빮2.jpeg"></div>
			<div class="carousel-item"><img src="img/�빮3.jpeg"></div>
			<div class="carousel-item"><img src="img/�빮4.jpeg"></div>
		</div>
		
		<!-- carousel �̹��� �̵� ��ư -->
		<a class="carousel-control-prev" href="#carouselcontent" data-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</a>
		
		<a class="carousel-control-next" href="#carouselcontent" data-slide="next">
			<span class="carousel-control-next-icon"></span>
		</a>
		
	</div>
	<!-- carousel end -->
	
	<hr> <!-- ���м� -->
	<div class="container text-center">
		<h3> New ARRIVAL </h3>
		<P> �Ż�ǰ </P>
	</div>
	
	
	<!-- ��ǰ start -->
	<hr> <!-- ���м� -->
	<div class="container"> <!-- 1300px �ڽ��� -->
		<div class="row mb-2">	<!-- ���� 12 �׸��� mb-2 = margin-bottom-2 -->
			<div class="col-md-4 col-sm-6"> <!-- col-md-4 : 700~900, col-sm-6 : 570~760 my : ���Ʒ� margin-->
				<div class="card">
					<img class="card-img-top" src="img/�е�.gif"> <!-- card-img-top : ī�� ��� �̹��� -->
					<div class="card-body"><!-- ī�� ���� -->
						<p class="card-text"> ��Ƽ�� ��� �е� </p> 
						<hr>
						<p class="item p-1">
							�����̾� ����������������
							�����������<br><br>
							<span class="price mr-2"> 79,000</span> 75,900��<br>
							<span class="badge badge-pill badge-warning"> �ֹ����� </span>
							<span class="badge badge-pill badge-danger"> ǰ���ӹ� </span>
						</p>
					</div>
				</div>
			</div>
		
		
			<div class="col-md-4 col-sm-6">
				<div class="card">
					<img class="card-img-top" src="img/�е�.gif">
					<div class="card-body">
						<p class="card-text"> ��Ƽ�� ��� �е� </p> 
						<hr>
						<p class="item p-1">
							�����̾� ����������������
							�����������<br><br>
							<span class="price"> 79,000</span> <br>
							<span class="badge badge-pill badge-warning"> �ֹ����� </span>
							<span class="badge badge-pill badge-danger"> ǰ���ӹ� </span>
						</p>
					</div>
				</div>
			
			</div>
		
			<div class="col-md-4 col-sm-6">
				<div class="card">
					<img class="card-img-top" src="img/�е�.gif">
					<div class="card-body">
						<p class="card-text"> ��Ƽ�� ��� �е� </p> 
						<hr>
						<p class="item p-1">
							�����̾� ����������������
							�����������<br><br>
							<span class="price"> 79,000</span> <br>
							<span class="badge badge-pill badge-warning"> �ֹ����� </span>
							<span class="badge badge-pill badge-danger"> ǰ���ӹ� </span>
						</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-4 col-sm-6">
				<div class="card">
					<img class="card-img-top" src="img/�е�.gif">
					<div class="card-body">
						<p class="card-text"> ��Ƽ�� ��� �е� </p> 
						<hr>
						<p class="item p-1">
							�����̾� ����������������
							�����������<br><br>
							<span class="price"> 79,000</span> <br>
							<span class="badge badge-pill badge-warning"> �ֹ����� </span>
							<span class="badge badge-pill badge-danger"> ǰ���ӹ� </span>
						</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-4 col-sm-6">
				<div class="card">
					<img class="card-img-top" src="img/�е�.gif">
					<div class="card-body">
						<p class="card-text"> ��Ƽ�� ��� �е� </p> 
						<hr>
						<p class="item p-1">
							�����̾� ����������������
							�����������<br><br>
							<span class="price"> 79,000</span> <br>
							<span class="badge badge-pill badge-warning"> �ֹ����� </span>
							<span class="badge badge-pill badge-danger"> ǰ���ӹ� </span>
						</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-4 col-sm-6">
				<div class="card">
					<img class="card-img-top" src="img/�е�.gif">
					<div class="card-body">
						<p class="card-text"> ��Ƽ�� ��� �е� </p> 
						<hr>
						<p class="item p-1">
							�����̾� ����������������
							�����������<br><br>
							<span class="price"> 79,000</span> <br>
							<span class="badge badge-pill badge-warning"> �ֹ����� </span>
							<span class="badge badge-pill badge-danger"> ǰ���ӹ� </span>
						</p>
					</div>
				</div>	
		</div>
		</div>
	</div>
	<!-- ��ǰ end -->
	
	<%@include file="footer.jsp" %>
</body>
</html>