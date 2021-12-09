<%@page import="dto.Product"%>
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
	<% int p_num = Integer.parseInt(request.getParameter("p_num")); %>
		
		<form action="../../controller/productupdatecontroller.jsp" method="post" enctype="multipart/form-data">
			<input type="hidden" name="p_num" value="<%=p_num %>">
			제품명 : <input type="text" name="p_name">
			가격 : <input type="text" name="p_price">
			카테고리 : <select name="p_category">
					<option value="top"> TOP </option>
					<option value="pants"> PANTS </option>
					<option value="outer"> OUTER </option>
			</select>
			제조사 : <input type="text" name="p_manufacturer">
			제품상태 : <select name="p_active">
					<option value="1"> 준비중 </option>
					<option value="2"> 판매중 </option>
					<option value="3"> 품절 </option>
					</select>
			제품사이즈 : <select name="p_size">
					<option value="S"> S </option>
					<option value="M"> M </option>
					<option value="L"> L </option>
					</select>
			제품재고 : <input type="text" name="p_stock">
			제품이미지 : <input type="file" name="p_img">
			제품내용 : <textarea rows="" cols="" name="p_contents"></textarea><br>
			<input type="submit" value="수정">

			
		</form>

</body>
</html>