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
	<h3> 1. ��Ʈ��Ʈ�� ������ ���̺�</h3>
		<table>
			<thead>
				<tr>
					<th> ��ȣ </th>
					<th> ���� </th>
					<th> �۾��� </th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td> 1 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ </td> <td> ȫ�浿 </td>
				</tr>
				
				<tr>
					<td> 2 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ </td> <td> ȫ�浿 </td>
				</tr>
				
				<tr>
					<td> 3 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ </td> <td> ȫ�浿 </td>
				</tr>
			</tbody>	
		</table>	
		
		<h3> 2. ��Ʈ��Ʈ�� ���� ���̺� [ class="table" ���̺������� ]</h3>
		<table class="table">
			<thead>
				<tr>
					<th> ��ȣ </th>
					<th> ���� </th>
					<th> �۾��� </th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td> 1 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ </td> <td> ȫ�浿 </td>
				</tr>
				
				<tr>
					<td> 2 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ </td> <td> ȫ�浿 </td>
				</tr>
				
				<tr>
					<td> 3 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ </td> <td> ȫ�浿 </td>
				</tr>
			</tbody>	
		</table>	
		
			<h3> 3. ��Ʈ��Ʈ�� ���� ���̺� [ table table-striped : ���� ]</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th> ��ȣ </th>
					<th> ���� </th>
					<th> �۾��� </th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td> 1 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ </td> <td> ȫ�浿 </td>
				</tr>
				
				<tr>
					<td> 2 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ </td> <td> ȫ�浿 </td>
				</tr>
				
				<tr>
					<td> 3 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ </td> <td> ȫ�浿 </td>
				</tr>
			</tbody>	
		</table>	
	
		<h3> 4. ��Ʈ��Ʈ�� ���� ���̺� [ table table-bodered : �׵θ� ]</h3>
		<table class="table table-bordered">
			<thead>
				<tr class="table-active">
					<th> ��ȣ </th>
					<th> ���� </th>
					<th> �۾��� </th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-success">
					<td> 1 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ </td> <td> ȫ�浿 </td>
				</tr>
				
				<tr class="table-warning">
					<td> 2 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ </td> <td> ȫ�浿 </td>
				</tr>
				
				<tr class="table-danger">
					<td> 3 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ </td> <td> ȫ�浿 </td>
				</tr>
			</tbody>	
		</table>
		
		<h3> 6. ��Ʈ��Ʈ�� ���� ���̺� [ div class="table table-responsive ] </h3>
		<div class="table table-responsive"> 
			<table class="table">
				<thead>
					<tr class="table-active">
						<th> ��ȣ </th>
						<th> ���� </th>
						<th> �۾��� </th>
					</tr>
				</thead>
				<tbody>
					<tr class="table-success">
						<td> 1 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ</td> <td> ȫ�浿 </td>
					</tr>
					
					<tr class="table-warning">
						<td> 2 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ</td> <td> ȫ�浿 </td>
					</tr>
					
					<tr class="table-danger">
						<td> 3 </td> <td>���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ ���̺� �׽�Ʈ</td> <td> ȫ�浿 </td>
					</tr>
				</tbody>	
			</table>
		</div>
</body>
</html>