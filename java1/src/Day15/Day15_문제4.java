package Day15;

import java.util.Scanner;
import java.util.Stack;

public class Day15_문제4 {
	
	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<Character>(); 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력하세요 : "); String ch = scanner.next();
		
		
		// 문자열내 문자 하나씩
		for(int i=0; i<ch.length(); i++) {
			stack.push(ch.charAt(i));
		}					// .charAt(인덱스) : 해당 인덱스의 문자 추출
		//3. 빼오기
		for(int i = 0; i < ch.length(); i++) {
			System.out.print(stack.pop());
		}
		
		
	}
}
