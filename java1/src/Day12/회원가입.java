package Day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class 회원가입 {

	
	
	//필드 [ 메모리 = 저장 ] 
	
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
		
	// 생성자
	public 회원가입() {
		}
	public 회원가입(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}


	//메소드 private 필드 사용시 get, set필요 [ 다른 클래스에서 접근 불가 ]
	//로그인 메소드
	//회원가입 메소드 
	public static void login() {
		
	}
	public static void signup() {
		//입력객체 가져오기
		Scanner scanner = 로그인회원가입.scanner;

	
		// 1. 입력
		System.out.println("-----------회원가입----------"); 
		System.out.print("사용하실 ID를 입력해주세요 : "); String m_id = scanner.next();
		System.out.print("사용하실 PW를 입력해주세요 : "); String m_pw = scanner.next();
		System.out.print("사용자의 성함을 입력해주세요 : "); String m_name = scanner.next();
		System.out.print("사용자의 연락처를 입력해주세요 : "); String m_phone = scanner.next();
		
		// 2. 객체 생성
		회원가입 member = new 회원가입(m_id, m_pw, m_name, m_phone);
		
		
		// 배열에저장
		for(int i =0; i < 로그인회원가입.Members.length; i++) {
			if(로그인회원가입.Members[i] == null) {
				로그인회원가입.Members[i] = member; break;
			}
		}
			
		
		
		
		// 3. 파일 저장
			// 1. 회원별[\n] 필드별[ , ] 파일 저장 
		
		
			try {
				
				FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/2017-03-22/java1/src/Day12/memberlist.txt",true);
				// 객체 내보내기 [ 필드구분 ]
				String out = member.m_id+","+member.m_pw+","+member.m_name+","+member.m_phone+"\n";
				fileOutputStream.write(out.getBytes());
			} 
			catch (Exception e) {
				System.out.println( " 파일저장 실패 "+e);
			}
		}
		
		


	
	
	
	
	public String getM_id() {
		return m_id;
	}


	public void setM_id(String m_id) {
		this.m_id = m_id;
	}


	public String getM_pw() {
		return m_pw;
	}


	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}


	public String getM_name() {
		return m_name;
	}


	public void setM_name(String m_name) {
		this.m_name = m_name;
	}


	public String getM_phone() {
		return m_phone;
	}


	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	
	
	
	
	
}
