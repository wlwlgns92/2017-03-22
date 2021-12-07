<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    <% 
    int b_num = Integer.parseInt(request.getParameter("b_num")); 
    
    //db처리
    boolean result = BoardDao.getBoardDao().delete(b_num);
    if(result) {
    	// 1. out.print 2. respomse [페이지 전환] 3. alert 
    	out.print("<script>alert('삭제되었습니다.');</script>");
    	out.println("<script>location.href='../view/board/boardlist.jsp';</script>");
    	//response.sendRedirect("../view/board/boardlist.jsp");
    }else {
    	response.sendRedirect("../view/board/boardview.jsp?b_num="+b_num);
    }
    //page처리
    
    %>
    