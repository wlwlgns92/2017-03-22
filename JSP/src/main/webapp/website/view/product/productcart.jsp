<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@page import="dto.Login"%>
<%@page import="dto.Cart"%>
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
	<%@include file="../header.jsp" %>
	<% 
		String sname = "cart"+login.getM_id();
		ArrayList<Cart>	carts = (ArrayList<Cart>)session.getAttribute(sname);
	%>
	<div class="container">
		<table class="table">
		<tr>
			<th>이미지</th> <th>상품정보</th> <th>수량</th> <th>가격</th> <th>비고</th>
		</tr>
		<%
		if(carts == null) { %>
			<tr>
			<td colspan="5" class="text-center"> 장바구니에 상품이 없습니다.</td>
			</tr>
		<%
		}else{
		for(Cart cart : carts) {
		Product product = ProductDao.getProductDao().getproProduct(cart.getP_num()); // 제품정보에 해당하는 제품정보 가져오기
		%>
			<tr>
				<td width="10%"><img src="../../upload/<%=product.getP_img()%>" style="max-width: 100%;"> </td>
				<td width="55%">
					<div class="p-1">
						제품명 :(<%=product.getP_manufacturer() %>) <%=product.getP_name() %>
					</div>
					<hr>
					<div class="p-1" style="font-size: 12px;">
						옵션 : <%=cart.getP_size() %>
					</div>
				</td>
				
				<td class="row no-gutters">
					<button class="btn btn-ouline-secondary" onclick="pchange('p', <%=product.getP_stock()%>, <%=product.getP_price()%>)">+</button>
					
					<div class="col-md-3" >
						<input class="form-control" type="text" value="<%=cart.getP_count() %>" id="p_count" name="p_count" onchange="pchange('s', <%=product.getP_stock()%>, <%=product.getP_price()%>)">
					</div>
					
					<button class="btn btn-ouline-secondary" onclick="pchange('m', <%=product.getP_stock()%>, <%=product.getP_price()%>)">-</button>
				</td>
				<td width="15%" class="align-middle" id="total"><%=product.getprice() %> 원</td>
				<td width="5%"><button class="form-control" onclick="cartdelete('in', '<%=cart.getP_num() %>', '<%=cart.getP_size() %>')"> x </button></td>
				
			</tr>
		<%} }%>
		</table>
			<div>
				<button onclick="cartdelete('all', '0', '0')">모두 삭제</button>
			</div>
	</div>
</body>
</html>