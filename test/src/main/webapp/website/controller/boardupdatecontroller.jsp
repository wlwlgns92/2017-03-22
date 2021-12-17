<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int b_no = Integer.parseInt(request.getParameter("b_no"));
	String title = request.getParameter("title");
	String contents = request.getParameter("contents");
	
	Board board = new Board(b_no, title, contents);
	
	BoardDao.getBoardDao().update(board);
	
	response.sendRedirect("../view/board/boardlist.jsp");
	
%>