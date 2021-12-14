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
				
				<input type="hidden" name="p_num" value="<%=p_num %>" id="p_num" class="p_num">
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
							<select id="p_size" name="p_size" class="form-control">
								<option value="0"> 사이즈 선택 </option>
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
									<input class="form-control" type="text" value="1" id="p_count" name="p_count" onchange="pchange('s', <%=product.getP_stock()%>, <%=product.getP_price()%>)">
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
							<button class="form-control" onclick="cartadd()"> 장바구니 </button>
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
	<br><br>
	
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<ul class="navbar-nav col-md-12 text-center">
			<li class="nav-item col-md-3"><a href="#detail" class="nav-link pview">상품 상세</a> </li>
			<li class="nav-item col-md-3"><a href="#guide" class="nav-link pview">상품 가이드</a> </li>
			<li class="nav-item col-md-3"><a href="#review" class="nav-link pview">상품 리뷰</a> </li>
			<li class="nav-item col-md-3"><a href="#qna" class="nav-link pview">상품 문의</a> </li>
			
		</ul>

	</nav>
		<div id="detail">
			상품상세 위치 <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		</div>
		<div id="guide">
			상품가이드 위치 <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		</div >
		<div id="review">
			상품리뷰 위치 <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		</div>
		<div id="qna">
			상품문의 <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		</div>
	</div>
	
</body>
</html>