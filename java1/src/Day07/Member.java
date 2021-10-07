package Day07;


public class Member {

	//필드 [ 아이디(중복불가), 비밀번호 , 이름 , 연락처 등등]
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	
	//생성자 [객체 생성시 필드의 초기값]
		//1. 회원가입시 생성되는 객체의 생성자
	public Member() {
	}

	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}

	//메소드
		//1. 필드를 private => get, set 사용
		//2. 회원가입 [입력받은 정보로 객체 생성해서 배열에 저장]
	public static boolean signup() {
		

		//입력 받기
		System.out.println("------회원가입---------");
		System.out.print("사용하실 아이디를 입력해주세요 : "); String m_id = BookApplication.scanner.next();
			// 아이디 중복체크
			boolean check = idcheck(m_id);
			if(check) {
				System.out.println("사용할 수 없는 아이디 입니다.");
				return false;
			}
		System.out.print("사용하실 비밀번호를 입력해주세요 : "); String m_pw = BookApplication.scanner.next();
		System.out.print("성명을 입력해 주세요 : "); String m_name = BookApplication.scanner.next();
		System.out.print("연락처를 입력해 주세요 : "); String m_phone = BookApplication.scanner.next();
		System.out.println();
		//2. 입력받은 정보로 객체 생성
		Member member = new Member(m_id, m_pw, m_name, m_phone);
		
		//3. 만든 객체를 배열에 넣기
		for(int i=0; i< BookApplication.members.length; i++) {
			if(BookApplication.members[i] ==null) {
				BookApplication.members[i] = member;
				System.out.println("회원가입이 완료되었습니다.");
				return true;
			}
		}
			return false;
	}
		// public : main이 속한 클래스[외부클래스]로 호출 하기위해서
		// 반환값 : 성공 / 실패 => true / false
	
		//3. 로그인 [입력 받은 아이디와 비밀번호가 배열내 존재하면 로그인 성공 아니면 실패]
	public static String login() {
		
		System.out.println("-------------로그인 화면-------------");
		System.out.print("아이디를 입력해주세요 : "); String m_id = BookApplication.scanner.next();
		System.out.print("비밀번호를 입력해주세요 : "); String m_pw = BookApplication.scanner.next();
		
		for(int i=0; i< BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(m_id) && 
					BookApplication.members[i].getM_pw().equals(m_pw)) {
				return m_id; // 로그인 성공시 성공한 아이디 반환
			}
		}
		return null; //로그인실패
	}
		// 반환값: 로그인 성공시 -> 성공한 아이디 / 실패시 null 
	
		//4. 아이디찾기  (이름,연락처 입력받아 == 아이디 알려주기)
	public static String findid() {
		System.out.println("--------------아이디 찾기------------");
		System.out.print("가입자 성명을 입력해주세요 : "); String m_name = BookApplication.scanner.next();
		System.out.print("가입자 연락처를 입력해주세요 : "); String m_phone = BookApplication.scanner.next();
		for(int i =0; i < BookApplication.members.length; i++ ) {
			if(BookApplication.members[i] != null && 
				BookApplication.members[i].getM_name().equals(m_name) &&
				BookApplication.members[i].getM_phone().equals(m_phone)) {
				System.out.println("가입하신 아이디는 : " + BookApplication.members[i].getM_id());
			}else {System.out.println("입력하신 정보를 찾을수 없습니다."); break;}
				
		}
		return null; // 찾았을경우 id / 실패시 null
	}
		//반환값 : 찾았을경우 => 아이디 / 실패시 null
		//5. 비밀번호 찾기 (아이디 ,연락처 입력받아 == 비밀번호 알려주기)
	public static String findpw() {
		System.out.println("--------------비밀번호 찾기------------");
		System.out.print("가입하신 아이디를 입력해주세요 : "); String m_id = BookApplication.scanner.next();
		System.out.print("가입자 연락처를 입력해주세요 : "); String m_phone = BookApplication.scanner.next();
		for(int i =0; i < BookApplication.members.length; i++ ) {
			if(BookApplication.members[i] != null && 
				BookApplication.members[i].getM_id().equals(m_id) &&
				BookApplication.members[i].getM_phone().equals(m_phone)) {
				System.out.println("가입하신 비밀번호는 : " + BookApplication.members[i].getM_pw());
			}else {
				System.out.println("입력하신 정보를 찾을수 없습니다."); 
				break;
			}
				
		}
		return null; // 찾았을경우 pw / 실패시 null
	}
		//6. 아이디 체크(중복) 메소드
	public static boolean idcheck( String check_id) {
		for(int i =0; i < BookApplication.members.length; i++) {
			if ( BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(check_id)) {
				return true;
			}
		}
		return false; // 배열내 동일한 값이 없을경우
	}
	// 
	//필드에 private 사용 = > get, set 사용
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
