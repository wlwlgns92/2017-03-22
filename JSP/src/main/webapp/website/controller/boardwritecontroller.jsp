<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="dto.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	
	<%
		// 1. form [ enctype = "multipart/form-data"]
		// 2. cos.jar 추가
		// 3. MultipartRequest 객체명 = new MultipartRequest(요청방식[request], 업로드 폴더경로, 용량(바이트), 인코딩타입, 보안[new DefaultFileRenamePolicy()] )
		//String folderpath = "D:/조지훈/JSP/src/main/webapp/website/upload";
		String folderpath = request.getSession().getServletContext().getRealPath("website/upload");
		MultipartRequest multi = new MultipartRequest( request, folderpath ,1024*1024*10,"UTF-8",new DefaultFileRenamePolicy() );
		request.setCharacterEncoding("UTF-8");
		
		String title = multi.getParameter("title");
		String contents = multi.getParameter("contents");
		String file = multi.getFilesystemName("file");
		
		// 요청 [ 일반 form ]
		/* String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		String file = request.getParameter("file"); */
		
		// 작성자의 아이디
		Login login = (Login)session.getAttribute("login");
		int m_num = login.getM_num();
		Board board = new Board(title, contents, m_num, file);
		
		// db처리
		BoardDao.getBoardDao().boardwrite(board);
		
		response.sendRedirect("../view/board/boardlist.jsp");
	%>
