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
	<h3> 1. 부트스트랩 미적용 테이블</h3>
		<table>
			<thead>
				<tr>
					<th> 번호 </th>
					<th> 제목 </th>
					<th> 글쓴이 </th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td> 1 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 </td> <td> 홍길동 </td>
				</tr>
				
				<tr>
					<td> 2 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 </td> <td> 홍길동 </td>
				</tr>
				
				<tr>
					<td> 3 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 </td> <td> 홍길동 </td>
				</tr>
			</tbody>	
		</table>	
		
		<h3> 2. 부트스트랩 적용 테이블 [ class="table" 테이블모양으로 ]</h3>
		<table class="table">
			<thead>
				<tr>
					<th> 번호 </th>
					<th> 제목 </th>
					<th> 글쓴이 </th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td> 1 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 </td> <td> 홍길동 </td>
				</tr>
				
				<tr>
					<td> 2 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 </td> <td> 홍길동 </td>
				</tr>
				
				<tr>
					<td> 3 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 </td> <td> 홍길동 </td>
				</tr>
			</tbody>	
		</table>	
		
			<h3> 3. 부트스트랩 적용 테이블 [ table table-striped : 색상 ]</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th> 번호 </th>
					<th> 제목 </th>
					<th> 글쓴이 </th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td> 1 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 </td> <td> 홍길동 </td>
				</tr>
				
				<tr>
					<td> 2 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 </td> <td> 홍길동 </td>
				</tr>
				
				<tr>
					<td> 3 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 </td> <td> 홍길동 </td>
				</tr>
			</tbody>	
		</table>	
	
		<h3> 4. 부트스트랩 적용 테이블 [ table table-bodered : 테두리 ]</h3>
		<table class="table table-bordered">
			<thead>
				<tr class="table-active">
					<th> 번호 </th>
					<th> 제목 </th>
					<th> 글쓴이 </th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-success">
					<td> 1 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 </td> <td> 홍길동 </td>
				</tr>
				
				<tr class="table-warning">
					<td> 2 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 </td> <td> 홍길동 </td>
				</tr>
				
				<tr class="table-danger">
					<td> 3 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 </td> <td> 홍길동 </td>
				</tr>
			</tbody>	
		</table>
		
		<h3> 6. 부트스트랩 적용 테이블 [ div class="table table-responsive ] </h3>
		<div class="table table-responsive"> 
			<table class="table">
				<thead>
					<tr class="table-active">
						<th> 번호 </th>
						<th> 제목 </th>
						<th> 글쓴이 </th>
					</tr>
				</thead>
				<tbody>
					<tr class="table-success">
						<td> 1 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트</td> <td> 홍길동 </td>
					</tr>
					
					<tr class="table-warning">
						<td> 2 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트</td> <td> 홍길동 </td>
					</tr>
					
					<tr class="table-danger">
						<td> 3 </td> <td>테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트 테이블 테스트</td> <td> 홍길동 </td>
					</tr>
				</tbody>	
			</table>
		</div>
</body>
</html>