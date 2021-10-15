package Day11;

public class LoginExample {

	public static void main(String[] args) {
		try {
		login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws Exception{
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디 존재하지 않습니다.");
		}
		if (!password.equals(password)) {
			throw new WrongPasswordException("비밀번호가 다릅니다.");
		}
	}
}
