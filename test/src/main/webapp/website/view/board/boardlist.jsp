<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../header.jsp" %>
	
	<h3 style="text-align: center;"> 게시판 </h3>
	<div class="container">
		<div class="row">
		<div class="col-md-12">
			<table class="table table-striped" style="text-align: center; margin:auto;">
				<thead>
					<tr>
						<th>No</th> <th>제목</th> <th>작성자</th> <th>날짜</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td> <td><a href="boardview.jsp">커피추천</a></td> <td>조지훈</td> <td>12-10</td>
					</tr>
					<tr>	
						<td>2</td> <td><a href="boardview.jsp">커피추천</a></td> <td>조지훈</td> <td>12-10</td>
					</tr>
					<tr>
						<td>3</td> <td><a href="boardview.jsp">커피추천</a></td> <td>조지훈</td> <td>12-10</td>
					</tr>
					<tr>
						<td>4</td> <td><a href="boardview.jsp">커피추천</a></td> <td>조지훈</td> <td>12-10</td>
					</tr>
				</tbody>
			</table>
			<div>
				<button class="form-control">글쓰기</button>
			</div>
		</div>
		</div>
	</div>
	
	<%@include file="../footer.jsp" %>
</body>
</html>