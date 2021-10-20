package Day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class Day14_5_회원제list {
	
	//회원제 프로그램
		// 1. 리스틀를 이요한 회원가입, 로그인 , 회원정보, 회원수정, 회원 탈퇴
	
	public static void main(String[] args) {
			
		//설정
		Scanner scanner = new Scanner(System.in);
		// 리스트 선언 [ user 클래스만 담을수 있는 클래스 ( 만약에 상속이 있으면 자식클래스도 가능)
		ArrayList<User> users = new ArrayList<User>();
		// 파일 읽어오기 : 파일에 있는 회원들을 리스트에 저장 [ 리스트는 다시 시작하면 깡통 ]
			// 1. 파일내 모든 글자 가져오기
		// 1. 파일 입력 클래스
		try {
			FileInputStream fileInputStream = 
					new FileInputStream("C:/Users/505/git/2017-03-22/java1/src/Day14/Userlist.txt");
			// 글자 가져오기 [ 스트림 단위 : 바이트 ]
				// 바이트배열 선언
			byte[] bytes = new byte[1024]; // 1bit 0 -> 8bit 0 -> 1byte -> 1024byte -> 1kbyte
								//영문,공백,특수문자 1바이트 한글 2바이트
			
			// 읽어오기
			fileInputStream.read(bytes);
			// 바이트를 문자열로 변환
			String inString = new String(bytes);
			
			// 2. 회원구분하기
			String[] usernum = inString.split("\n");
					// split() : 문자열 분리 => 배열로 받아야 한다.
			
			// 필드구분하기
			for(String temp : usernum) {
				String[] userdata = temp.split(",");
				if(userdata.length == 1) break;
				
				// 객체 생성
				User user = new User(userdata[0], userdata[1], userdata[2] );
			
			// 리스트에 담기
				users.add(user);
			}
		} catch (Exception e1) { 
			System.out.println("파일 불러오기 실패");
		  }
			

		//1. 메뉴
		while(true) {
			System.out.println("1.회원가입 | 2.로그인");
			int ch = scanner.nextInt();
			if(ch == 1 ) {
				// 입력받기
				System.out.println("아이디 : "); String id = scanner.next();
				System.out.println("비밀번호 : "); String password = scanner.next();
				System.out.println("이름 : "); String name = scanner.next();
				// 입력받은 데이터를 객체화 [ 3개의 변수를 하나의 객체로 사용 ]
				User user = new User(id, password, name);
				
				
				// 아이디 체크 [ 리스트내 객체 하나씩 temp에 대입 ]
				boolean idcheck = true;
				for(User temp : users) {
					if(temp.getId().equals(id)) {
						System.out.println("중복된 아이디가 존재합니다.");
						idcheck = false; break;
					}
				}
				
				//3. 리스트에 저장 [ 만약에 중복값이 없으면 ]
				if(idcheck) {users.add(user); System.out.println("회원가입 성공");
			
				// 4. 파일처리
				 // 1. 파일출력 클래스 [FileOutputStream] 외부랑 관련된 애들은 무조건 예외처리가 나온다.
					// new FileOutputStream("파일경로/파일명.확장자" ); 새로쓰기
					// new FileOutputStream("파일경로/파일명.확장자" true); 이어쓰기 저장된 파일이 있어야한다.
				try {
					FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/2017-03-22/java1/src/Day14/Userlist.txt", true);
					
					// 2. 필드간 구분 [,] // 회원간 구분 [ \n ]
					String outstring = user.getId()+","+user.getPassword()+","+user.getName()+"\n";
					
					// 3. String --> bytes 내보내기 [.write() 내보내기 ]
					fileOutputStream.write(outstring.getBytes());
					System.out.println("파일처리 성공");
				} catch (Exception e) { System.out.println( " 파일처리 실패 ");	}
			    }
			}
			else if ( ch == 2) {
				// 1. 입력받기
				System.out.println("아이디 : "); String id = scanner.next();
				System.out.println("비밀번호 : "); String password = scanner.next();
				// 2. 리스트내 객체와 비교하기
				boolean logincheck = true;
				for(User temp : users) {
					if(temp.getId().equals(id) && temp.getPassword().equals(password)) {
						System.out.println(" 로그인 성공 "); 
						logincheck = false; 
						while(true) {
							System.out.println("1.회원정보|2.회원수정|3.회원탈퇴|4.로그아웃");
							int ch2 = scanner.nextInt();
							if( ch2 == 1 ) {
								System.out.println( " 아이디 : " + temp.getId());
								System.out.println(" 이름 : " + temp.getName());
							}
							if( ch2 == 2 ) { 
								//수정할 정보 입력
								System.out.println("수정할 성함 : "); String newname = scanner.next();
								// set 메소드를 통한 필드 값 수정
								temp.setName(newname);
								// 파일 업데이트 처리
								// 1. 리스트내 모든 회원 저장 [ 업데이트 ]
								try {
									// 파일출력 객체 생성 (파일 경로)
									FileOutputStream fileOutputStream =
											new FileOutputStream("C:/Users/505/git/2017-03-22/java1/src/Day14/Userlist.txt");
									// 1. 리스트내 모든회원 저장
									String outString = ""; // 모든 회원의 정보를 담을 문자열
									for(User temp2 : users) {
										// 회원 분류
										String outtemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
										// 분류된 정보를 모든 회원 문자열에 추가
										outString += outtemp;
									}
									//모든 회원 내보내기
									fileOutputStream.write(outString.getBytes());
								} catch (Exception e) {		}
						
								
							}
							if( ch2 == 3 ) {
								// 리스트에서 객체 삭제
								users.remove(temp); 
								System.out.println("회원탈퇴 완료되었습니다.");
								
								//파일 업데이트 처리
								try {
									// 파일출력 객체 생성 (파일 경로)
									FileOutputStream fileOutputStream =
											new FileOutputStream("C:/Users/505/git/2017-03-22/java1/src/Day14/Userlist.txt");
									// 1. 리스트내 모든회원 저장
									String outString = ""; // 모든 회원의 정보를 담을 문자열
									for(User temp2 : users) {
										// 회원 분류
										String outtemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
										// 분류된 정보를 모든 회원 문자열에 추가
										outString += outtemp;
									}
									//모든 회원 내보내기
									fileOutputStream.write(outString.getBytes());
								} catch (Exception e) {		}
						
								
								
								break;
								
							}
							if( ch2 == 4 ) { System.out.println("로그아웃 되었습니다."); break;}
							
						}
						break;
					}
				}
				if( logincheck ) { System.out.println("일치하는 정보가 없습니다."); }
			}
		}
	}
}
