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
		<%@ include file="12.�޴���.jsp" %>
			<div id = "main">
			<h1>����� �巹�� ��</h1>
			<h3>Special Dress Shop</h3>
			<ul>
				<li class="row1"> ����, ��ȥ�����, ���� ����� �� Ư���� ���� ����� �巹���� �԰� ���������� ���� �߾��� ������ ���ܺ�����.</li>
				<li class="row1"> <img src="�巹��.jpg"> </li>
			</ul>
			<ul>
				<li class="row2"> �Ⱓ : ���� ��/�Ͽ���<br> 13:00 ~ �����ð� �� ����</li>
				<li class="row2"> ��� : ���ǰ �Ǹ��� �� ����� �巹��<br> ��Ű��,Ŀ�� �巹���� �԰�Ǿ����!</li>
			</ul>
			<div id ="buttons">
				<button>�̿��� �� �̿���</button>
			</div>
			</div>
</body>
</html>