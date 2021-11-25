<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
	
	*{border: solid 1px skyblue;}
	
		.hd_top{ width: 1200px; background-color: blue; text-align: center; margin: 0 auto; }
		.hd_btm{ width: 1200px; text-align: center; margin: 0 auto; }
			.hd_Logo{ float: left; width: 22%;}
			.hd_gnb{ float: left; width: 60%;}
			.hd_search{ float: right; width: 17%;}
			
		.main_wrap{ width: 1200px; margin: 0 auto; height: 700px; clear: both;}
			.main_sec01{  margin-bottom: 20px; height: 418px;  }
			.main_sec02{ height: 300px; }
				.main_visu_sec{ float: left; height: 400px; width: 900px;}
				.ms01_ban{ float: right; width:19%; height: 400px;}
		
			.main_sec02{ width: 1200px; margin: 0 auto; height: 280px;}
				.today_box{ width: 19%; float:left; height: 250px;}
				.ms02_box{ width: 25%; float:left; margin-left: 10px;height: 250px; }
		
	</style>
</head>
<body>

	<div>
		<div class="header">
			<div class="hd_top">상단헤더1</div>
			<div class="hd_btm">
				<div class="hd_Logo">로고</div>
				<div class="hd_gnb">메뉴</div>
				<div class="hd_search">검색</div>
			</div>
		</div>
		
		<div class="main_wrap">
			<div class="main_sec01"> 
				<div class="main_visu_sec"></div>
				<ul class="ms01_ban"></ul>
			</div>	
			<div class="main_sec02">
				<div class="today_box"> box1</div>
				<div class="ms02_box"> box2</div>
				<div class="ms02_box"> box3</div>
				<div class="ms02_box"> box4</div>
			</div>
		</div>
		
		<div class="footer">
			<div>푸터</div>
		</div>
	
	</div>
</body>
</html>