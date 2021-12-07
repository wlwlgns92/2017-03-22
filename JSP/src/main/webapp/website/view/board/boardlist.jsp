
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%@include file= "../header.jsp" %>
	<!-- 고객센터 -->	
	<div class="container">
		<a href="boardwrite.jsp"><button >글쓰기</button></a>
	
	
		<div class="text-center">
			<div class="row">
				<div class="col-md-6  border border-warning m-1">
					<h3>고객센터</h3> 
					<p>1577-7011 365일 24시간 운영</p>
				</div>
				<div class="col-md-6 border border-warning m-1">
					<h4>자주 하는 질문</h4>
					<table class="table">
						<tr> <td>Q</td> <td>아이디를 분실</td> </tr>
						<tr> <td>Q</td> <td>비밀번호를 분실</td> </tr>
						<tr> <td>Q</td> <td>핸드폰을 분실</td> </tr>
						<tr> <td>Q</td> <td>지갑을 분실</td> </tr>
						<tr> <td>Q</td> <td>정신머리를 분실</td> </tr>
						<tr> <td>Q</td> <td>차키를 분실</td> </tr>
					</table>
				</div>
			</div>
		</div>	
		<br><br><br><br>
		<h3> 질문 게시판 </h3>
	
		<table class="table">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>	
			</tr>
			<% 
				ArrayList<Board> boards = BoardDao.getBoardDao().boardlist();
			 
				for(Board board : boards) { 
			%>
				<tr>
				<td><%=board.getB_num() %></td>
				<td><a href="boardview.jsp?b_num=<%=board.getB_num() %>"class="text-dark"><%=board.getB_title() %> </a></td>
				<td><%=board.getB_writer() %></td>
				<td><%=board.getB_date() %></td>
				<td><%=board.getB_view()%></td>
				</tr>
			<%
				}
			%>
		</table>
		<%
		if(loginid != null && loginid.equals("admin")) {
		%>
		
		<div class="row">
			<div class="col-md-2 offset-10">
				<a href="boardwrite.jsp"><button type="button" class="btn btn-outline-dark">글쓰기</button></a>
			</div>
		</div>
		<%} %>
	</div>

</body>
</html>