<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	
	<h3> 게시물 목록 </h3>
	<%if(loginid == null) { %>
		<p> 로그인후 게시물을 작성할 수 있습니다.</p>
	<%} else {  %>
	<button> <a href="boardwrite.jsp"> 글작성</a> </button>
	<% } %>
	
	
	<table>
		<tr>
			<th> 번호 </th> <th> 제목 </th> <th> 작성자 </th>
		</tr>
		
		<%for(int i = 0; i < boards.size(); i++) { %>
		<tr>
			<td><%=(i+1) %></td>
			<td> <a href="boardview.jsp?bnum=<%=i%>"><%=boards.get(i).getTitle() %> </a></td>
			<td><%=boards.get(i).getContents() %></td>
		</tr>
		<%} %>
	</table>
	
</body>
</html>