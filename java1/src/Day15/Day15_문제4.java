package Day15;

import java.util.Scanner;
import java.util.Stack;

public class Day15_����4 {
	
	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<Character>(); 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�Է��ϼ��� : "); String ch = scanner.next();
		
		
		// ���ڿ��� ���� �ϳ���
		for(int i=0; i<ch.length(); i++) {
			stack.push(ch.charAt(i));
		}					// .charAt(�ε���) : �ش� �ε����� ���� ����
		//3. ������
		for(int i = 0; i < ch.length(); i++) {
			System.out.print(stack.pop());
		}
		
		
	}
}
