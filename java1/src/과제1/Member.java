package 과제1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Member {
	
	private String id;
	private String password;
	private String name;
	private String phone;
	
	public Member() {
	
	}

	public Member(String id, String password, String name, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}

	// 로그인
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public static void signup() {
		Scanner scanner = Memberfile.scanner;
		System.out.print("아이디를 입력하세요 : "); String id = scanner.next();
		System.out.print("비밀번호를 입력하세요 : "); String password = scanner.next();
		System.out.print("이름을 입력하세요 : "); String name = scanner.next();
		System.out.print("연락처를 입력하세요 : "); String phone = scanner.next();
		
		Member member = new Member(id, password, name, phone);
		
		for(int i =0; i< Memberfile.members.length; i++) {
			if(Memberfile.members[i] == null) {
				Memberfile.members[i] = member; break;
			}
		}
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/PC/git/2017-03-22/java1/src/과제1/member.txt");
			String outString = member.id+","+member.password+","+member.name+","+member.phone+"\n";
			
			fileOutputStream.write(outString.getBytes());
		} catch (Exception e) {}
		
	}
	
	public static void login() {
		Scanner scanner = Memberfile.scanner;
		System.out.print("아이디를 입력하세요 : "); String id = scanner.next();
		System.out.print("비밀번호를 입력하세요 : "); String password = scanner.next();
		
		Member member = new Member(id, password);
		
		for(int i = 0; i < Memberfile.members.length; i++) {
			if(Memberfile.members[i] == null) {
				Memberfile.members[i] = member; break;
			}
		}	
		byte[] bs = new byte[1024];
		try {
			FileInputStream fileInputStream = new FileInputStream("C:/Users/PC/git/2017-03-22/java1/src/과제1/member.txt");
			fileInputStream.read(bs);
			String 회원정보 = new String(bs);
			String[] 회배 = 회원정보.split(",");
			
			for(int i = 0; i < 회배.length; i++) {
				
				if(member.id.equals(회배[i]) && member.password.equals(회배[i])) {
					System.out.println("로그인 성공"); break;
				}else {
					System.out.println("로그인 실패");
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
