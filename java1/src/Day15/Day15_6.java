package Day15;

import java.util.Hashtable;
import java.util.Scanner;

public class Day15_6 {
		public static void main(String[] args) {
			
			// Hashtable // 회원가입 / 로그인
			// 설정
			Scanner scanner = new Scanner(System.in);
			// map컬렉션 선언
			Hashtable<String, String> hashtable = new Hashtable<>();
			
			//메뉴
			while(true) {
				System.out.println("1.회원가입 2.로그인");
				System.out.print("선택 : "); int ch = scanner.nextInt();
				
				if(ch==1) {
					System.out.print(" 아이디를 입력해 주세요 : "); String id = scanner.next();
					System.out.print(" 비밀번호를 입력해 주세요 : "); String pw = scanner.next();
					
					// 중복체크 후 객체 넣기
					if(hashtable.containsKey(id)) { // 키가 존재하면 true 아니면 false
						System.out.println(" 이미 사용중인 아이디 입니다.");
					}else {
					// 1. map에 객체 넣기
					hashtable.put(id, pw);
					System.out.println("가입성공");
					}
				}
				if(ch==2) {
					System.out.print(" 아이디를 입력해 주세요 : "); String id = scanner.next();
					System.out.print(" 비밀번호를 입력해 주세요 : "); String pw = scanner.next();
					if(hashtable.containsKey(id)) { // 키가 존재하면 true 아니면 false
						if(hashtable.get(id).equals(pw)) {
							System.out.println("로그인 성공");
						}else {
							System.out.println("일치하는 정보가 없습니다.");
						}
					}else { System.out.println(" 일치하는 정보가 없습니다..");
					 }
					}
				   
			}//we
	
		}// me
}//ce
