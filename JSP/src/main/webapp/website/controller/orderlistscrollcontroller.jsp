<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@page import="dto.Porderdetail"%>
<%@page import="dto.Login"%>
<%@page import="dao.PorderDao"%>
<%@page import="dto.Porder"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% int item = Integer.parseInt(request.getParameter("item") ); // ajax 변수%>
    <% Login login = (Login)session.getAttribute("login"); // 로그인된 회원정보%>
						<% ArrayList<Porder> porders = PorderDao.getPorderDao().getporderlist(login.getM_num()); // 주문자의 주문목록 %>
							<%for(int i = item; i < item+1; i++) { %>
							<div class="row mt-5">
								<div class="col-md-4 border rounded p-3 d-flex align-content-center flex-wrap"> <!-- 주문정보 -->
									<p class="pview"> 주문번호 : <%=porders.get(i).getOrder_num() %>
									<p> 주문일 : <%=porders.get(i).getOrder_date() %></p>
									<button class="form-control">주문상세</button>
									<p>
								</div>
								<div class="col-md-8 border rounded p-3"> <!-- 주문상세 -->
								<% ArrayList<Porderdetail> porderdetails = PorderDao.getPorderDao().getporderdetaillist(porders.get(i).getOrder_num());%>
								<% for(int j = 0; j < porderdetails.size(); j++) { %>
								<% Product product = ProductDao.getProductDao().getproProduct(porderdetails.get(j).getP_num());  // 주문상세를 통해 제품정보 가져오기%>
									<p>주문 제품내역</p><hr>
									<div class="row">
										<div class="col-md-3 d-flex align-items-center"> <!-- d-flex align-items-center 수직정렬 -->
											<img src="../../upload/<%=product.getP_img()%>" style="max-width: 100%;">
										</div>
										<div class="col-md-9 row">
											<div class="col-md-8">
												<p class="pview"> 상품명 : <%=product.getP_name()%> 옵션 : <%=product.getP_size()%></p>
												<p> 수량 : <%=porderdetails.get(j).getP_count()%></p>
												<p> 배송상태 : <%=porderdetails.get(j).getDelivery_state() %></p>
											</div>
											<div class="col-md-4">
												<button class="btn btn-outline-danger my-3">배송 조회</button>
												<button class="btn btn-outline-danger my-3">주문 변경</button>
											</div>
										</div>
									</div>
									<%} %>
								</div>
							</div>
							<%} %>