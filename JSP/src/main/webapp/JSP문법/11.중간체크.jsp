<%@page import="java.util.Calendar"%>
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
	int year = 2021; int month = 11; // 검색데이터가 없을 경우에 해당하는 연도, 월 초기값 설정
	
	if(request.getParameter("year") !=null && request.getParameter("month") != null) { // 검색데이터가 있을경우
		year = Integer.parseInt(request.getParameter("year"));
		month = Integer.parseInt(request.getParameter("month"));
	}
	%>
	

	<%

		// 1. 캘린더 객체 선언 => new[x] , 클래스내 객체 호출
		Calendar calendar = Calendar.getInstance(); // 날짜 , 시간
		// 2. 연도, 월, 일
		//int year = calendar.get(calendar.YEAR); // 현재 연도
		//int month = calendar.get(calendar.MONTH)+1; // 현재 월 [1월이 0부터 시작해서 ]
		//int day = calendar.get(calendar.DAY_OF_MONTH); // 현재 일
		
		//현재 월의 1일 설정
		calendar.set(year, month-1 ,1);

			//해당 월의 1일 요일찾기
			int sweek = calendar.get(calendar.DAY_OF_WEEK);
			// 해당 월의 마지막 일 찾기
			int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH); 
	%>
	<h1><%=year %> 년도 <%=month %> 월 </h1>
	<form action="11.중간체크.jsp">
	검색 : <input type="text" name="year" placeholder="연도"> <input type="text" name="month" placeholder="월"> <input type="submit" value="검색">
	</form>
	<table border="1">
		<thead>
			<tr>
				<th> 일요일 </th> <th> 월요일 </th>  <th> 화요일 </th>  <th> 수요일 </th>  <th> 목요일 </th>  <th> 금요일 </th> <th> 토요일 </th>  
			</tr>
		</thead>
		<tbody>
			<tr>
				<% for(int i = 1; i < sweek; i++) { %>
					<td> </td>
				<% } %> 
				<% for(int i = 1; i <=eday; i++) {%>
					<td><%=i %></td>
					
				<%
				if( sweek % 7 == 0) {
				out.print("</tr><tr>");	
				}
				sweek++;
				} %>	
			</tr>
		</tbody>
	</table>
</body>
</html>