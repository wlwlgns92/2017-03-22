<%@page import="dto.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
   
   Login login = (Login)session.getAttribute("login");
String sname = "cart"+ login.getM_id();
ArrayList<Cart> carts = (ArrayList<Cart>)session.getAttribute(sname);

   String type = request.getParameter("type");
   int p_num = Integer.parseInt(request.getParameter("p_num"));
   String p_size = request.getParameter("p_size");
   int i = Integer.parseInt(request.getParameter("i"));
   int p_count = Integer.parseInt(request.getParameter("p_count"));
   
   if(type.equals("all")) { // 모두 삭제 버튼을 눌렀을때
   	session.setAttribute(sname, null); // 세션을 null로 초기화
   }
   else if(type.equals("in")) {  // 개별 삭제 버튼을 눌렀을때
   	for(Cart cart : carts) { // 동일한 제품번호와 사이즈 찾기
   		if(cart.getP_num() == p_num && cart.getP_size().equals(p_size)) {
   			carts.remove(cart); // 카트에서 해당 제품을 삭제
   			session.setAttribute(sname, carts);
   			break; //반복문 종료
   		}
   	}		
   }else if(type.equals("p")) {
   	carts.get(i).setP_count(p_count);
   	session.setAttribute(sname, carts);
   	
   }else if(type.equals("m")) {
   	carts.get(i).setP_count(p_count);
   	session.setAttribute(sname, carts);
   }
   
%>