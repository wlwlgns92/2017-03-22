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
	public boolean signup() {
		return true;
	}
		// public : main이 속한 클래스[외부클래스]로 호출 하기위해서
		// 반환값 : 성공 / 실패 => true / false
	
		//3. 로그인 [입력 받은 아이디와 비밀번호가 배열내 존재하면 로그인 성공 아니면 실패]
	public String login() {
		return null; //로그인실패
	}
		// 반환값: 로그인 성공시 -> 성공한 아이디 / 실패시 null 
	
		//4. 아이디찾기  (이름,연락처 입력받아 == 아이디 알려주기)
	public String findid() {
		return null; // 찾았을경우 id / 실패시 null
	}
		//반환값 : 찾았을경우 => 아이디 / 실패시 null
		//5. 비밀번호 찾기 (이름,연락처 입력받아 == 비밀번호 알려주기)
	public String findpw() {
		return null; // 찾았을경우 pw / 실패시 null
	}
		//6. 아이디 체크(중복) 메소드
	public boolean idcheck( String check_id) {
		return true; // 인수와 동일한 아이디가 배열내 존재하면 true
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
