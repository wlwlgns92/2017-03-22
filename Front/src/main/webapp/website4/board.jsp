<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<!-- �Խ��� ���� -->
		<div class="container my-5">
			
			<h3> QnA</h3>
			<p> ���� �Խ��� </p>
			<div class="col-md-5 offset-7 input-group my-3">
				
				<select class="custom-select">  <!-- �˻� Ű���� -->
					<option>Ű����</option>
					<option>��ȣ</option>
					<option>����</option>
					<option>�ۼ���</option>
				</select>
				
				<input type="text" class="form-control"> <!-- �˻� â -->
				<button class="btn btn-info">��ư</button><!-- �˻� ��ư -->
			</div>
				
				<div class="col-md-8">
					<table class="table table-striped">
							<thead>
								<tr>
									<th>��ȣ</th> <th> ���� </th> <th> �ۼ��� </th> <th>�亯����</th> <th>�ۼ���</th>
								</tr>
							</thead>
						
						<tbody>
							
								<tr><td> 1</td> <td> ȯ���� �ּ��� </td> <td> ���缮 </td> <td> �亯����� </td> <td> 2021-11-26</td></tr>
								<tr><td> 2</td> <td> ȯ���� �ּ��� </td> <td> ���缮 </td> <td> �亯�Ϸ� </td> <td> 2021-11-26</td></tr>
								<tr><td> 3</td> <td> ȯ���� �ּ��� </td> <td> ���缮 </td> <td> �亯����� </td> <td> 2021-11-26</td>
								<tr><td> 4</td> <td> ȯ���� �ּ��� </td> <td> ���缮 </td> <td> �亯�Ϸ� </td> <td> 2021-11-26</td></tr>
								<tr><td> 5</td> <td> ȯ���� �ּ��� </td> <td> ���缮 </td> <td> �亯����� </td> <td> 2021-11-26</td></tr>
							
						</tbody>
					</table>
				</div>
				
				<div class="row">
				<div class="col-md-4 offset-4 my-5">
					<ul class="pagination"> <!-- �Խ��� ������ ��ȣ -->
						<li class="page-item"><a class="page-link">&laquo;</a></li> <!-- �������� ������ -->
						<li class="page-item"><a class="page-link">1</a></li>
						<li class="page-item"><a class="page-link">2</a></li>
						<li class="page-item"><a class="page-link">3</a></li>
						<li class="page-item"><a class="page-link">4</a></li>
						<li class="page-item"><a class="page-link">5</a></li>
						<li class="page-item"><a class="page-link">&raquo;</a></li> <!-- �������� �ڷ� -->
					</ul>
				</div>
				<div class="col-md-1 offset-2 my-5">
					<button class="btn btn-info"> �����ϱ� </button>
				</div>
				</div>
		</div>
	<!-- �Խ��� end -->
	<%@include file="footer.jsp" %>
</body>
</html>