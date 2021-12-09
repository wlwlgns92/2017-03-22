<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
   	try{
    request.setCharacterEncoding("UTF-8");
    String folderpath = "C:/Users/505/git/2017-03-22/JSP/src/main/webapp/website/upload";
    MultipartRequest multipartRequest = new MultipartRequest( request , folderpath, 1024*1024*100, "UTF-8", new DefaultFileRenamePolicy() );
    int p_num = Integer.parseInt(multipartRequest.getParameter("p_num"));
	String p_name = multipartRequest.getParameter("p_name");
	int p_price = Integer.parseInt(multipartRequest.getParameter("p_price"));
	String p_category = multipartRequest.getParameter("p_category");
	String p_manufacturer = multipartRequest.getParameter("p_manufacturer");
	String p_size = multipartRequest.getParameter("p_size");
	int p_stock = Integer.parseInt(multipartRequest.getParameter("p_stock"));
	String p_img = multipartRequest.getFilesystemName("p_img");
	String p_contents = multipartRequest.getParameter("p_contents");
    Product product = new Product( p_num, p_name, p_price, p_category, p_manufacturer,
    		p_size, p_stock, p_img, p_contents);
   		
    boolean result = ProductDao.getProductDao().productupdate(product);
    
    if(result) {
    	
    	out.print("<script>alert('수정이 완료 되었습니다.');</script>");
    	out.println("<script>location.href='../view/admin/dashboard.jsp;</script>");
    }else {
		out.print("<script>alert('수정 실패.');</script>");
    	out.println("<script>location.href='../view/admin/productwrite.jsp;</script>");
    }
	}catch(Exception e) {  System.out.print(e); }
    %>
