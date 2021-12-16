<%@page import="dto.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.PorderDao"%>
<%@page import="dto.Login"%>
<%@page import="dto.Porder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
    <%
    
    
    // 순서
     /*
     	주문db등록한다
     	주문 상품수 만큼 주문상세 등록
     */
     /*
    	1. 주문등록 [ 끌어오는 방법 | 1.세션 | 2.요청[request] | 3.Json ]
	     	1. 회원번호 : m_num : 세션
	     	2. 수령자 : order_name
	     	3. 수령자 연락처 : order_phone
	     	4. 수령자 주소 : order_address
	     	5. 주문총금액 : order_pay
	     	6. 결제수단 order_payment
	     	7. 배송비 : delivery_pay
     	
     	2. 주문 상세 [ 먼저 주문 등록이 된다는 가정 ] : 반복문
     	 오더번호 : order_num : DB
     	 상품번호 : p_num : 카트세션
     	 구매수량 p_count : 카트 세션
     	 배송상태 delivery_state : 임의값[1]
     	
     	3. 재고 감소 [ 제품 업데이트 ]
     	4. 카트세션 초기화
     */
     // ajax 이용한 매개변수 요청
    String order_name = request.getParameter("order_name");
    String order_phone = request.getParameter("order_phone");
    String order_address = request.getParameter("order_address");
    int order_pay = Integer.parseInt(request.getParameter("order_pay")); 
    String order_payment = request.getParameter("order_payment");
    int delivery_pay = Integer.parseInt(request.getParameter("delivery_pay"));
    String order_contents = request.getParameter("order_request");
    // login 세션 호출
  	Login login = (Login)session.getAttribute("login");
    //객체화
    Porder porder = new Porder(login.getM_num(), order_name, order_phone, order_address, order_pay,
    		order_payment, delivery_pay, order_contents);
    
    //카트세션
    //장바구니 세션 이름 [ 이름 : cart+아이디 값 : cart리스트 ]
    String sname = "cart"+login.getM_id();
    ArrayList<Cart> carts = (ArrayList<Cart>)session.getAttribute(sname);
    
    //db 실행
    boolean result = PorderDao.getPorderDao().orderwrite(porder, carts);
    if(result) {
    	out.print("1");
    	session.setAttribute(sname, null);
    }else {
    	out.print("2");
    }
    %>
    
    