<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
		<style type="text/css">
		body{ background-color: black;}
		#main{ background-color: white; width: 700px; margin: 0 auto;}
		h1{ text-shadow: 2px 2px 2px black; text-align: center; color: orange; padding:20px 10px 10px 10px;}
		h3{ text-align: center; color: orange;}
		.row1{ list-style-type: none; color: black;}
		.row1 img{ width: 450px; margin: 10px 80px;}
		.row2{ color: orange; margin: 10px 80px;}
		/* button{ background-color: orange; width: 200px; text-align: center; padding: 5px 10px; margin: 0 auto;} */
		#buttons button {
			background-color: orange; padding: 20px 40px; margin: 30px 10px 50px 10px; font-size: 20px;
		}
		#buttons{
			 width: 700px; text-align: center;
		}
		</style>
</head>
<body>
		<%@ include file="12.메뉴바.jsp" %>
			<div id = "main">
			<h1>스페셜 드레스 샵</h1>
			<h3>Special Dress Shop</h3>
			<ul>
				<li class="row1"> 생일, 결혼기념일, 만난 기념일 등 특별한 날에 스페셜 드레스를 입고 포토존에서 멋진 추억의 사진을 남겨보세요.</li>
				<li class="row1"> <img src="드레스.jpg"> </li>
			</ul>
			<ul>
				<li class="row2"> 기간 : 매주 토/일요일<br> 13:00 ~ 마감시간 전 까지</li>
				<li class="row2"> 장소 : 기념품 판매점 옆 스페셜 드레스<br> ※키즈,커플 드레스도 입고되었어요!</li>
			</ul>
			<div id ="buttons">
				<button>이용요금 및 이용방법</button>
			</div>
			</div>
</body>
</html>