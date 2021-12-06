<%@page import="Test.Board"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="Test.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h3><a href="main.jsp"> header 페이지 구역 </h3>
		<br><br><br>
		<%
		
		String loginid = (String)session.getAttribute("loginid"); // 세션 호출
		%>
		
		
		<%
		// 회원 부분
		ArrayList<Member> members = new ArrayList<>(); // 회원 초기화 
		// 파일입력스트림 선언 
		FileInputStream fileInputStream = new FileInputStream("D:/조지훈/JSP/src/main/java/Test/smemberList.txt");
		byte[] bytes = new byte[1000]; // 읽어올 바이트를 저장할 바이트배열
		fileInputStream.read(bytes); // 파일을 읽고 바이트배열에 저장
		String smember = new String(bytes); // 바이트 배열을 문자열로 변환
		String[] ssmember = smember.split("\n"); // 문자열 분해 [\n] 회원구분
		for(int i = 0; i < ssmember.length-1; i++) { // 마지막에 들어간 \n을 제외하기 위해 -1
			
			// 객체화 
			Member member = new Member(ssmember[i].split(",")[0],
										ssmember[i].split(",")[1],
										ssmember[i].split(",")[2]);
			members.add(member); // 리스트에 저장
		}
		// 게시물 부분
		ArrayList<Board> boards = new ArrayList<>();
		fileInputStream = new FileInputStream("D:/조지훈/JSP/src/main/java/Test/boardList.txt");
		bytes = new byte[1000];
		fileInputStream.read(bytes);
		String sboard = new String(bytes);
		String[] ssboard = sboard.split("\n");
		for(int i = 0; i < ssboard.length-1; i++) {
			
			Board board = new Board(ssboard[i].split(",")[0], ssboard[i].split(",")[1], ssboard[i].split(",")[2]);
			
			boards.add(board);
			 
		}
		fileInputStream.close();
		%>
		
		<ul>
			<% if(loginid != null) { out.print("<li>"+loginid+"님 안녕하세요</li>"); } %>
			<% if(loginid != null) { %>
				<li> <a href="logout.jsp"> 로그아웃</a> </li>
			<%} %>
			<li><a href="login.jsp"> 로그인 </a></li>
			<li><a href="signup.jsp"> 회원가입</a></li>
			<li><a href="boardlist.jsp">게시판</a></li>
		</ul>
</body>
</html>