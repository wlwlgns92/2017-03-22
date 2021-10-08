package Test;



public class Member {
	
	
	//필드
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	//생성자
	public Member() {
		}
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	//메소드
	//회원가입
	public static boolean signup() {
		//입력받기
		System.out.println("------------------회원가입--------------");
		System.out.print("사용하실 아이디를 입력해주세요 : "); String m_id = BookApplication.scanner.next();
		boolean check= idcheck(m_id);
		if(check) {
			System.out.println("중복된 아이디가 존재합니다.");
			return false;
		}
		System.out.print("사용하실 비밀번호를 입력해 주세요 : "); String m_pw = BookApplication.scanner.next();
		System.out.print("가입자 본인의 성함을 입력해 주세요 : "); String m_name = BookApplication.scanner.next();
		System.out.print("가입자 본인의 연락처를 입력해 주세요 : "); String m_phone = BookApplication.scanner.next();
		System.out.println();
		
		Member member = new Member(m_id, m_pw, m_name, m_phone);
		for(int i=0; i < BookApplication.members.length; i++ ) {
			if(BookApplication.members[i] == null ) {
				BookApplication.members[i] = member;
				System.out.println("회원가입이 완료되었습니다.");	return true; 
			}
		}
		
		return false;
	}
	public static String login() {
		System.out.println("-----------로그인 페이지-----------");
		System.out.print("아이디를 입력해주세요 : "); String m_id = BookApplication.scanner.next();
		System.out.print("비밀번호를 입력해 주세요 : "); String m_pw = BookApplication.scanner.next();
		
		for(int i=0; i < BookApplication.members.length; i++)
			if(BookApplication.members[i] != null &&
			BookApplication.members[i].getM_id().equals(m_id) &&
			BookApplication.members[i].getM_pw().equals(m_pw)) {
			System.out.println("로그인에 성공하셨습니다.");	return m_id;
			}else System.out.println("등록된 정보가 없습니다.");
	return null;	
	}
	public static String findid() {
		System.out.print("가입자 본인의 성함을 입력해주세요 : "); String m_name = BookApplication.scanner.next();
		System.out.print("가입자 본인의 연락처를 입력해주세요 : "); String m_phone = BookApplication.scanner.next();
		System.out.println();
		
		for(int i = 0; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && 
					BookApplication.members[i].getM_name().equals(m_name) && 
					BookApplication.members[i].getM_phone().equals(m_phone)) {
				System.out.println("가입하신 ID는 : " + BookApplication.members[i].getM_id()+"입니다.");
			}else System.out.println("등록된 정보가 없습니다."); break;
		}
		return null;	
	}
	public static String findpw() {
		System.out.print("가입자 본인의 ID를 입력해주세요 : "); String m_id = BookApplication.scanner.next();
		System.out.print("가입자 본인의 연락처를 입력해주세요 : "); String m_phone = BookApplication.scanner.next();
		
		for(int i = 0; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(m_id) && 
					BookApplication.members[i].getM_phone().equals(m_phone)) {
				System.out.println("가입하신 비밀번호는 : " + BookApplication.members[i].getM_pw()+"입니다.");
			}else System.out.println("등록된 정보가 없습니다.");
		}
		return null;	
	}
	public static boolean idcheck(String check_id) {
		for(int i = 0 ; i < BookApplication.members.length; i++) {
			if(BookApplication.books[i] != null && 
					BookApplication.members[i].getM_id().equals(check_id)) {
				return true;
			}
		}return false;
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
