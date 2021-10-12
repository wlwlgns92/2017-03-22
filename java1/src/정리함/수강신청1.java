package 정리함;

public interface 수강신청1 {
	
	public boolean signup(); //회원가입 메소드.
	public String login(); // 로그인 메소.
	public boolean idcheck(); // 중복체크 메소드
	public String findid(); // 아이디 찾기 메소드
	public String findpw(); // 비밀번호 찾기 메소드


	default void 실행 () { System.out.println("수강신청"); }
}
