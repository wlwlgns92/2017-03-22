<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
*{ text-align: center; }
header { height: 100px; background-color: skyblue; padding: 10px; margin: 10px; border }
footer{ border-top: dotted 2px black; }
.nav{ padding: 10px; background-color: green;}
</style>
</head>
<body>
	<%@include file="1.Bootstrap.jsp" %>
	
	<div class="container">
		<header>
			<h2> �׸��� ���̾ƿ� </h2>
		</header>
		<div class="row">
			<div class=col-md-2">
				<ul >	<!-- nav : inline -->
					<li> �޴�1 </li>
					<li> �޴�2 </li>
					<li> �޴�3 </li>
					<li> �޴�4 </li>
				</ul>
			</div>
			
			<div class="col-md-8">
				<div class="row">
					<div class="col-md-5 offset-2">
						<p>anmsdfjaopsfjopajsdofgjaopgjopajrpogjoparejgpojsaoerpgjopjergpojaorgjpoajergpjaopergjoparejgjgaojrgjgjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj</p>
					</div>
				<div class="col-md-5">
					<p>anmsdfjaopsfjopajsdofgjaopgjopajrpogjoparejgpojsaoerpgjopjergpojaorgjpoajergpjaopergjoparejgjgaojrgjgjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj</p>
				</div>
				</div>
			</div>
			<div class=col-md-2">
				<ul>	<!-- nav : inline -->
					<li> �޴�1 </li>
					<li> �޴�2 </li>
					<li> �޴�3 </li>
					<li> �޴�4 </li>
				</ul>
			</div>
			
		</div>
		<footer>
			����� Ǫ��
		</footer>
	</div>
	
</body>
</html>