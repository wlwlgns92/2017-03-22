<%@page import="dto.Reply"%>
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
		
		String boardviews = loginid +":" + b_num;
		if(session.getAttribute(boardviews) == null) {
			//조회수 증가
			BoardDao.getBoardDao().boardcount(b_num);
			
			// 조회수 증가 방지 [ 세션 생성 : 세션아이디 , 세션값]
			String boardview = loginid +":" + b_num;
			session.setAttribute( boardview , true );
			session.setMaxInactiveInterval(60*60*24); // 세션유효시간 : [ 24시간 ]
		}
		// 해당 게시물 번호의 게시물 가져오기
		Board board = BoardDao.getBoardDao().getBoard(b_num);
		Reply replyes = BoardDao.getBoardDao().getreply(b_num);
		
		//페이징
		String pagenum = request.getParameter("pagenum");
		if(pagenum == null){
			pagenum = "1";
		}
		int lastrow = BoardDao.getBoardDao().reply
	%>
	<div class="container">
			<div class="row">
				<div class="m-2"><a href="boardlist.jsp"> <button class="form-control">목록보기 </button></a></div>
				<% if(loginid != null &&  loginid.equals(board.getB_writer())) { %>
				<div class="m-2"><a href="../../view/board/boardupdate.jsp?b_num=<%=board.getB_num() %>"> <button class="form-control">수정하기 </button></a></div>
				<div class="m-2"><a href="../../controller/boarddeletecontroller.jsp?b_num=<%=board.getB_num() %>"> <button class="form-control">삭제하기 </button></a></div>
				<%} %>
			</div>
		<table class="table">
			<tr>
				<td style="width : 20%">작성자</td><td><%=board.getB_writer() %></td>
				<td>작성일<%=board.getB_date() %></td>
				<td>조회수<%=board.getB_view() %></td>
			</tr>
			<tr>
				<td>제목</td> <td colspan="2"><%=board.getB_title() %></td>
			</tr>
			<tr>
				<td style="height: 300px">내용</td> <td colspan="2"> <%=board.getB_contents() %></td>
			</tr>
			<tr>
				<td>첨부파일 다운로드<br>
					<% if(board.getB_file() == null ) {%>
					<%}else { %> 
					<a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file() %>"><%=board.getB_file() %></a>
					<%} %>
				</td>
					<% if(board.getB_file() == null ) {%>
					<td colspan="2" height="300px;"></td>
					<%}else { %> 
					<%} %>
				<td colspan="2" height="300px;"> 미리보기 <br>
					<img src="../../upload/<%=board.getB_file()%>" style="max-width: 100%; max-height:100%"> <!-- 박스권 안에 사진 사이징 : max-width max-height -->
				 </td>
			</tr>
		</table>
	</div>
		
		
			<form action="../../controller/replywritecontroller.jsp" class="row" method="get">
				<input type="hidden" value="<%=board.getB_num() %>" name="b_num">
				<div class="col-md-2" >
					<h6>댓글작성 </h6>
				</div>
				<div class="col-md-8" >
					<textarea rows="" cols="" class="form-control" name="contents" ></textarea> 
				</div>
				<div class="col-md-2">
					<button class="form-control"> 등록 </button>
				</div>
			</form>
			
			<table class="table">
				<tr>
					<th> 작성자 </th> <th> 내용 </th> <th> 작성일 </th>
				</tr>
				<%// 해당 게시물 번호의 모든 댓글 가져오기
				ArrayList<Reply> replys = BoardDao.getBoardDao().replylist(b_num); %>
				<% for(Reply reply : replys) { %>
				<tr><th> <%=reply.getR_writer() %> </th> <th> <%=reply.getR_contents() %> </th> <th> <%=reply.getR_date() %> </th> 
				<th><a href="../../controller/replydeletecontroller.jsp?r_num=<%=reply.getR_num() %>&b_num=<%=b_num %>">
					<button class="form-control"> 삭제</button>
				</a></tr>
							
				<%} %>
			</table>
			<div class="row">
				<div class="col-md-4 offset-4 my-3">
					<ul class="pagination">
						<li class="page-item"><a href="boardview.jsp?pagenum=<%=currentpage %>" class="page-link">이전 </a> </li>
						<li></li>
						<li></li>
						<li></li>
					</ul>
				</div>
			</div>

</body>
</html>