<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
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
	<!-- 결제API [아임포트 ] 가져오기 -->
	<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
	
	<%
		//카트 세션 호출
		String sname = "cart"+loginid;
		ArrayList<Cart> carts = (ArrayList<Cart>)session.getAttribute(sname);
		
		// 총 결제액
		int totalprice = 0;
		DecimalFormat decimalFormat = new DecimalFormat("###,###");
		
		// 회원정보 불러오기 
		Member member = MemberDao.getMemberDao().getmember(loginid);
		String[] address = member.getM_address().split(",");
	%>
	<input type="hidden" id="mname" value="<%=member.getM_name() %>">
	<input type="hidden" id="mphone" value="<%=member.getM_phone() %>">
	
	<input type="text" id="address1" value="<%=address[0] %>">
	<input type="text" id="address2" value="<%=address[1] %>">
	<input type="text" id="address3" value="<%=address[2] %>">
	<input type="text" id="address4" value="<%=address[3] %>">
	
	
	
	
	<div class="container">
		<table class="table">
			<tr>
				<th>이미지</th> <th>상품정보</th> <th>수량</th> <th>가격</th>
			</tr>
			<%
			for(Cart cart : carts) {
			Product product = ProductDao.getProductDao().getproProduct(cart.getP_num());
			totalprice += cart.getP_count()*product.getP_price();
			%>
			<tr>
				<td width="10%" class="align-middle"><img src="../../upload/<%=product.getP_img()%>" style="max-width: 100%;"> </td>
				<td width="50%">
					<div class="px-1">
						(<%=product.getP_manufacturer() %>) <%=product.getP_name() %>
					</div><hr>
					<div class="px-1" style="font-size: 12px;">
						옵션 : <%=cart.getP_size() %>
					</div>
				</td>
				<td class="align-middle text-center pview"> <%=cart.getP_count() %></td>
				<td class="align-middle text-center pview"> <%=decimalFormat.format(cart.getP_count() * product.getP_price()) %></td>
			</tr>
			<% } %>
		</table>
		<br><br>
		<div class="row">
			<div class="col-md-6">
				<h3>배송 정보</h3>
				<span> 받는 사람 정보 </span> <input type="checkbox" id="checkbox"> 회원과 동일
				<div class="row">
						<div class="col-md-3 m2"><label>이름</label> </div>
						<div class="col-md-8"><input id="name" onchange="signupcheck();" type="text" name="name" class="form-control" maxlength="15">  </div>
				</div>
				<div class="row">
						<div class="col-md-3 m2"><label>연락처</label> </div>
						<div class="col-md-8"><input id="phone" onchange="signupcheck();" type="text" name="phone" class="form-control" placeholder="000-0000-0000">  </div>
				</div>
				<div>
					<span id="phoneresult"></span>
				</div>
				<div class="row">
						<div class="col-md-3 m2"><label>요청사항</label> </div>
						<div class="col-md-8"><input id="prequest" onchange="signupcheck();" type="text" name="prequest" class="form-control">  </div>
				</div>
				
				<span class="pview"> 받는 사람 주소</span> <input type="checkbox"  id="checkbox2"> 회원과 동일
				<div class="row">
					<div class="col-md-6"><input type="text" name="address1"id="sample4_postcode" placeholder="우편번호" class="form-control"></div>
					<div class="col-md-6"><input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기" class="form-control"><br></div>
				</div>
				<div class="row">
						<div class="col-md-6"><input type="text" name="address2" id="sample4_roadAddress" placeholder="도로명주소" class="form-control" > </div>
						<div class="col-md-6"><input type="text" name="address3" id="sample4_jibunAddress" placeholder="지번주소" class="form-control"> </div>
				</div>
				<input type="text" id="sample4_detailAddress" name="address4" placeholder="상세주소" class="form-control">
			</div>
		</div>
			<br><br><br>

			<div class="col-md-6">
				<h3> 결제 정보</h3>
			</div>
		
		</div><input id="totalprice" value="<%=totalprice %>">
		<button onclick="payment();">결제</button>
	</div>
</body>
</html>