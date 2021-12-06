<%@page import="dto.Login"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		//db처리
		boolean result = MemberDao.getMemberDao().logincheck(id, password);
		//db결과
			//로그인성공
			if(result) {
				// 세션 부여 [ 내장객체 : 기본값(30분) ]
						//회원번호 찾기
						int m_num = MemberDao.getMemberDao().getmembernum(id);
						// 로그인 객체
					Login login = new Login(m_num, id);
			session.setAttribute("login", login); //세션명, 세션데이터
			response.sendRedirect("../view/main.jsp");
		}
			//로그인실패
		else {
			response.sendRedirect("../view/member/login.jsp?result=fail");
		}
		 
	%>
</body>
</html>