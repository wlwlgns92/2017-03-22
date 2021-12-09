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
		
		<form action="../../controller/productwritecontroller.jsp" method="post" enctype="multipart/form-data">
			제품명 : <input type="text" name="p_name">
			가격 : <input type="text" name="p_price">
			카테고리 : <select name="p_category">
					<option value="top"> TOP </option>
					<option value="pants"> PANTS </option>
					<option value="outer"> OUTER </option>
			</select>
			제조사 : <input type="text" name="p_manufacturer">
			제품사이즈 : <select name="p_size">
					<option value="S"> S </option>
					<option value="M"> M </option>
					<option value="L"> L </option>
					</select>
			제품재고 : <input type="text" name="p_stock">
			제품이미지 : <input type="file" name="p_img">
			제품내용 : <textarea rows="" cols=""></textarea><br>
			<input type="submit" value="제품등록">

			
		</form>
</body>
</html>