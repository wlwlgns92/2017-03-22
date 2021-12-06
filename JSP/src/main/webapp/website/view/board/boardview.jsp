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
	<%@ include file="../header.jsp" %>

	<%
		int b_num = Integer.parseInt(request.getParameter("b_num"));
		Board board = BoardDao.getBoardDao().getBoard(b_num);
	%>
	<div class="container">
		<table>
			<tr>
				<td>제목</td><td><%=board.getB_title() %></td>
			</tr>
			<tr>
				<td>내용</td><td><%=board.getB_contents() %></td>
			</tr>
			<tr>
				<td>첨부파일1</td><td><a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file() %>"><%=board.getB_file() %></td>
			</tr>
			<tr>
				<td>첨부파일2</td><td><a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file() %>"><%=board.getB_file() %></td>
			</tr>
		</table>
	</div>
</body>
</html>