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
	position: relative; /* ��� ��ġ(���� : ��div ������ ��ġ ) */
	left: 60px; top: 30px;
	background-color: red;
	}
	
	#e{
	 position: :absolute; /* ���� ��ġ(���� : body ������ ��ġ ) */
	 left: 80px; top: 50px;
	 background-color: red;
	}
	
	#parent{
		width: 350px; height: 200px;
		border: solid 1px red;
		position: relative; /*�� div �������� ���밪 ���� ���� */
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
	position: fixed; /* ȭ�� �� ��ġ���� ��ũ���� ������ �״�� ���� */
	top: 30px; left: 100px;
	}

</style>
</head>
<body>
	
	
	<h3>��� ��ġ ����</h3>
	<div id="a">��� A</div>
	<div id="b">��� B</div>
	<div id="c">��� C</div>
	
	
	<h3> ���� ��ġ ���� </h3>
	<div id="d">��� D</div>
	<div id="e">��� E</div>
	<div id="f">��� F</div>
	
	
	<h3> Relative ��� ��� ���� ��ġ ����</h3>
	<div id="parent">
		<div id="g">��� G</div>
		<div id="h">��� H</div>
		<div id="i">��� I</div>
	</div>
	
	<h3> Relative ���� ��� ���� ��ġ ����</h3>
	<div id="parent2">
		<div id="g">��� G</div>
		<div id="h2">��� H</div>
		<div id="i">��� I</div>
	</div>
	
	<h3> ��ġ ����</h3>
		<div id="j">��� J</div>
		<div id="k">��� K</div>
		<div id="l">��� L</div>
	
</body>
</html>