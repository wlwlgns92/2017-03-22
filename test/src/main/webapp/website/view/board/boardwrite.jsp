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
		<span style="text-align: center;"><h3>글 작성 페이지</h3></span><br>
		
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<form action="" style="text-align: center;">
						제목 : <input type="text" name="title"><br><br>
						내용 : <textarea rows="10" cols="40"></textarea>
						<input type="submit" value="글작성" class="form-control" style="width : 30%; margin : auto;">
					</form>
				</div>
			</div>
		</div>
		
</body>
</html>
