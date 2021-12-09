package 과제1;

public class Member { // 1차
	
	// 필드
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	// 생성자
	// 깡통
	public Member() {
	
	}
	
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	//회원가입 메소드
	public static boolean signup() {
		
		System.out.print("사용하실 아이디를 입력해 주세요 :"); String m_id = BookApplication.scanner.next();
			boolean check = idcheck(m_id);
			if(check) {
				System.out.println("사용중인 아이디 입니다.");
				return false;
			}
		System.out.print("사용하실 비밀번호를 입력해 주세요 :"); String m_pw = BookApplication.scanner.next();
		System.out.print("성함을 입력해 주세요 :"); String m_name = BookApplication.scanner.next();
		System.out.print("연락처를 입력해 주세요 :"); String m_phone = BookApplication.scanner.next();
		
		for(int i =0; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] == null) {
				
				Member member = new Member(m_id, m_pw, m_name, m_phone);
				BookApplication.members[i] = member;
				System.out.println("회원가입이 완료되었습니다.");
				return true;
			}
		}
		
		return false;
	}
	//로그인 메소드
	public static String login() {
		System.out.print("아이디를 입력해 주세요 :"); String m_id = BookApplication.scanner.next();
		System.out.print("비밀번호를 입력해 주세요 :"); String m_pw = BookApplication.scanner.next();
		
		for(int i =0; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && BookApplication.members[i].getM_id().equals(m_id) && BookApplication.members[i].getM_pw().equals(m_pw)) {
				System.out.println("로그인 성공");
				return m_id; 
			}
		}
		return null;
	}
	//아이디찾기 메소드
	public static boolean findid() {
		
		System.out.print("성함을 입력해 주세요 :"); String m_name = BookApplication.scanner.next();
		System.out.print("연락처를 입력해 주세요 :"); String m_phone = BookApplication.scanner.next();
		for(int i =0; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && BookApplication.members[i].getM_name().equals(m_name) && BookApplication.members[i].getM_phone().equals(m_phone)) {
				System.out.println("회원님의 아이디는 : " + BookApplication.members[i].getM_id());
				return true;
			}
		}
		return false;
	}
	// 비밀번호찾기 메소드
	public static boolean findpw() {
		
		System.out.print("아이디를 입력해 주세요 :"); String m_id = BookApplication.scanner.next();
		System.out.print("연락처를 입력해 주세요 :"); String m_phone = BookApplication.scanner.next();
		for(int i =0; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && BookApplication.members[i].getM_id().equals(m_id) && BookApplication.members[i].getM_phone().equals(m_phone)) {
				System.out.println("회원님의 비밀번호는 : " + BookApplication.members[i].getM_pw());
				return true;
			}
		}
		return false;
	}
	//중복체크 메소드
	public static boolean idcheck(String m_id) {
		for(int i = 0 ; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && BookApplication.members[i].getM_id().equals(m_id)) {
				return true;
			}
		}
		
		return false;
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
	
	
	
	
	// 모든필드 담는 생성자.
	
	// 회원가입
	
	// 아이디 중복체크
	
	//  로그인
	
	// 아이디찾기
	
	// 비밀번호찾기

}
