package Test;

public class Member {

	
	//필드
	public static String m_id;
	public static String m_pw;
	public static String m_name;
	public static String m_phone;
	
	
	//생성자
	
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		
	}
	public Member() {
		
	}
	
	//메소드
	
	public static boolean signup() {
		System.out.println("----------회원가입----------");
		System.out.print("아이디를 입력하세요 : "); String m_id = BookApplication.scanner.next();
		boolean check = idcheck(m_id);
		if(check) {
			System.out.println("중복된 아이디가 존재합니다.");
			return false;
		}
		System.out.print("비밀번호를 입력하세요 : "); String m_pw = BookApplication.scanner.next();
		System.out.print("이름을 입력하세요 : "); String m_name = BookApplication.scanner.next();
		System.out.print("연락처를 입력하세요 : "); String m_phone = BookApplication.scanner.next();
		Member member = new Member(m_id, m_pw, m_name, m_phone);
		for(int i =0; i < BookApplication.member.length; i++) {
			if(BookApplication.member[i] == null) {
				BookApplication.member[i] = member;
				System.out.println("회원가입이 완료되었습니다.");
				return true;
			}
		}
		return false;
	}
	public static String login() {
		System.out.println("----------------로그인-------------");
		System.out.print("아이디를 입력하세요 : "); String m_id = BookApplication.scanner.next();
		System.out.print("비밀번호를 입력하세요 : "); String m_pw = BookApplication.scanner.next();
		
		for(int i=0; i < BookApplication.member.length; i++) {
			if(BookApplication.member[i] != null && BookApplication.member[i].getM_id().equals(m_id) &&
					BookApplication.member[i].getM_pw().equals(m_pw)) {
				System.out.println("로그인이 성공되었습니다.");
				return m_id;
			}
		}
		return null;
	}
	public static boolean idcheck (String check_id) {
		for(int i=0; i < BookApplication.member.length; i++) {
			if(BookApplication.member[i] != null && BookApplication.member[i].getM_id().equals(m_id) ) {
				return true;
			}
		}
		return false;
	}
	public static String findid() {
		System.out.print("이름을 입력하세요 : "); String m_name = BookApplication.scanner.next();
		System.out.print("연락처를 입력하세요 : "); String m_phone = BookApplication.scanner.next();
		
		for(int i=0; i < BookApplication.member.length; i++) {
			if(BookApplication.member[i] != null && BookApplication.member[i].getM_name().equals(m_name) &&
					BookApplication.member[i].getM_phone().equals(m_phone)) {
				System.out.println("사용자의 아이디는  : "+ BookApplication.member[i].getM_id());		
			}else {
				System.out.println("입력하신 정보가 존재하지 않습니다."); 
				break;
			}
				
		}
		return null;
	}
	public static String findpw () {
		System.out.print("이름을 입력하세요 : "); String m_name = BookApplication.scanner.next();
		System.out.print("연락처를 입력하세요 : "); String m_phone = BookApplication.scanner.next();
		
		for(int i=0; i < BookApplication.member.length; i++) {
			if(BookApplication.member[i] != null && BookApplication.member[i].getM_name().equals(m_name) &&
					BookApplication.member[i].getM_phone().equals(m_phone)) {
				System.out.println("사용자의 아이디는  : "+ BookApplication.member[i].getM_id());		
			}else {
				System.out.println("입력하신 정보가 존재하지 않습니다."); 
				break;
			}
				
		}
		return null;
	}
	public static String getM_id() {
		return m_id;
	}
	public static void setM_id(String m_id) {
		Member.m_id = m_id;
	}
	public static String getM_pw() {
		return m_pw;
	}
	public static void setM_pw(String m_pw) {
		Member.m_pw = m_pw;
	}
	public static String getM_name() {
		return m_name;
	}
	public static void setM_name(String m_name) {
		Member.m_name = m_name;
	}
	public static String getM_phone() {
		return m_phone;
	}
	public static void setM_phone(String m_phone) {
		Member.m_phone = m_phone;
	}
}
