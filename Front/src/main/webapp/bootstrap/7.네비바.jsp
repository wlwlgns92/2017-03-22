<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file="1.Bootstrap.jsp" %>
	
	<div class="container"> <!-- 박스권 -->
	
	
		<nav class="navbar navbar-expand-md navbar-light fixed-bottom" style="background-color: red">  
														<!-- fixed-top : 위에 고정 --> <!-- fixed-bottom : 아래 고정 -->
		
			<a class="navbar-brand" href="#"> 로고 </a>
			
			<!-- 메뉴 없어질경우 버튼 -->
			 <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarcontents" 
		    	aria-controls="navbarcontents" aria-expanded="false" aria-label="Toggle navi">
    		<span class="navbar-toggler-icon"></span>
  			</button>
			
			<div class="collapse navbar-collapse" id="navbarcontents">
				<ul class="navbar-nav">
					<li class="nav-item active"><a href="#" class="nav-link"> 메뉴1 </a></li>
					<li class="nav-item"><a href="#" class="nav-link"> 메뉴2 </a></li>
					<li class="nav-item"><a href="#" class="nav-link"> 메뉴3 </a></li>
					
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						 드랍다운 
						 
						 </a>
						
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#"> 드랍다운 메뉴1 </a>
							<a class="dropdown-item" href="#"> 드랍다운 메뉴2 </a>
							<a class="dropdown-item" href="#"> 드랍다운 메뉴3 </a>
						</div>
					</li>
				</ul>
				
				<form class="form-inline">
					<input type="text" class="form-control" placeholder="검색어">
					<button class="btn btn-info" type="submit">검색</button>
				</form>
				
			</div>
		</nav>
	</div>
</body>
</html>