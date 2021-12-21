<%@page import="org.json.simple.JSONArray"%>
<%@page import="com.mysql.cj.xdevapi.JsonArray"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="com.mysql.cj.xdevapi.JsonParser"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../header.jsp" %>
	<div class="container">
		<table class="table">
		<%
		// api 가져오기 [ json 형식 ]
		
		// 1. 요청 URL 가져오기 
		URL url = new URL("https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=300&serviceKey=Rv4J5wKLCNPTapOawmbvq99KLX%2B5hSZc5eqxqdyVNbIm1akpCdEcL%2B7uHXtzjU4K7E%2FDM5Hue6BtMDHZrYMt5Q%3D%3D");
		// 2. 스트림 버퍼를 통한 URL내 HTML 읽어오기
		BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8" ) );
			// BufferedReader : 외부 [이클립스] 입출력 버퍼 [ 통신 데이터 저장소 ]
				// InputStreamReader(스트림, "인코딩타입"); 입출력 스트림
					// url.openStream(): 바이트 단위로 url 내용 읽기
		// 3. 일어온 내용 문자열 담기
		String result = bf.readLine();
				System.out.print(result);
				// .readLine() 모든줄 읽어오기
		// 3. 읽어온 내용을 json으로 파싱 하기
		JSONParser jsonParser = new JSONParser();
				//JSONParser json데이터 넣어서 파싱
					// Jsonobject로 형변환
			JSONObject jsonObject = (JSONObject)jsonParser.parse(result);
		JSONArray jsonArray = (JSONArray)jsonObject.get("data");
		// "data" 라는 키 요청해서 배열 담기
		// 확인  : System.out.print("data 키 호출 배열 담기 : "+ jsonArray);
		for(int i =0; i < jsonArray.size(); i++) {
			JSONObject content = (JSONObject)jsonArray.get(i);
			System.out.println(content);
		%>
		<tr> <!-- json명.get("키") -->
			<td><%=content.get("facilityName") %></td> 
		</tr>
		<%	
		}
		%>
		</table>
	</div>
</body>
</html>