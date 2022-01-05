package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_문제1_Time {

//	문제1: list 컬렉션 
//	*대기명단 프로그램
//	[ 메뉴 ]
//	1.명단추가 2.명단취소 3.[관리자]명단입장
//		1. 명단 추가 ( 인원수를 입력받아 대기번호[인덱스] 반환 )
//		2. 명단 취소 ( 대기번호 입력받아 명단 취소 )
//		[관리자] 
//		3. 명단 입장( 대기번호 1번부터 입장 없으면 없음 출력 )
	// 1차

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 입력객체
		ArrayList<Integer> list = new ArrayList<>(); // 대기명단을 관리할 list

		while (true) { // 무한루프
			System.out.println("--------------대기 현황-------------");
			for (int i = 0; i < list.size(); i++) { // list의 크기만큼 반복하는 반복문
				System.out.println("대기번호 : " + (i + 1) + "번 인원 : " + list.get(i)); // i가 0이라 +1 , list의 i번째 인덱스 출력
			}

			System.out.print("1.명단추가 2.명단취소 3.[관리자]명단입장 | 선택 : ");	int ch = scanner.nextInt(); // 입력

			if (ch == 1) { // ch가 1이면
				System.out.print("인원을 입력해 주세요 : ");
				int count = scanner.nextInt(); // 입력받아
				list.add(count); // 리스트에 저장
				System.out.println("고객님의 대기번호는 : " + list.size()); // 리스트 크기 출력
			} else if (ch == 2) { // ch가 2라면
				System.out.print("취소하실 대기번호를 입력해 주세요 : ");
				int num = scanner.nextInt(); // 입력받아
				list.remove(num - 1); // list에 입력받은 번호 -1 인덱스 삭제
			} else if (ch == 3) { // ch가 3이라면
				if (list.isEmpty()) { // list가 null이면
					System.out.println("대기중인 인원이 없습니다."); 
				} else { // null이 아니면
					System.out.println("대기번호 1번 입장");
					list.remove(0); // list 0번쨰 인덱스 삭제
				}
			}
		}
	}
}
