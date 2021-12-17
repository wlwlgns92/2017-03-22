<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String contents = request.getParameter("contents");
	System.out.print(title+ writer + contents);
	Board board = new Board(title, contents, writer);
	
	BoardDao.getBoardDao().b_write(board);
	
	response.sendRedirect("../view/board/boardlist.jsp");
%>