<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	
		<% 
		
		int b_num = Integer.parseInt( request.getParameter("b_num"));
		Board board = BoardDao.getBoardDao().getBoard(b_num); // ������ �Խù�
		board.setB_contents(board.getB_contents().replaceAll("<br>", "\n")); // br�� \n���� �ٲٱ�
		
		%>
	
	<%@include file="../header.jsp" %>
	<div class="container">
			<form action="../../controller/boardupdatecontroller.jsp" method="post" enctype="multipart/form-data">
				<!-- form ���۵����� �⺻Ÿ�� : text(String) : enctype = "applycation/x-www-form-urlencoded"-->
				<!-- form ���ϵ����� Ÿ�� : multipart/form-data -->
				
				<!-- �Ű����� ���� ���ܼ� ������ hidden -->
				<input type="hidden" name="b_num" value="<%=b_num %>"> 					<!-- ������ �Խù� ��ȣ -->
				<input type="hidden" name="oldfile" value="<%=board.getB_file() %>"> <!-- ÷������ ������ ���� ��� ���������� ����ϱ� ���� -->
				���� : <input type="text" name="title" value="<%=board.getB_title() %>"><br>
				����  : <textarea rows="10" cols="20" name="contents"><%=board.getB_contents() %></textarea><br>
				÷������1 : <input type="file" name="file"><%=board.getB_file() %><br>
				<input type="submit" value="�� ��"><br>
			</form>
		</div>
</body>
</html>