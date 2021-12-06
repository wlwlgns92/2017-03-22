<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		
		boolean logincheck = false;
		for( Member member : members ) {
			if(member. getId().equals(id) && member.getPw().equals(pw)) {
				
				logincheck = true;
				
					session.setAttribute("loginid", member.getId());
					
					//session.setMaxInactiveInterval(10);
				response.sendRedirect("main.jsp");
			}
		}
		if(!logincheck) { response.sendRedirect("login.jsp?result=fail");	} // URL 요청 변수도 같이 이동	
	%>
</body>
</html>