<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<!-- 글쓰기 -->
		<div class="container">
			<form action="../../controller/boardwritecontroller.jsp" method="post" enctype="multipart/form-data">
				<!-- form 전송데이터 기본타입 : text(String) : enctype = "applycation/x-www-form-urlencoded"-->
				<!-- form 파일데이터 타입 : multipart/form-data -->
				제목 : <input type="text" name="title"><br>
				내용  : <textarea rows="10" cols="20" name="contents"></textarea><br>
				첨부파일1 : <input type="file" name="file"><br>
				<input type="submit" value="등 록"><br>
			</form>
		</div>
   
</body>
</html>