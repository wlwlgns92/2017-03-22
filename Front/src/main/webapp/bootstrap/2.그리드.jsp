<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
	*{ border: solid 1px red; box-sizing: border-box; padding: 10px; }
	row{ margin-bottom: 4px; margin-top: 4px;}
	
	</style>
</head>
<body>
	
	<%@include file="1.Bootstrap.jsp" %>
	
	<h1> 박스모델 : container </h1>
	<h1> 그리드 : .col-xs , .col-sm- , .col-md- , .col-lg- </h1>
		<ul>
			<li>768px 이하 : .col-xs </li>
			<li>768px 이상 : .col-sm </li>
			<li>992px 이상 : .col-md </li>
			<li>1200px 이상 : .col-lg</li>
		</ul>
	<div class="container"> <!-- 미리 만들어진 container : 박스모델 클래스 --> 
		<div class="row">
			<div class="col-md-1">.col-md-1	</div>
			<div class="col-md-1">.col-md-1	</div>
			<div class="col-md-1">.col-md-1	</div>
			<div class="col-md-1">.col-md-1	</div>
			<div class="col-md-1">.col-md-1	</div>
			<div class="col-md-1">.col-md-1	</div>
			<div class="col-md-1">.col-md-1	</div>
			<div class="col-md-1">.col-md-1	</div>
			<div class="col-md-1">.col-md-1	</div>
			<div class="col-md-1">.col-md-1	</div>
			<div class="col-md-1">.col-md-1	</div>
			<div class="col-md-1">.col-md-1	</div>
		</div>
		<div class="row">
			<div class="col-md-8"> </div>
			<div class="col-md-4"> </div>
		</div>
		
		<div class="row">
			<div class="col-md-4"> </div>
			<div class="col-md-4"> </div>
			<div class="col-md-4"> </div>
		</div>
		
		<div class="row">
			<div class="col-md-6"> </div>
			<div class="col-md-6"> </div>
		</div>
	</div>
	
	
	<br><br><br>
	<h3> 하위 그리드 </h3>
	<div class="container">
		<div class="row"> <!-- 하위 그리드 -->
			<div class="col-md-8">col-md-8
				<div class="row">
					<div class="col-md-4" style="background-color: #eeeeee;">
						내부 12 그리드 중 4개 
					</div>
					<div class="col-md-8" style="background-color: #eeeeee;">
						내부 12 그리드 중 8개 
					</div>
				</div>	
			</div>
			<div class="col-md-4">col-md-4
				<div class="row">
					<div class="col-md-6" style="background-color: #eeeeee;">
						내부 12 그리드 중 6개 
					</div>
					<div class="col-md-6" style="background-color: #eeeeee;">
						내부 12 그리드 중 6개 
					</div>
				
				</div>
			</div>
		</div>
	</div>
	
	<h3> offset 위치 잡기 [ offset-숫자 : 숫자만큼 칸 띄우기 ]</h3>
	<div class="container">
		<div class="row">
			<div class="col-md-5">col-md-5</div>
			<div class="col-md-5 offset-2">col-md-5</div>
		</div>
		
		<div class="row">
			<div class="col-md-4">col-md-4</div>
			<div class="col-md-7 offset-1">col-md-7</div>
		</div>
	</div>
	
	<h3> 그리드 부족하거나 넘었을때</h3>
	<div class="container">
		<div class="row">
			<div class="col-md-5">col-md-5</div>
			<div class="col-md-8">col-md-8</div>
		</div>
		<div class="row">
			<div class="col-md-4">col-md-4</div>
			<div class="col-md-7">col-md-7</div>
		</div>
		
	</div>
	
	
	
</body>
</html>