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
		<div class="container">
			
			<table class="table">
				<tr>
					<td>작성자 : 조지훈</td> <td>작성날짜 : 12-10 </td> <td><button type="button" value="수정">수정</button> </td> <td><button type="button" value="삭제">삭제</button> </td>
				</tr>
				<tr>
					<td> 제목 : 커피추천 </td>
				</tr>
				<tr>
					<td> 내용 : 커피끊으세요</td>
				</tr>
				<tr>
					<td ><img src="/test/website/img/coffee1.jpg"> </td>
				</tr>
			</table>
		
		</div>
<%@include file="../footer.jsp" %>
</body>
</html>