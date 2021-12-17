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
		<span style="text-align: center;"><h3>글 수정 페이지</h3></span><br>
		<%
		int b_no = Integer.parseInt(request.getParameter("b_no"));
		
		Board board = BoardDao.getBoardDao().getboard(b_no); 
		%>
		
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<form action="../../controller/boardupdatecontroller.jsp" method="get" style="text-align: center;">
						<input type="hidden" name="b_no" value="<%=b_no %>">
						제목 : <input type="text" name="title" value="<%=board.getB_title() %>"><br><br>
						내용 : <textarea rows="10" cols="40" name="contents" value="<%=board.getB_contents() %>"></textarea>
						<input type="submit" value="글작성" class="form-control" style="width : 30%; margin : auto;">
					</form>
				</div>
			</div>
		</div>
</body>
</html>