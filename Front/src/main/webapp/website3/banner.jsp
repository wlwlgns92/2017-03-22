<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
	*{ box-sizing: border-box; }
	
	/* ��� */
	.banner { padding: 15px;}
	.banner li{ padding: 10px; list-style-type: none;}
	.main_image img{ max-width: 100%;}
	.banner p{ margin-top: 10px; line-height: 150%;}


	/* ������ */
	.items{ padding: 15px; background-color: #f9f9f9;}
	.items img{ max-width: 100%;}
	.items ul{ margin-bottom: 15px;}
	.items item li{ padding: 10px; list-style-type: none;}
	
	
	
	</style>
</head>
<body>

	<section class="main_image">
		<img alt="" src="img/main.jpg">
	</section>

	<section class="banners">
		<div class="box">
			<div class="banner col_6 col_m_6">
				<ul>
					<li class="col_3 col_m_6"><img alt="" src="img/icon1.png"> </li>
					<li class="col_9">
						<h3> ���� �ȳ� </h3>
						<p>��Ʃ��� �뿩�� ������ ���ͳ� ������ �ϼž� �մϴ�.<br> ������ 1�� �������� �����մϴ�.</p>
					</li>
				</ul>
			</div>
			
			<div class="banner col_6 col_m_6">
				<ul>
					<li class="col_3 col_m_6"><img alt="" src="img/icon2.png"> </li>
					<li class="col_9">
						<h3> ���� ������</h3>
						<p> ��� ����, ���� ����, ������ ����, ���� ���� �� ���ζǴ� ��ü�� �̿��� �� �ֽ��ϴ�.</p>
					</li>
				</ul>
			</div>
		</div>
	</section>
	
	<section class="items">
		<div class="box">
			<div class="item col_3 col_m_6">
				<ul>
					<li><img alt="" src="img/image1.jpg"> </li>
					<li>�Կ� ��Ʃ���</li>
					<li>ī�޶�, ���� �� �Կ���� �Ϻ�</li>
				</ul>
			</div>
			<div class="item col_3 col_m_6">
				<ul>
					<li><img alt="" src="img/image2.jpg"> </li>
					<li>�Կ� ��Ʃ���</li>
					<li>ī�޶�, ���� �� �Կ���� �Ϻ�</li>
				</ul >
			</div>
			<div class="item col_3 col_m_6">	
				<ul>
					<li><img alt="" src="img/image3.jpg"> </li>
					<li>�Կ� ��Ʃ���</li>
					<li>ī�޶�, ���� �� �Կ���� �Ϻ�</li>
				</ul>
			</div>
			<div class="item col_3 col_m_6">	
				<ul>
					<li><img alt="" src="img/image4.jpg"> </li>
					<li>�Կ� ��Ʃ���</li>
					<li>ī�޶�, ���� �� �Կ���� �Ϻ�</li>
				</ul>
			</div>	
		</div>
	</section>
	
</body>
</html>