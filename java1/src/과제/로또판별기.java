package 과제;

import java.util.Random;
import java.util.Scanner;

public class 로또판별기 {
								//------------------------  3차 도전 -----------------------//
	// 1. 사용자로부터 중복되지 않은 1 ~ 45 중 6개를 입력받아 당첨번호 조회 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[6];
		int[] 컴퓨터 = new int[6];
		// 번호 입력
		for(int i = 0; i < 6; i++) {
			System.out.print("번호를 입력해 주세요"); int num = scanner.nextInt();
			
			if(num<1 || num>45) {
				System.out.println("1~45까지만 입력 가능합니다.");
				i--;
				continue;
			}
			boolean check = true;
			for(int j = 0; j < 6; j++) {
				if(number[j] == num) {
					System.out.println("이미 입력한 번호 입니다.");
					i--;
					check = false;
					break;
				}
			}
			if(check) { number[i] = num; }
		}
		// 번호 출력
		System.out.print("사용자가 입력한 번호는 : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		// 당첨번호 출력
		for(int i = 0; i < 6; i++) {
			Random random = new Random();
			int 당첨번호 = random.nextInt(45)+1;
			
			boolean check = true;
			for(int j = 0; j < 6; j++) {
				if(컴퓨터[j] == 당첨번호) {
					i--;
					check = false;
					break;
				}
			}
			if(check) { 컴퓨터[i] = 당첨번호; }
		}
		
		// 당첨번호 출력
		System.out.print("이번주 당첨번호는 : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(컴퓨터[i] + " ");
		}
		System.out.println();
		
		// 맞은개수
		int count = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(number[i] == 컴퓨터[j]) {
					count++;
				}
			}
		}
		System.out.println("맞은개수는 : " + count);
		
	}
}
