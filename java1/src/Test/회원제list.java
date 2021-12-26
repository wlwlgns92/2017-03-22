package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class 회원제list {
	
	// 메인 메뉴 : "1.회원가입 | 2.로그인 | 선택
	// 로그인시 메뉴 : "1.회원정보 | 2.회원수정 | 3.회원탈퇴 | 4.로그아웃 | 선택 : "
	// 경로 : C:/Users/PC/git/2017-03-22/java1/src/과제/
	// 1차시기
	
	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList<User>();
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			FileInputStream fis = new FileInputStream("C:/Users/PC/git/2017-03-22/java1/src/Test/회원제list.txt");
			
			byte[] bs = new byte[1024];
			fis.read(bs);
			String inString = new String(bs);
			
			String[] usernum = inString.split("\n");
			
			for(String temp : usernum) {
				String[] userdata = temp.split(",");
				
				User user = new User(userdata[0], userdata[1], userdata[2]);
				users.add(user);
			}
		} catch (Exception e) {} 
		
		while(true) {
			
			System.out.print("1.회원가입 | 2.로그인 | 선택 :"); int ch = scanner.nextInt();
			if(ch == 1) {
				
				System.out.print("아이디를 입력하세요 : "); String id = scanner.next();
				System.out.print("비밀번호를 입력하세요 : "); String pw = scanner.next();
				System.out.print("이름을 입력하세요 : "); String name = scanner.next();
				
				boolean idcheck = true;
				for(User temp : users) {
					if(temp.getId().equals(id)) {
						System.out.println("이미 사용중인 아이디 입니다.");
						idcheck = false;
						break;
					}
				}
				if(idcheck) {
					System.out.println("회원가입 성공");
					User user = new User(id, pw, name);
					users.add(user);
					
					try {
					FileOutputStream fos = new FileOutputStream("C:/Users/PC/git/2017-03-22/java1/src/Test/회원제list.txt", true);
					String outString = user.getId()+","+user.getPw()+","+user.getName()+"\n";
					fos.write(outString.getBytes());
					} catch (Exception e) { System.out.println("회원가입 실패 : "+ e);}
				}	
			} // 회원가입 긑
			else if (ch == 2) {
				
				System.out.print("아이디를 입력하세요 : "); String id = scanner.next();
				System.out.print("비밀번호를 입력하세요 : "); String pw = scanner.next();
				
				boolean logincheck = true;
				for(User temp : users) {
					if(temp.getId().equals(id) && temp.getPw().equals(pw)) {
						System.out.println("로그인 성공");
						logincheck = false;
						
						while(true) {
							System.out.print("1.회원정보 | 2.회원수정 | 3.회원탈퇴 | 4.로그아웃 | 선택 : "); int ch1 = scanner.nextInt();
							
							if(ch1 == 1) {
								System.out.println("회원님의 아이디는 : "+temp.getId());
								System.out.println("회원님의 성함은 : "+temp.getName());
							}
							else if ( ch1 == 2) {
								System.out.print("수정하실 성함을 입력해 주세요 : "); String newname = scanner.next();
								
								temp.setName(newname);
								
								try {
									FileOutputStream fos = new FileOutputStream("C:/Users/PC/git/2017-03-22/java1/src/Test/회원제list.txt");
									String outString = "";
									for(User temp2 : users) {
										String outtemp = temp2.getId()+","+temp2.getPw()+","+temp2.getName()+"\n";
										outString += outtemp;
									}
									fos.write(outString.getBytes());
								} catch (Exception e) { System.out.println("회원정보 수정 실패 : "+e);}
							}// 수정 끝
							else if (ch1 == 3) {
								users.remove(temp);
								System.out.println("회원탈퇴 ");
								
								try {
									FileOutputStream fos = new FileOutputStream("C:/Users/PC/git/2017-03-22/java1/src/Test/회원제list.txt");
									String outString = "";
									for(User temp2 : users) {
										String outtemp = temp2.getId()+","+temp2.getPw()+","+temp2.getName()+"\n";
										outString += outtemp;
									}
									fos.write(outString.getBytes());
								} catch (Exception e) {System.out.println("회원탈퇴 실패 : " + e);} break;
							}
							else if (ch == 4) {	System.out.println("로그아웃 되었습니다"); break;	}
						} // 로그인 메뉴 while end
						break;
					}
				}

				if(logincheck) {
					System.out.println("일치하는 정보가 없습니다."); 
				}
			}// 로그인 끝
		}
	} // me
}
