<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	.carousel-item{
		width: 50% !important; /* �켱���� : !important > id > class > �µ� > *   */
		height: 200px; 
	 }
	.container{border: solid 1px black;}
		
	</style>
</head>
<body>
	<%@include file="1.Bootstrap.jsp" %>
	
	<h3> �̹��� �����̵� [ĳ����]</h3>
	<div class="container"> 
		<div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="1000">
			<!-- carousel slide : �̹��� �����̵� data-interval : 1000/1�� -->
			
			<ol class="carousel-indicators">
				<li data-target="#carouselcontents" data-slide-ta="0" class="active"> </li>
				<li data-target="#carouselcontents" data-slide-ta="1"> </li>
				<li data-target="#carouselcontents" data-slide-ta="2"> </li>
			</ol>
			<div class="carousel-item active">
				<img alt="ù��° �����̵�" src="ȣ�����.jpg">
				<div class="carousel-caption">
				<h3>ȣ�����</h3>
				<p>�ȳ��ϼ��� ȣ����� �Դϴ�.</p>
				</div>
			</div>
			<div class="carousel-item">
				<img alt="�ι�° �����̵�" src="�ӽ�.jpg">
			</div>
			<div class="carousel-item">
				<img alt="����° �����̵�" src="ȣ�����.jpg">
			</div>
			
			
			<!-- ��ư -->
			<a class="carousel-control-prev" href="#carouselcontents" data-slide="prev"> <!-- ���� �̹��� ��ư -->
				<span class="carousel-control-prev-icon"></span>		
			</a>
			<a class="carousel-control-next" href="#carouselcontents" data-slide="next"> <!-- ���� �̹��� ��ư -->
				<span class="carousel-control-next-icon"></span>		
			</a>
		</div>
		
	</div>
	
</body>
</html>