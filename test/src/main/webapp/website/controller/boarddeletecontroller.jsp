<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    int b_no = Integer.parseInt(request.getParameter("b_no"));
    
    BoardDao.getBoardDao().delete(b_no);
    
    response.sendRedirect("../view/board/boardlist.jsp");
    %>