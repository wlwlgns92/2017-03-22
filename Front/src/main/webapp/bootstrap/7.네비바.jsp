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
	
	<div class="container"> <!-- �ڽ��� -->
	
	
		<nav class="navbar navbar-expand-md navbar-light fixed-bottom" style="background-color: red">  
														<!-- fixed-top : ���� ���� --> <!-- fixed-bottom : �Ʒ� ���� -->
		
			<a class="navbar-brand" href="#"> �ΰ� </a>
			
			<!-- �޴� ��������� ��ư -->
			 <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarcontents" 
		    	aria-controls="navbarcontents" aria-expanded="false" aria-label="Toggle navi">
    		<span class="navbar-toggler-icon"></span>
  			</button>
			
			<div class="collapse navbar-collapse" id="navbarcontents">
				<ul class="navbar-nav">
					<li class="nav-item active"><a href="#" class="nav-link"> �޴�1 </a></li>
					<li class="nav-item"><a href="#" class="nav-link"> �޴�2 </a></li>
					<li class="nav-item"><a href="#" class="nav-link"> �޴�3 </a></li>
					
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						 ����ٿ� 
						 
						 </a>
						
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#"> ����ٿ� �޴�1 </a>
							<a class="dropdown-item" href="#"> ����ٿ� �޴�2 </a>
							<a class="dropdown-item" href="#"> ����ٿ� �޴�3 </a>
						</div>
					</li>
				</ul>
				
				<form class="form-inline">
					<input type="text" class="form-control" placeholder="�˻���">
					<button class="btn btn-info" type="submit">�˻�</button>
				</form>
				
			</div>
		</nav>
	</div>
</body>
</html>