package Day06;

public class Member {
	//13 필드
	String name;
	String id;
	String password; 
	int age;
	
	//14 생성자 : 
	public Member(String name, String id) {
		this .name = name;
		this.id=id;
	}
		
		//15 메소드  (로그인 로그아웃)
			//1. 로그인 메소드[인서 : id , password 반환 : true]
		boolean login(String id, String passwod) {
			if (id.equals("hong") && password.equals("1234")) {
				return true;
			}else {
				return false;
			}
		}
		void logout (String id ) {
			System.out.println(id+" 님 로그아웃 되었습니다.");
		}
	
	
	
		
}
