<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    <% 
    int b_num = Integer.parseInt(request.getParameter("b_num")); 
    
    //dbó��
    boolean result = BoardDao.getBoardDao().delete(b_num);
    if(result) {
    	// 1. out.print 2. respomse [������ ��ȯ] 3. alert 
    	out.print("<script>alert('�����Ǿ����ϴ�.');</script>");
    	out.println("<script>location.href='../view/board/boardlist.jsp';</script>");
    	//response.sendRedirect("../view/board/boardlist.jsp");
    }else {
    	response.sendRedirect("../view/board/boardview.jsp?b_num="+b_num);
    }
    //pageó��
    
    %>
    