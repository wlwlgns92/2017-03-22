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
	<%@ include file="../header.jsp" %>

	<%
		
		int b_num = Integer.parseInt(request.getParameter("b_num")); // 전 페이지에서 클릭한 게시물 번호
		
		String boardviews = loginid +" : " + b_num;
		if(session.getAttribute(boardviews) == null) {
			//조회수 증가
			BoardDao.getBoardDao().boardcount(b_num);
			
			// 조회수 증가 방지 [ 세션 생성 : 세션아이디 , 세션값]
			String boardview = loginid +" : " + b_num;
			session.setAttribute( boardview , true );
			session.setMaxInactiveInterval(60*60*24); // 세션유효시간 : [ 24시간 ]
		}
		// 해당 게시물 번호의 게시물 가져오기
		Board board = BoardDao.getBoardDao().getBoard(b_num);
	%>
	<div class="container">
			<div class="row">
				<div class="m-2"><a href="boardlist.jsp"> <button class="form-control">목록보기 </button></a></div>
				<div class="m-2"><a href="#"> <button class="form-control">수정하기 </button></a></div>
				<div class="m-2"><a href="#"> <button class="form-control">삭제하기 </button></a></div>
			</div>
		<table class="table">
			<tr>
				<td>작성자</td><td><%=board.getB_writer() %></td>
				<td>작성일</td><td><%=board.getB_date() %></td>
				<td>조회수</td><td><%=board.getB_view() %></td>
			</tr>
			<tr>
				<td>제목</td> <td colspan="2"><%=board.getB_title() %></td>
			</tr>
			<tr>
				<td style="height: 300px">내용</td> <td colspan="2"> <%=board.getB_contents() %></td>
			</tr>
			<tr>
				<td>첨부파일 다운로드<br>
					<a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file() %>"><%=board.getB_file() %>
				</td>
				<td colspan="2"> 미리보기 <br>
					<img src="../../upload <%=board.getB_file()%>" width = "100%">
				 </td>
			
			</tr>
			<tr> 
				<td>첨부파일2</td><td><a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file() %>"><%=board.getB_file() %></td>
			</tr>
		</table>
	</div>
</body>
</html>