<%@page import="java.util.ArrayList"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
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
				<% 
				ArrayList<Board> boards = BoardDao.getBoardDao().getboard();
				%>
					<%for(Board board : boards) {%>
					<tr>
						<td><%=board.getB_no() %></td> 
						<td><a href="boardview.jsp?b_no=<%=board.getB_no() %>"><%=board.getB_title() %></a></td>
						<td><%=board.getB_writer() %></td> 
						<td><%=board.getB_date() %></td>
					</tr>
					<%} %>
				</tbody>
			</table>
			<div>
				<a href="boardwrite.jsp"> <button class="form-control">글쓰기</button></a>
			</div>
		</div>
		</div>
	</div>
	
	<%@include file="../footer.jsp" %>
</body>
</html>