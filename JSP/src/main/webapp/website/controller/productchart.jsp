<%@page import="dao.PorderDao"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

/* JSONObject jsonObject = new JSONObject();
jsonObject.put("id", "qweqwe");
jsonObject.put("password", "qweqwe"); */
// JSONObject <--> Map
	// JSONObject.put(키 : 값) 엔트리 추가
	String type = request.getParameter("type");
	
	JSONObject jsonObject = new JSONObject();
	
	if(type.equals("1")) {
		jsonObject = PorderDao.getPorderDao().getorderdatecount();
	}else if(type.equals("2")) {
		jsonObject = PorderDao.getPorderDao().getpcount();
	}else if(type.equals("3")) {
		int p_num = Integer.parseInt(request.getParameter("p_num"));
		jsonObject = PorderDao.getPorderDao().getpdatecount(p_num);
	}
	
%>
<%=jsonObject %>