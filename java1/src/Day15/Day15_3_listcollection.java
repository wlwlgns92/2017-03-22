package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_3_listcollection {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 0. 리스트 객체에interger 객체들을 저장
		ArrayList<Integer> guest = new ArrayList<Integer>();
		
		while(true) {
			System.out.println(" 대기 현황 ");
			for(int i = 0; i < guest.size(); i++) {
				System.out.println("대기번호 : "+(i+1)+ " 번 "+ "인원 : "+guest.get(i));
			}
			
			System.out.println("------------명단추가------------");
			System.out.println("1.명단추가 | 2.명단취소 | 3.관리자");
			System.out.print("선택 >>>"); int ch = scanner.nextInt();
			
			if(ch==1) { 
				System.out.print("인원수를 입력해주세요 : "); int ch2 = scanner.nextInt();

			// 리스트에 객체 저장
			guest.add(ch2); 
			System.out.println("대기 등록이 완료되었습니다. 대기번호는 : " + guest.size() + " 입니다." );
			
			}
			if(ch==2) { 
				System.out.println("대기번호를 입력해주세요 : "); int ch3 = scanner.nextInt();
				//2. 리스트내 객체 삭제
				guest.remove(ch3-1);// -1을 하는 이유 [ 대기번호는 1부터 // 인덱스는 0부터 ]
			}
			if(ch==3) { 
				if(guest.isEmpty()) {
					System.out.println("대기중인 고객이 없습니다.");
				}	
				else {
					System.out.println(" 대기번호 1번 입장");
					guest.remove(0); // 대기번호 1번 삭제
				}
				
			}
		}//w e
		
		
	}
}
