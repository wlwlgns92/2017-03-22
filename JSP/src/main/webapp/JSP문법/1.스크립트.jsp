<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<p> JSP( java sever page) �ڹ� ���� ������ : ����Ʈ�� �ڹٶ� ������. </p>
	<<ul>
		<li> 1. HTML + java �ڵ带 ������ �� �ִ� ������ </li>
		<li> 2. Servlet(����) �����α׷��� </li>
		<li> 3. [ ���� ] java -> �����α׷���(���� : java,html ����) -> JSP[ java+HTML ] </li>
		<li> 4. JSP���ϳ� java+HTML+css+js ��� �ۼ� ���� </li>
		<li> 5. jsp ���������� -> ����[java]�� ��ȯ!!</li>
		<li> 6. ����� : java ���� �±� �ȿ��� �ۼ�</li>
		<li></li>
	</ul>
	
	<h1> ��ũ��Ʈ �� </h1><!-- html ���� -->
	
	<!-- ����, ��ũ��Ʈ �±��� �������� " ! " ���� -->
	<!-- jsp ���� (���� �±� : ����[��������]���� o ,�޼ҵ� ����o  ��� x) -->
	<%! String ���ڿ� = "jsp ����"; %>	
	<%! public String �޼ҵ�() { return "jsp �޼ҵ弱��";}  %>
	
	
	<!-- jsp ���� (��ũ��Ʈ �±� : ����[��������]����o, ����o, �޼ҵ弱��x) -->
	<% 
	String ��ũ��Ʈ = "jsp ��ũ��Ʈ"; 
	String ���� = "jsp �Դϴ�."; 
	System.out.print("�ֿܼ� ����ϴ� �޼ҵ�"); // �ܼ����
	out.print("HTML�� ����ϴ� �޼ҵ�");	// out : ��ũ��Ʈ �±� ������ -> html
	%>
		<!-- html ���� -->
	<br> ���� ��� : <%=���ڿ� %> <!-- ǥ���� �±� ����,�޼ҵ� ȣ�� -->
	<br> �޼ҵ� ��� : <%=�޼ҵ�() %>
	<br> ��ũ��Ʈ ��� : <%=��ũ��Ʈ %>
	
		<!-- �ּ� -->
	<br> html : <!-- HTML �ּ� -->
	<br> css : /* */
	<br> jsp : <%-- jsp �ּ� --%>
	<br> jsp : <% /*������ �ּ�*/ , //�����ּ� %>
	
	
</body>
</html>