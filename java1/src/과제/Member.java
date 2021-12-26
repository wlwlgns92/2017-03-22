package 과제;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Member {
	//필드
	private String id;
	private String password;
	private String name;
	private String phone;
	
	//깡통
	public Member() {
	
	}
	// 풀생성자
	public Member(String id, String password, String name, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	public void signup() { // 회원가입 메소드
		
		Scanner scanner = Memberfile.scanner; // Memberfile 에 생성한 스캐너 객체 호출
		
		System.out.println("---------회원가입 페이지------------");
		System.out.println("아이디를 입력해 주세요 : "); String id = scanner.next(); // 아이디 입력
		System.out.println("비밀번호를 입력해 주세요 : "); String password = scanner.next(); // 비밀번호 입력
		System.out.println("이름 입력해 주세요 : "); String name = scanner.next(); // 이름 입력
		System.out.println("연락처를 입력해 주세요 : "); String phone = scanner.next(); // 연락처 입력
		
		Member member = new Member(id, password, name, phone); // 풀생성자를 이용해 객체화
		
		for(int i = 0; i < Memberfile.members.length; i++) { // members의 길이만큼 반복
			if(Memberfile.members[i] == null) { // 배열의 i번째가 null이라면
				Memberfile.members[i] = member; break; // i번째에 member 대입
			}
		}
		try { // 예외
			FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/PC/git/2017-03-22/java1/src/과제/member.txt"); // 해당경로에 member.txt파일 생성
			String outString = member.id+","+member.password+","+member.name+","+member.phone+"\n"; // 변수에 객체에 있는 데이터 +"," 대입 마지막은 한줄 내리기
			fileOutputStream.write(outString.getBytes()); // 바이트로 내보내기 
		} catch (Exception e) {}
		
			
		}
	public void login() {
		
		Scanner scanner = Memberfile.scanner; // 입력
		System.out.println("아이디를 입력하세요 : "); String id = scanner.next(); // 아이디
		System.out.println("비밀번호를 입력하세요 : "); String password = scanner.next(); // 비밀번호
		try {
			byte[] bs = new byte[1024]; // 바이트 배열
			FileInputStream fileInputStream = new FileInputStream("C:/Users/PC/git/2017-03-22/java1/src/과제/member.txt"); // 해당경로의 파일 호출
			fileInputStream.read(bs); // 파일을 읽어 바이트 배열에 저장
			String logindata = new String(bs); // 바이트 배열의 값을 String 으로 변환
			
			for(int i =0; i < Memberfile.login.length; i++) { // login 배열의 길이만큼 반복문 
				if(Memberfile.login[i] == null) { // 배열의 i번째가 null 이면
					Memberfile.login[i] = logindata.split(",");  // ","단위로 쪼개서 배열에 저장 하지만 실패 이유는 모르겠다.
					break;
				}
			}
			
			
		} catch (Exception e) {}
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
