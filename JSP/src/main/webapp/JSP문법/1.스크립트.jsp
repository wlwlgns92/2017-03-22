<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<p> JSP( java sever page) 자바 서버 페이지 : 프론트랑 자바랑 섞였다. </p>
	<<ul>
		<li> 1. HTML + java 코드를 삽입할 수 있는 페이지 </li>
		<li> 2. Servlet(서블릿) 웹프로그래밍 </li>
		<li> 3. [ 순서 ] java -> 웹프로그래밍(서블릿 : java,html 별도) -> JSP[ java+HTML ] </li>
		<li> 4. JSP파일내 java+HTML+css+js 모두 작성 가능 </li>
		<li> 5. jsp 실행했을때 -> 서블릿[java]로 변환!!</li>
		<li> 6. 사용방법 : java 사용시 태그 안에서 작성</li>
		<li></li>
	</ul>
	
	<h1> 스크립트 예 </h1><!-- html 구역 -->
	
	<!-- 선언문, 스크립트 태그의 차이점은 " ! " 여부 -->
	<!-- jsp 구역 (선언문 태그 : 변수[전역변수]선언 o ,메소드 선언o  출력 x) -->
	<%! String 문자열 = "jsp 선언문"; %>	
	<%! public String 메소드() { return "jsp 메소드선언";}  %>
	
	
	<!-- jsp 구역 (스크립트 태그 : 변수[지역변수]선언o, 실행o, 메소드선언x) -->
	<% 
	String 스크립트 = "jsp 스크립트"; 
	String 내용 = "jsp 입니다."; 
	System.out.print("콘솔에 출력하는 메소드"); // 콘솔출력
	out.print("HTML에 출력하는 메소드");	// out : 스크립트 태그 나가기 -> html
	%>
		<!-- html 구역 -->
	<br> 선언문 출력 : <%=문자열 %> <!-- 표현식 태그 변수,메소드 호출 -->
	<br> 메소드 출력 : <%=메소드() %>
	<br> 스크립트 출력 : <%=스크립트 %>
	
		<!-- 주석 -->
	<br> html : <!-- HTML 주석 -->
	<br> css : /* */
	<br> jsp : <%-- jsp 주석 --%>
	<br> jsp : <% /*여러줄 주석*/ , //한줄주석 %>
	
	
</body>
</html>