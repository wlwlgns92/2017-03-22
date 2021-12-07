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
		Board board = BoardDao.getBoardDao().getBoard(b_num); // 수정할 게시물
		board.setB_contents(board.getB_contents().replaceAll("<br>", "\n")); // br을 \n으로 바꾸기
		
		%>
	
	<%@include file="../header.jsp" %>
	<div class="container">
			<form action="../../controller/boardupdatecontroller.jsp" method="post" enctype="multipart/form-data">
				<!-- form 전송데이터 기본타입 : text(String) : enctype = "applycation/x-www-form-urlencoded"-->
				<!-- form 파일데이터 타입 : multipart/form-data -->
				
				<!-- 매개변수 값을 숨겨서 보낼때 hidden -->
				<input type="hidden" name="b_num" value="<%=b_num %>"> 					<!-- 수정할 게시물 번호 -->
				<input type="hidden" name="oldfile" value="<%=board.getB_file() %>"> <!-- 첨부파일 변경이 없을 경우 기존파일을 사용하기 위해 -->
				제목 : <input type="text" name="title" value="<%=board.getB_title() %>"><br>
				내용  : <textarea rows="10" cols="20" name="contents"><%=board.getB_contents() %></textarea><br>
				첨부파일1 : <input type="file" name="file"><%=board.getB_file() %><br>
				<input type="submit" value="수 정"><br>
			</form>
		</div>
</body>
</html>