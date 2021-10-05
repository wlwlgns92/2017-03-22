package Day05;

import java.util.Scanner;

public class Day05_3_확인문제 {
		
	// p.181 확인문제
		//1. 2
			//힙 : 변수내 실제 값
			//스택 : 변수이름 저장
			//1-3. == != 객체 주소값 비교 [객체 내용물 비교x]
				//.equals [객체 내용물 비교 o]
		//2.
			// 1. 프로그램 종료시 메모리 초기화
			public static void main(String[] args) {
		//7.		
//				int max= 0; 
//				int[] array = {1,5,3,8,2};
//				for(int i=0 ; i < array.length; i++) { //i 는 인덱스 0부터 4까지 1씩증가하면서 반복
//					if(array[i] > max) max = array[i]; //i번째 인덱스 값이 max 보다 크면 max에 i번째 인덱스 값
//				}
//				System.out.println("max : " + max);
//					
		//8.
//				int[][] array = {
//						{95,86},
//						{83, 92, 96},
//						{78, 83, 93, 87, 88}
//						
//				};
//				int count=0; //정수개수
//				int sum = 0;
//				double avg =0.0;
//				//행 반복
//				for(int i = 0; i < array.length; i++) {
//					for(int j= 0; j< array[j].length; j++) {
//						//해당 인덱스 값 가져와서 sum 누적합계 더하기
//						sum += array[i][j];
//					}
//					//행 개수 = 정수 개수
//					count += array[i].length; // 2 + 3 + 5
//				}
//				avg = (double)sum / count;
//			System.out.println("sum " + sum);
//			System.out.println("avg " + avg);
				
				
				boolean run = true; // 무한루프 제어 변수
				int studentNum = 0; // 학생수 => 배열의 길이
				int[] scores = null; // 학생점수 배열 [초기값은 null]
				Scanner scanner = new Scanner(System.in);
				
				while(run) { // 5를 입력하면 종료되는 무한루프
					System.out.println("-----------------------------------");
					System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
					System.out.println("-----------------------------------");
					System.out.println("선택> ");
					
					int selectNo = scanner.nextInt();
					
					if(selectNo==1) {
						System.out.print("학생수 입력 : "); studentNum = scanner.nextInt();
						scores = new int[studentNum]; // 입력받은 점수만큼 배열길이 할당
						
					} else if (selectNo==2) {
						//배열내 할당된 모든 인덱스에 값 넣기
						for(int i=0; i< studentNum;  i++) {
							System.out.print(scores[i] + "점수를 입력해주세요 : "); 
							scores[i] = scanner.nextInt(); // 입력받은 값을 i번째에 저장 
						}
								
							
					} else if (selectNo==3) { 
						for(int i=0; i< studentNum;  i++) {
							System.out.print(scores[i]+",");// i번째 인덱스 값 출력
						}
					}
					  else if (selectNo==4) {
						  int  max = 0; int sum = 0 ; double avg =0.0;
						  for(int i= 0; i<studentNum; i++) {
							  if(scores[i]> max) max = scores[i]; // i번째 인덱스의 값이 max 보다 크면 max에 i번째 인덱스 값 넣기
							  sum+= scores[i]; //i번째 인덱스 값을 sum 에 누적합계
						  }
						  avg= (double)sum/studentNum;
						  System.out.println("최고점수 : " + max);
						  System.out.println("평균 점수 : " + avg);
					  }
					  else if (selectNo==5) {
						  run = false;
					  }
				}
				System.out.println("프로그램 종료");
			}
}
