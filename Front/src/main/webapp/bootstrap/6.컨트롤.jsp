<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file="1.Bootstrap.jsp" %>
	<h3> 컨트롤 클래스 </h3>
	<ul>
		<li> 1. form-control</li>
	</ul>
	
	<div class="container">
		<input type="text" class="form-control">
		<input type="password" class="form-control">
		<input type="datetime" class="form-control">
		<input type="datetime-local" class="form-control">
		<textarea rows="5" cols="5" class="form-control"></textarea>
		
		<div class="checkbox">
			<input type="checkbox">
		</div>
		
		<div class="radio">
			<input type="radio">
		</div>
		<div class="row">
			<div class="col-md-2">
				<input type="text" class="form-control">
			</div>
			<div class="col-md-2 offset-3">
				<input type="text" class="form-control">
			</div>
			<div class="col-md-2 offset-3">
				<input type="text" class="form-control">
			</div>
		</div>
	</div>
	
	<h3> 버튼 </h3>
		<button type="button" class="btn"> 버튼 </button>
		<button type="button" class="btn-default"> 버튼 </button>
		<button type="button" class="btn-success"> 버튼 </button>
		<button type="button" class="btn-info"> 버튼 </button>
		<button type="button" class="btn-danger"> 버튼 </button>
	
	<h3> 이미지 </h3>
		<div class="col-sm-6">
			<img src="호나우두.jpg">
		</div>	
		<div class="col-sm-6">
			<img src="호나우두.jpg" class="rounded ">
		</div>
		<div class="col-sm-6">
			<img src="호나우두.jpg" class="rounded-circle img-fluid">  
		</div>
		<div class="col-sm-6">
			<img src="호나우두.jpg" class="rounded-thumbnail img-fluid">  
		</div>

</body>
</html>