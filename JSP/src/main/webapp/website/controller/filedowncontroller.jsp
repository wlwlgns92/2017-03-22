<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.nio.Buffer"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	// 파일이름 요청
	request.setCharacterEncoding("UTF-8");	
	String filename = request.getParameter("file");
	String folderpath = request.getSession().getServletContext().getRealPath("website/upload/"+filename);
						// request.getSession().getServletContext().getRealPath("website/upload"+filename); 서버내 경로찾기
	// 서버내 업로드 폴더내 파일 찾아서 파일 객체화
	File file = new File(folderpath);
	// 다운로드 형식 변경
	response.setHeader("Content-Disposition", "attachment;filename="+filename+";");
		// setHeader("다운로드 형식html" , "attachment;filename="+filename+";" )
	// 내보내기 [ 스트림(바이트) ]
		// 1. 배열선언
		byte[] bytes= new byte[(int)file.length()]; // file.length : 파일내 바이트 길이 메소드
			// 만약에 파일이 존재하면
		if(file.isFile()) { // file.isFile() : 파일이 있는지 없는지 유무 확인 
			BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file)); // 입력스트림 [ 파일을 바이트형으로 읽어오기 ]
			BufferedOutputStream outputStream = new BufferedOutputStream(response.getOutputStream()); // 출력스트림 [ 파일을 바이트형으로 내보내기 ] //response.getOutputStream() 클라이언트에게 바이트로 전송
			
			inputStream.read(bytes);
			outputStream.write(bytes);
			/* int count;
			while((count = inputStream.read(bytes) ) != -1 ) { // -1은 바이트가 없다 [ 읽어올게 없다 ]
				outputStream.write(bytes, 0 , count);
			} */
			inputStream.close(); // 입력 스트림 닫기 [ 첨부파일 사용시 꼭 닫기]
			outputStream.close(); // 출력 스트림 닫기 [ 첨부파일 사용시 꼭 닫기] 
		}
		 
		 
%>
