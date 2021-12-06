<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 만약에 로그인이 되어있는경우 -->
	<%
	//로그인이[세션]이 되어있는경우
	if (session.getAttribute("loginid") != null) {
		response.sendRedirect("../main.jsp");
		out.print("<script>alert('로그인이되어있습니다.');</script>");
		out.println("<script>location.href='../main.jsp';</script>");
	}
	
	%>
	<%@include file="../header.jsp" %>
	
	<div class="container">
		<div class="text-center">
			<h3 style="border-bottom: solid 1px #eeeee;"> 로그인  </h3>
			<br>
		</div>
			<div class="row m-3">
				<div class="col-md-6">
					<img alt="" src="../../img/무신사.jpg" width="80%" class="m-5">
				</div>
			<div class="col-md-6 align-self-center">
						<!-- 가운데 정렬 -->
				<form action="../../controller/logincontroller.jsp" method="post">
					<div class="row">
							<div class="col-md-3 m2"><label>아이디</label> </div>
							<div class="col-md-8"><input type="text" name="id" class="form-control" maxlength="15">  </div>
					</div>
						
					<div class="row">
							<div class="col-md-3 m2"><label>비밀번호</label> </div>
							<div class="col-md-8"><input type="password" name="password" class="form-control" maxlength="15">  </div>
					</div>
						<%
							String result = request.getParameter("result");
							if(result != null ) {
								%>
								<div>
									<span> 회원정보가 올바르지 않습니다.</span>
								</div>
								<%
							}
						%>
					<div>
						<div>
							<input type="submit" value="로그인" class="form-control p-3 m-3">
						</div>
						<div class="text-right m-2">
							<a href="#" class="btn text-dark"> 아이디 찾기</a>	
							<a href="#" class="btn text-dark"> 비밀번호 찾기</a>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>