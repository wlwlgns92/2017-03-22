<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<%
		request.setCharacterEncoding("EUC-KR"); // ��û�� ���Ǵ� ���ڵ� Ÿ��
		String name = request.getParameter("name");  // request : ��û��ü .getParameter("������") : �ش� ������ ��û
		String color = request.getParameter("color");
	%>
</head>
<body bgcolor=<%=color %>>

	
	
	�̸� : <%=name %>
</body>
</html>