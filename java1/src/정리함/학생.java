package 정리함;



public class 학생 extends Top{

	static String s_id;
	static String s_pw;
	static String s_birth;
	static String s_phone;
	static String s_name;
	
	public 학생(String s_id, String s_pw, String s_birth, String s_phone, String s_name) {
		this.s_id = s_id;
		this.s_pw = s_pw;
		this.s_birth = s_birth;
		this.s_phone = s_phone;
		this.s_name = s_name;	
	}
	
	public boolean signup() {
		System.out.println("========회원가입 페이지=========");
		System.out.print(" 사용하실 학번을 입력해주세요 : "); 	String s_id = Total.scanner.next();
		boolean check = idcheck(s_id);
		System.out.print("사용하실 비밀번호 비밀번호 : ");	String s_pw = Total.scanner.next();
		System.out.print("학생 본인의 생년월일을 입력해주세요 : ");	String s_birth = Total.scanner.next();
		System.out.print("학생 본인의 연락처를 입력해주세요 : ");		String s_phone = Total.scanner.next(); 
		System.out.print("학생 본인의 이름을 입력해주세요 : ");		String s_name = Total.scanner.next();
		
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println();
		// 2. 객체 생성
		학생 학생1 = new 학생(s_id, s_pw, s_birth, s_phone, s_name);
		
		// 3. 배열에 넣기
		for( int i = 0 ; i<Total.학생.length; i++ ) {
			if( Total.학생[i] == null ) {
				Total.학생[i] = 학생1;
				return true; 
			}		
		}
		return false;
	}
	public String login() {
		System.out.println("--------------로그인---------------");
		System.out.println("학번을 입력해 주세요 : "); String s_id = Total.scanner.next();
		System.out.println("비밀번호를 입력해 주세요 : "); String s_pw = Total.scanner.next();
		
		for(int i=0; i < Total.학생.length; i++) {
			if (Total.학생[i] != null && 
					Total.학생[i].getS_id().equals(s_id) &&
					Total.학생[i].getS_pw().equals(s_pw)) {
					return s_id;
			} 
		} return null;
	}
	
	public static boolean idcheck(String check_id) { 
		for(int i = 0; i < Total.학생.length; i++) {
			if( Total.학생[i] != null &&  Total.학생[i].getS_id().equals(check_id)) {
				System.out.println("[알림] 중복된 아이디가 있습니다."); return true;
			}
		}return false;
	}
	public String findid() { 
		System.out.println("--------------아이디 찾기---------------");
		System.out.println("학생 본인 성함을 입력해 주세요 : "); String s_name = Total.scanner.next();
		System.out.println("학생 본인 생년월일을 입력해 주세요 : "); String s_birth = Total.scanner.next();
		System.out.println("학생 본인 연락처를 입력해 주세요 : "); String s_phone = Total.scanner.next();
		
		for(int i = 0 ; i < Total.학생.length; i++) {
			if(Total.학생[i] != null && Total.학생[i].getS_name().equals(s_name) &&
					Total.학생[i].getS_birth().equals(s_birth) && 
					Total.학생[i].getS_phone().equals(s_phone)) {
				System.out.println();
				System.out.println("학번은 : " + Total.학생[i].getS_id()); break;
			}else {System.out.println("입력하신 정보가 존재하지 않습니다.");}
		}
			return null;
	}
	public String findpw() {
		System.out.println("--------------아이디 찾기---------------");
		System.out.println("학생 본인 성함을 입력해 주세요 : "); String s_name = Total.scanner.next();
		System.out.println("학생 본인 생년월일을 입력해 주세요 : "); String s_birth = Total.scanner.next();
		System.out.println("학생 본인 연락처를 입력해 주세요 : "); String s_phone = Total.scanner.next();
		
		for(int i = 0 ; i < Total.학생.length; i++) {
			if(Total.학생[i] != null && Total.학생[i].getS_name().equals(s_name) &&
					Total.학생[i].getS_birth().equals(s_birth) && 
					Total.학생[i].getS_phone().equals(s_phone)) {
				System.out.println();
				System.out.println("학번은 : " + Total.학생[i].getS_id()); break;
			}else {System.out.println("입력하신 정보가 존재하지 않습니다.");}
		}
			return null;
	}

	public static String getS_id() {
		return s_id;
	}

	public static void setS_id(String s_id) {
		학생.s_id = s_id;
	}

	public static String getS_pw() {
		return s_pw;
	}

	public static void setS_pw(String s_pw) {
		학생.s_pw = s_pw;
	}

	public static String getS_birth() {
		return s_birth;
	}

	public static void setS_birth(String s_birth) {
		학생.s_birth = s_birth;
	}

	public static String getS_phone() {
		return s_phone;
	}

	public static void setS_phone(String s_phone) {
		학생.s_phone = s_phone;
	}

	public static String getS_name() {
		return s_name;
	}

	public static void setS_name(String s_name) {
		학생.s_name = s_name;
	}
	

}
