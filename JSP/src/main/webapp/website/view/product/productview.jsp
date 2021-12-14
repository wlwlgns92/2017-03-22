<%@page import="dto.Product"%>
<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		// 제품 상세 페이지 == 게시물 보기
		int p_num = Integer.parseInt(request.getParameter("p_num")); 
		Product product = ProductDao.getProductDao().getproProduct(p_num);
	%>
	<%@ include file="../header.jsp" %>
	
	<div class="container"> <!-- 박스권 -->
		<div class="row"> <!-- 가로배치 -->
			<div class="col-md-6" style="width:50%;">
					<img src="../../upload/<%=product.getP_img() %>" style="max-width:100%;">
			</div>
			<div class="col-md-6">
				<p> <%=product.getP_manufacturer() %> </p>
				<h4> <%=product.getP_name() %> </h4>
				<hr> <!-- 줄치기 -->
					<div class= "row" >
						<div class="col-md-3"> 구매 혜택 </div>
						<div class="col-md-9"> 포인트 1% 제공 </div>
					</div> <br>
					<div class= "row" >
						<div class="col-md-3"> 배송 정보 </div>
						<div class="col-md-9"> 평일 16시 이전 주문시 당일배송 </div>
					</div> <br>
				<hr>
					<div class= "row" >
						<div class="col-md-3"> 가격 </div>
						<div class="col-md-9"> <%=product.getprice() %>원 </div>
					</div> <br>
				<hr>
					
					<div class="row">
						<div class="col-md-3"> 제품사이즈 </div>
						<div class="col-md-9">
							<select name="p_size">
								<option> 사이즈 선택 </option>
								<option> S </option>
								<option> M </option>
								<option> L </option>
							</select>
						</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-md-3"> 제품 수량 </div>
						<div class="col-md-9 row no-gutters"> <!-- no-gutters -->
							<div class="row">
							<button class="btn btn-ouline-secondary" onclick="pchange('p', <%=product.getP_stock()%>, <%=product.getP_price()%>)">+</button>
								<div class="col-md-3">
									<input class="form-control" type="text" value="1" id="p_count" onchange="pchange('s', <%=product.getP_stock()%>, <%=product.getP_price()%>)">
								</div>
							<button class="btn btn-ouline-secondary" onclick="pchange('m', <%=product.getP_stock()%>, <%=product.getP_price()%>)">-</button>
							</div>
						</div>
					</div> <hr>
					<div class="row">
						<div class="col-md-3"> 총 가격 </div>
						<div class="col-md-9 text-right">
							<span id="total"> <%=product.getprice() %> </span>원
						</div>
					</div> <hr>
					<div>
						<button class="form-control bg-success text-white" style="font-size: 1.5rem;"> 구매하기 </button>
					</div>
					<div class="row my-3"> <!-- my : margin y축 [y축 바깥여백-->
						<div class="col-md-6">
							<button class="form-control"> 장바구니 </button>
						</div>
						<div class="col-md-6">
							<%
							// 순서 productview -> main.js ->
							int m_num = 0;
							if(login != null) m_num = login.getM_num();
							if(ProductDao.getProductDao().p_likecheck(p_num, m_num)) {
							%>
								<button class="form-control" id="btnplike" onclick="p_like(<%=product.getP_num()%>, <%=login.getM_num()%>)"> 찜하기♥ 
								</button>
							<%}else { %>
								<button class="form-control" id="btnplike" onclick="p_like(<%=product.getP_num()%>, <%=login.getM_num()%>)"> 찜하기♡ 
								</button>
							<%}%>							
							
						</div>
					</div>
		</div>
	</div>
	
	
	
</body>
</html>