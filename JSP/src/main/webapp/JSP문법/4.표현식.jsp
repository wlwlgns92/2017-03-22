<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3> 표현식 </h3>
	<%! String[] 이름 = {"유재석", "강호동", "신동엽"}; %>
	
	<table border="1" width="200">
		<% // java 시작
			for(int i = 0; i < 이름.length; i++) {
			// java 끝	
		%> 
			<!-- html 시작 -->
		<tr>
			<td> <%=i %> </td> <td> <%=이름[i] %> </td>
		</tr>
		<% 	
		}
		%>
	</table>
	
</body>
</html>