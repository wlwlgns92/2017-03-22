package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day15_8 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		station ������ = new station();
			������.subwaylist.offer(new Subway("A-1"));
			������.subwaylist.offer(new Subway("A-2"));
			������.subwaylist.offer(new Subway("A-3"));
			
		station ��꿪 = new station();
		station ���￪ = new station();
		station ���ο� = new station();
		while(true) {
			System.out.println("1.���� 2.��� 3.���� 4.����");
			System.out.print("�Է� : "); int ch = scanner.nextInt();
			
			if(ch==1) {
				if(!������.subwaylist.isEmpty()) {
					System.out.println(������.subwaylist);
				}
			}
			if(ch==2) { }
			if(ch==3) { }
			if(ch==4) { }
		}
		
	}	
}
