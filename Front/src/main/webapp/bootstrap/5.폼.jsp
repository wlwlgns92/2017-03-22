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
	
	<h3> 1. ��Ʈ��Ʈ�� ������ </h3>
	<form>
		<label> �̸� </label>
		<input type="text" placeholder="�̸�">
		<label> �̸��� </label>
		<input type="email" placeholder="�̸���">
		<button type="submit">Ȯ�� </button>
	</form>
	
	<h3> 2. form-group </h3>
	<form>
		<div class="form-group">
			<label > �̸� </label>
			<input class="form-control" type="text" placeholder="�̸�">
		</div>
		
		<div class="form-group">
			<label> �̸��� </label>
			<input class="form-control" type="email" placeholder="�̸���">
		</div>
		<div class="form-group">
			<button type="submit">Ȯ�� </button>
		</div>
	</form>
	
	<br><br><br><br>
	
	<h3> 3. form-check-inline </h3>
	<form>
		<div class="form-check-inline">
			<label > �̸� </label>
			<input class="form-control" type="text" placeholder="�̸�">
		</div>
		
		<div class="form-group">
			<label> �̸��� </label>
			<input class="form-control" type="email" placeholder="�̸���">
		</div>
		<div class="form-group">
			<button type="submit">Ȯ�� </button>
		</div>
	</form>
</body>
</html>