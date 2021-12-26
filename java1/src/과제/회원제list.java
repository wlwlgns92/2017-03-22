package 과제;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class 회원제list {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 입력 객체
		
		ArrayList<User> users = new ArrayList<User>(); // user 클래스만 담을 수 있는 리스트
		
		try { // 예외
			FileInputStream fis = new FileInputStream("C:/Users/82108/git/2017-03-22/java1/src/과제/user.txt"); // 파일내 모든 글자 가져오기
			// 바이트 배열
			byte[] bs = new byte[1024];
			// 읽어온 파일의 바이트를 바이트배열에 저장
			fis.read(bs);
			// 바이트배열을 문자열로 변환 후 변수에 대입
			String inString = new String(bs);
			// String 배열에 변수를 \n단위로 분리해 저장
			String[] usernum = inString.split("\n");
			
			for(String temp : usernum) { // 배열에 담긴 인덱스의 수만큼 반복?
				String[] userdata = temp.split(","); // 변수의 담긴 값을 , 단위로 분리해 배열에 저장
				if(userdata.length == 1) break; // 배열의 길이가 1과 같다면 반복문 탈출 
				
				User user = new User(userdata[0], userdata[1], userdata[2]); // 생성자를 호출해 배열의 0,1,2 인덱스를 저장
				users.add(user); // 리스트에 대입
			}
			
			
		} catch (Exception e) {System.out.println("fis실패" + e);}
		
		while(true) {// 무한루프
			System.out.print("1.회원가입 | 2.로그인 | 선택 :"); int ch = scanner.nextInt();// 메뉴
			if(ch == 1) {
				System.out.print("아이디를 입력해 주세요 : "); String id = scanner.next(); 
				System.out.print("비밀번호를 입력해 주세요 : "); String pw = scanner.next();
				System.out.print("이름을 입력해 주세요 : "); String name = scanner.next();
				
				User user = new User(id, pw, name); // 입력한 정보들 객체화
				
				boolean check = true; // 스위치 
				for(User temp : users) { //user 클래스를 담는 temp에 리스트의 데이터들을 저장
					if(temp.getId().equals(id)) { // temp에 id값이 입력한 id값과 같다면
						System.out.println("이미 사용중인 아이디입니다."); // 출력
						check = false; break;			// 스위치 false 반복문 탈출		
					}
				}
				if(check) { // 스위치가 true이면
					users.add(user); System.out.println("회원가입 성공"); // 리스트에 객체 저장
				
					try {
						// 파일처리 [ 이어쓰기 true ]
						FileOutputStream fos = new FileOutputStream("C:/Users/82108/git/2017-03-22/java1/src/과제/user.txt", true); 
						
						String outString = user.getId()+","+user.getPw()+","+user.getName()+"\n"; // 객체에 담긴 값을 구분할 표시들과 함께 변수에 저장
						fos.write(outString.getBytes()); // 변수에 담긴 값을 바이트로 변환해 파일로 내보내기
						System.out.println("파일처리 성공");
					} catch (Exception e) {System.out.println("fos 실패 : " + e);}
				}	
			}else if(ch == 2) { // ch가 2면
				
				System.out.print("아이디를 입력해 주세요 : "); String id = scanner.next(); // 아이디 변수에 저장
				System.out.print("비밀번호를 입력해 주세요 : "); String pw = scanner.next(); // 비밀번호 변수에 저장
				
				boolean logincheck = true; // 스위치
				for(User temp : users) { //user 클래스를 담는 temp에 리스트의 데이터들을 저장
					if(temp.getId().equals(id) && temp.getPw().equals(pw)) { // temp에 담긴 아이디와 비밀번호가 입력한 아이디, 비밀번호와 같다면
						System.out.println("로그인 성공");
						logincheck=false; // 스위치 false로 변경
						
						while(true) { // 무한루프
							
							System.out.println("1.회원정보 | 2.회원수정 | 3.회원탈퇴 | 4.로그아웃"); int ch1 = scanner.nextInt();
							
							if(ch1 == 1) {
								System.out.println("아이디 : " + temp.getId());
								System.out.println("이름 : " + temp.getName());
							}
							else if( ch1 == 2 ) {
								System.out.print("변경하실 성명을 입력해 주세요 : "); String newname = scanner.next();
								temp.setName(newname);
								
								try {
									FileOutputStream fos = new FileOutputStream("C:/Users/82108/git/2017-03-22/java1/src/과제/user.txt");
									String outString = "";
									for(User temp2 : users) {
										String outtemp = temp2.getId()+","+temp2.getPw()+","+temp2.getName()+"\n";
										outString += outtemp;
									}
									fos.write(outString.getBytes());
										
								} catch (Exception e) {System.out.println("회원정보 수정 실패 : " + e);}
								
							}
							else if ( ch1 ==3 ) {
								
							}
						}
					}		
				}
			}
			
			
		}
		
	}
}
