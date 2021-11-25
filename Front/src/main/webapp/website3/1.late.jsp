<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
	#a, #b, #c, #d, #e, #f, #g, #h, #i, #j, #k, #l{
	width: 100px; height: 60px;
	background-color: yellow; border: solid 1px black;
	}
	
	#b{ 
	position: relative; /* 상대 위치(기준 : 현div 시작점 위치 ) */
	left: 60px; top: 30px;
	background-color: red;
	}
	
	#e{
	 position: :absolute; /* 절대 위치(기준 : body 시작점 위치 ) */
	 left: 80px; top: 50px;
	 background-color: red;
	}
	
	#parent{
		width: 350px; height: 200px;
		border: solid 1px red;
		position: relative; /*현 div 기준으로 절대값 지정 가능 */
	}
	
	#h{
		position: absolute; left: 30px; top: 30px;
	}
	
	#parent2{
		width: 350px; height: 200px;
		border: solid 1px red;
	}
	#h2{
		position: absolute; left: 30px; top: 30px;
	}
	
	#k{
	position: fixed; /* 화면 내 위치고정 스크롤을 내려도 그대로 고정 */
	top: 30px; left: 100px;
	}

</style>
</head>
<body>
	
	
	<h3>상대 위치 지정</h3>
	<div id="a">요소 A</div>
	<div id="b">요소 B</div>
	<div id="c">요소 C</div>
	
	
	<h3> 절대 위치 지정 </h3>
	<div id="d">요소 D</div>
	<div id="e">요소 E</div>
	<div id="f">요소 F</div>
	
	
	<h3> Relative 사용 경우 절대 위치 지정</h3>
	<div id="parent">
		<div id="g">요소 G</div>
		<div id="h">요소 H</div>
		<div id="i">요소 I</div>
	</div>
	
	<h3> Relative 없을 경우 절대 위치 지정</h3>
	<div id="parent2">
		<div id="g">요소 G</div>
		<div id="h2">요소 H</div>
		<div id="i">요소 I</div>
	</div>
	
	<h3> 위치 고정</h3>
		<div id="j">요소 J</div>
		<div id="k">요소 K</div>
		<div id="l">요소 L</div>
	
</body>
</html>