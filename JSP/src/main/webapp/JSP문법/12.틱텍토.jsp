<%@page import="java.util.Random"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!	String[] 게임판 = {" ", " ", " ", " ", " ", " ", " ", " ", " "}; %>
	<%
	out.print(Arrays.toString(게임판));
	%>
	<form action="12.틱텍토.jsp" method="get">
	<%for(int i = 0; i < 게임판.length; i++) { %>
			<button type="submit" value="<%=i %>" name="<%=i %>"> <%=i %>버튼 </button> 
				<!-- type=전송 value = i번째 name i번째 인덱스 -->
		<% if(i%3==2) { out.print("<br>");}
	}	
		for(int i =0; i < 게임판.length; i++) {
			if( request.getParameter(i+"") != null && request.getParameter(i+"").equals(i+"") && 게임판[1].equals(i+"")){
				out.print(i+"번선택 ");
				게임판[i]= "o";
			}
		}
		while(true) {
			Random random = new Random();
			int com = random.nextInt(9);
			
			if( 게임판[com].equals(" ") ) { 게임판[com] = "x"; break; }
		}
	%>

	<%
			//while(true) {
				
				//if(게임판[사용자].equals("[ ]")) {
					//게임판[사용자] = "[o]";
					//break;
				//}
				//else { out.print("이미 둔 자리입니다."); }
				
			//}
		%>
	
	</form>
	
		
		
		
	
	
	
</body>
</html>