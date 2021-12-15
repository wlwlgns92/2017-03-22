<%@page import="java.text.DecimalFormat"%>
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
		int totalprice = 0; // 총 금액 변수
		DecimalFormat decimalFormat = new DecimalFormat("###,###");
	%>
	<div class="container">
		<h3 style="border-bottom: solid 1px #eeeee;"> 장바구니 </h3> <br><br>
		
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
			int i = 0; // 반복인덱스 변수
		for(Cart cart : carts) {
			Product product = ProductDao.getProductDao().getproProduct(cart.getP_num()); // 제품정보에 해당하는 제품정보 가져오기
			totalprice += cart.getP_count()*product.getP_price(); // 카트내 제품 누적합계 [제품 수량 * 제품 가격]
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
					<button class="btn btn-ouline-secondary"
					 onclick="pchange2(<%=i %>, 'p', <%=product.getP_stock()%>, <%=product.getP_price()%>)">+</button>
					
					<div class="col-md-3" >
						<input class="form-control" type="text" value="<%=cart.getP_count() %>" id="p_count<%=i %>" name="p_count"
						 onchange="pchange2(<%=i %>, 's', <%=product.getP_stock()%>, <%=product.getP_price()%>)">
					</div>
					
					<button class="btn btn-ouline-secondary"
					 onclick="pchange2(<%=i %>,'m', <%=product.getP_stock()%>, <%=product.getP_price()%>)">-</button>
				</td>
				<td width="15%" class="align-middle" id="total<%=i%>"><%=decimalFormat.format(cart.getP_count()*product.getP_price()) %> 원</td>
				<td width="5%"><button class="form-control" onclick="cartdelete('in', '<%=cart.getP_num() %>', '<%=cart.getP_size() %>')"> x </button></td>
				
			</tr>
		<%i++; } }%>
		</table>
			<div>
				<button onclick="cartdelete('all', '0', '0')" class="form-control">모두 삭제</button>
			</div>
			<div class="text-center totalbox">
				<p> 총 상품 가격 : <span class="carttotal"><%=decimalFormat.format(totalprice) %></span>+ 총 배송비 <span class="carttotal">3,000</span> = 총 주문금액 : <span class="carttotal"><%=decimalFormat.format(totalprice+3000) %></span></p>
			</div>
			
			<div class="row">
				<div class="col-md-3 offset-3">
					<a href="productpayment.jsp">
						<button class="form-control p-3"> 주문하기 </button>
					</a>
				</div>
				<div class="col-md-3">
					<button class="form-control p-3"> 쇼핑하기 계속하기 </button>
				</div>
			</div>
	</div>
</body>
</html>