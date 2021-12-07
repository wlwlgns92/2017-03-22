<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="dto.Login"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	
	
	String folderpath = request.getSession().getServletContext().getRealPath("website/upload");
	MultipartRequest multi = new MultipartRequest( request, folderpath ,1024*1024*10,"UTF-8",new DefaultFileRenamePolicy() );
	
	
	request.setCharacterEncoding("UTF-8");
	String title = multi.getParameter("title");
	String contents = multi.getParameter("contents");
	// <br> , 프론트 <> 태그 제거
		//contents = contents.replace("\r\n", "<br>");
	contents = contents.replaceAll("<","&lt;").replaceAll(">","&gt;").replaceAll("\n","<br>");
	title = title.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\S)*(/)?","");
	
	// 새로운 파일첨부가 없을경우에 기존파일을 다시 넣는다.
	String file = multi.getFilesystemName("file"); // filesystemname으로 끌어와야한다.
	if(file == null) {
		file = multi.getParameter("oldfile"); // getparameter 로 끌어와야한다.
	}
	
	int b_num = Integer.parseInt(multi.getParameter("b_num")); 
	Board board = new Board(b_num , title , contents , file);
	
	// db처리
	boolean result = BoardDao.getBoardDao().update(board);
	if(result) {
		out.print("<script>alert('수정되었습니다.');</script>");
    	out.println("<script>location.href='../view/board/boardview.jsp?b_num="+b_num+"';</script>");
	}
	response.sendRedirect("../view/board/boardlist.jsp");

%>