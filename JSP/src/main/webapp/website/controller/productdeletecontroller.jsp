<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	int p_num = Integer.parseInt(request.getParameter("p_num"));
    
    	boolean result = ProductDao.getProductDao().delete(p_num);
    	
    	if(result){
    		out.print("<script>alert('삭제되었습니다.');</script>");
        	out.println("<script>location.href='../view/admin/dashboard.jsp';</script>");
    	}else{
    		response.sendRedirect("../view/admin/dashboard.jsp");
    	}
    	
    %>
