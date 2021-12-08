
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
		
		<%
		//페이징 처리
		//검색이 있을경우 
		String key = request.getParameter("key");
		String keyword = request.getParameter("keyword");
		
		// 페이징 처리 [1 검색이 있을경우 , 2.검색이 없을경우 ]
		String pagenum = request.getParameter("pagenum"); // 클릭한 페이지번호 요청
		if(pagenum == null) { // 클릭한 페이지번호가 없으면
			pagenum = "1"; // 1페이지
		}	
		int lastrow = BoardDao.getBoardDao().boardcount(key, keyword);

		int listsize = 10;
		int lastpage = 0;					//마지막 페이지
		if(lastrow % listsize == 0) {		//만약에 나머지가 없다면
			lastpage = lastrow / listsize;		//총 게시물/페이지당게시물
		}else {
			lastpage = lastrow / listsize+1; //총 게시물/페이지당게시물 +1
		}

		// 현재페이지번호
		int currentpage = Integer.parseInt(pagenum);
		int startrow = (currentpage-1)*listsize; // 현재페이지의 시작번호
					// 1페이지 0*10 -> 0,		// 2페이지 1*10 -> 10,			// 3페이지 2*10 -> 20
		//int endrow = currentpage*listsize;			
		// 현재페이지의 시작번호
		// 현재페이지의 마지막번호

		ArrayList<Board> boards = BoardDao.getBoardDao().boardlist(startrow, listsize, key, keyword);
		
		%>
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
			<%if(keyword != null) { %>
			<p> 총 검색 수 : <%=lastrow %>
			<%} %>
			<p> 총 게시물 수 : <%=lastrow %>
		<table class="table">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>	
			</tr>
				<%if(boards.size() == 0) {%>
					<tr>
						<td colspan="5" style="text-align: center;">검색 결과가 없습니다. </td>
					</tr>
				<%} %>
			<% 	for(Board board : boards) { %>
					<tr>
					<td><%=board.getB_num() %></td>
					<td><a href="boardview.jsp?b_num=<%=board.getB_num() %>"class="text-dark"><%=board.getB_title() %> </a></td>
					<td><%=board.getB_writer() %></td>
					<td><%=board.getB_date() %></td>
					<td><%=board.getB_view()%></td>
					</tr>
			<%}%>
		</table>
		
		<%	if(loginid != null) {%>
		<div class="row">
			<div class="col-md-2 offset-10">
				<a href="boardwrite.jsp"><button type="button" class="btn btn-outline-dark">글쓰기</button></a>
			</div>
		</div>
		<%}else { %>
		<div class="col-md-3 offset-9" >
			* 로그인후에 글 등록 가능 합니다.
		</div>
		<%}%>
		
	</div>
		<!-- 페이징 번호 -->
		<div class="row">
			<div class="col-md-4 offset-4 my-3">
				<ul class="pagination">
					<!--  첫 페이지이면 이전페이지 누르면 첫페이지 고정 -->
					<%if(currentpage == 1) { %>
						<%if( keyword == null) {%>
					<li class="page-item"><a href="boardlist.jsp?pagenum=<%=currentpage %>&key=<%=key %>&keyword=<%=keyword %>" class="page-link"> 이전 </a> </li>
						<%}else{ %>
						<li class="page-item"><a href="boardlist.jsp?pagenum=<%=currentpage %>" class="page-link"> 이전 </a> </li>
						<%}%>
					<%}else {%>
						<li class="page-item"><a href="boardlist.jsp?pagenum=<%=currentpage-1 %>&key=<%=key %>&keyword=<%=keyword %>" class="page-link"> 이전 </a> </li>
					<%} %>
					<!-- 게시물의 수만큼 페이지 생성 -->
					<% for(int i = 1; i <= lastpage; i++) { %>
					<li class="page-item"><a href="boardlist.jsp?pagenum=<%=i %>&key=<%=key %>&keyword=<%=keyword %>" class="page-link"> <%=i %> </a> </li> <!-- i를 클릭했을때 현재 페이지 이동 [ 클릭한 페이지와 같이] -->
					<%} %>
					<!-- 마지막페이지에서 다음버튼 눌렀을때 마지막페이지 고정 -->
					<%if(currentpage == lastpage) {%>
					<li class="page-item"><a href="boardlist.jsp?pagenum=<%=currentpage %>&key=<%=key %>&keyword=<%=keyword %>" class="page-link"> 다음 </a> </li>
					<%}else { %>
					<li class="page-item"><a href="boardlist.jsp?pagenum=<%=currentpage+1 %>&key=<%=key %>&keyword=<%=keyword %>" class="page-link"> 다음 </a> </li>
					<%} %>
				</ul>
			</div>
			<!-- 검색 -->
			<form action="boardlist.jsp?pagenum=<%=currentpage %>" method="get" class="col-md-5 offset-3 input-group my-3"> 
				<select class="custom-select col-cmd-3" name="key"> <!-- key에는 필드명 -->
					<option value="b_title">제목</option> <!-- value는 key값 [ db의 컬럼 ] -->
					<option value="b_contents">내용</option>
					<option value="b_num">번호</option>
					<option value="b_writer">작성자</option>
				</select>
				<input type="text" class="form-control" name="keyword"> <!-- keyword : 검색대상 -->
				<input type="submit" class="btn-outline-info" value="검색"> 
			</form>
			
		</div>
</body>
</html>