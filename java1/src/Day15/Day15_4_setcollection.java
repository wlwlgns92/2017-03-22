package Day15;

import java.util.HashSet;
import java.util.Scanner;

public class Day15_4_setcollection {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(true) {
			System.out.println(" 1 ~ 45 숫자 선택(중복불가) : ");
			int num = scanner.nextInt();
			
			if(num < 1 || num > 45) {
				System.out.println("선택할 수 없는 번호 ");
			}
			else {
				if(set.contains(num)) {
					System.out.println("중복된 번호입니다.");
				}
				set.add(num);
				System.out.println(" 확인 : " + set);
			}
			// 무한루프 끝나는 조건 : 6개 모두 입력 되었을때
			if(set.size() == 6) break;
		}
		
	}
}
