<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
	
	header{ /* ��� �±� */
		width : 1150px;	/* ���α��� */
		height: 100px; /* ���̾ƿ��� */
		margin: 0 auto; /* �ڽ��� ��� ���� */
		
	}
	#main_img{ /**/
		width: 100%;	/* ���α��� : ����� [����Ͱ� ǥ���� �� �ִ� 100% ����ϰڴ�.]*/
		height: 250px;	/* ���� */
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
		clear: both; /* ���� float ���� */
	}
</style>

</head>
<body>


	<!-- 1. ���̾ƿ�(display block = > ��ĭ ���� -->
	<!--  -->
	
				<!-- div ����ص� ���� -->
		<%@include file="2.header.jsp" %>
	
				<!-- div ó�� ���� ������ -->
		<%@include file="3.mainimage.jsp" %>
	
		<%@include file="4.maintext.jsp" %>	
	
		<%@include file="5.footer.jsp" %>	
	
</body>
</html>