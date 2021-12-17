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
		<%
		int b_no = Integer.parseInt(request.getParameter("b_no")); 
		Board board = BoardDao.getBoardDao().getboard(b_no); 
		%>
		<div class="container">
			
			<table class="table">
				<tr>
					<td>작성자 :<%=board.getB_writer() %> </td> <td>작성날짜 : <%=board.getB_date() %> </td> <td><a href="boardupdate.jsp?b_no=<%=board.getB_no() %>"><button type="button" value="수정">수정</button></a> </td>
					  <td><a href="../../controller/boarddeletecontroller.jsp?b_no=<%=board.getB_no() %>"><button type="button" value="삭제">삭제</button></a> </td>
				</tr>
				<tr>
					<td> 제목 :<%=board.getB_title() %> </td>
				</tr>
				<tr>
					<td> 내용 : <%=board.getB_contents() %></td>
				</tr>
			</table>
		
		</div>
<%@include file="../footer.jsp" %>
</body>
</html>