package 정리함;

public class Top implements 수강신청1{

	
	@Override
	public boolean signup() {
		System.out.println("-----회원가입");
		return false;
	
	}

	@Override
	public String login() {
		System.out.println("로그인 되었습니다.");
		return null;
		
	}

	@Override
	public boolean idcheck() {
		System.out.println("중복되는 아이디가 있습니다.");
		return false;
	}

	@Override
	public String findid() {
		System.out.println("아이디는 : ");
		return null;
		
	}

	@Override
	public String findpw() {
		System.out.println("비밀번호는 : ");
		return null;
	}
	
	
	


}
