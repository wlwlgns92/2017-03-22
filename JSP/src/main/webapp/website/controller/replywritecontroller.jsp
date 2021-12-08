<%@page import="dto.Login"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Reply"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

    <%

    request.setCharacterEncoding("UTF-8");
    String contents = request.getParameter("contents");
    int b_num = Integer.parseInt(request.getParameter("b_num"));
   
    
    contents = contents.replaceAll("<","&lt;").replaceAll(">","&gt;").replaceAll("\n","<br>");
    
    Login login = (Login)session.getAttribute("login");
    int m_num = login.getM_num();
    Reply reply = new Reply(contents, m_num, b_num);
    
    boolean result = BoardDao.getBoardDao().replywrite(reply);
    
    if(result) {
    	out.print("<script>alert('댓글이 등록 되었습니다.');</script>");
    	out.println("<script>location.href='../view/board/boardview.jsp?b_num="+b_num+"';</script>");
    }else {
    	response.sendRedirect("../view/board/boardlist.jsp");
    }
    
    %>
