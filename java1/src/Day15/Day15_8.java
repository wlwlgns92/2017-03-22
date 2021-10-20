package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day15_8 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		station 종점역 = new station();
			종점역.subwaylist.offer(new Subway("A-1"));
			종점역.subwaylist.offer(new Subway("A-2"));
			종점역.subwaylist.offer(new Subway("A-3"));
			
		station 용산역 = new station();
		station 서울역 = new station();
		station 구로역 = new station();
		while(true) {
			System.out.println("1.종점 2.용산 3.서울 4.구로");
			System.out.print("입력 : "); int ch = scanner.nextInt();
			
			if(ch==1) {
				if(!종점역.subwaylist.isEmpty()) {
					System.out.println(종점역.subwaylist);
				}
			}
			if(ch==2) { }
			if(ch==3) { }
			if(ch==4) { }
		}
		
	}	
}
