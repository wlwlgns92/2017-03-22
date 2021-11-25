<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
	
	header{ /* 헤더 태그 */
		width : 1150px;	/* 가로길이 */
		height: 100px; /* 레이아웃용 */
		margin: 0 auto; /* 박스권 가운데 정렬 */
		
	}
	#main_img{ /**/
		width: 100%;	/* 가로길이 : 백분율 [모니터가 표현할 수 있는 100% 사용하겠다.]*/
		height: 250px;	/* 높이 */
	}
	#contents{
		width: 1150px;
		margin: 0 auto;
	}
	#sub_menu{
		width: 240px;
		float: left;
	}
	#main_contents{
		width: 900px;
		float: right;
		padding: 5px;
	}
	
	footer {
		width: 100%;
		height: 150px;
		clear: both; /* 앞전 float 제거 */
	}
</style>

</head>
<body>


	<!-- 1. 레이아웃(display block = > 한칸 차지 -->
	<!--  -->
	
				<!-- div 사용해도 무관 -->
		<%@include file="2.header.jsp" %>
	
				<!-- div 처럼 구역 나누기 -->
		<%@include file="3.mainimage.jsp" %>
	
		<%@include file="4.maintext.jsp" %>	
	
		<%@include file="5.footer.jsp" %>	
	
</body>
</html>