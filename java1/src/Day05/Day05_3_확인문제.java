package Day05;

import java.util.Scanner;

public class Day05_3_Ȯ�ι��� {
		
	// p.181 Ȯ�ι���
		//1. 2
			//�� : ������ ���� ��
			//���� : �����̸� ����
			//1-3. == != ��ü �ּҰ� �� [��ü ���빰 ��x]
				//.equals [��ü ���빰 �� o]
		//2.
			// 1. ���α׷� ����� �޸� �ʱ�ȭ
			public static void main(String[] args) {
		//7.		
//				int max= 0; 
//				int[] array = {1,5,3,8,2};
//				for(int i=0 ; i < array.length; i++) { //i �� �ε��� 0���� 4���� 1�������ϸ鼭 �ݺ�
//					if(array[i] > max) max = array[i]; //i��° �ε��� ���� max ���� ũ�� max�� i��° �ε��� ��
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
//				int count=0; //��������
//				int sum = 0;
//				double avg =0.0;
//				//�� �ݺ�
//				for(int i = 0; i < array.length; i++) {
//					for(int j= 0; j< array[j].length; j++) {
//						//�ش� �ε��� �� �����ͼ� sum �����հ� ���ϱ�
//						sum += array[i][j];
//					}
//					//�� ���� = ���� ����
//					count += array[i].length; // 2 + 3 + 5
//				}
//				avg = (double)sum / count;
//			System.out.println("sum " + sum);
//			System.out.println("avg " + avg);
				
				
				boolean run = true; // ���ѷ��� ���� ����
				int studentNum = 0; // �л��� => �迭�� ����
				int[] scores = null; // �л����� �迭 [�ʱⰪ�� null]
				Scanner scanner = new Scanner(System.in);
				
				while(run) { // 5�� �Է��ϸ� ����Ǵ� ���ѷ���
					System.out.println("-----------------------------------");
					System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
					System.out.println("-----------------------------------");
					System.out.println("����> ");
					
					int selectNo = scanner.nextInt();
					
					if(selectNo==1) {
						System.out.print("�л��� �Է� : "); studentNum = scanner.nextInt();
						scores = new int[studentNum]; // �Է¹��� ������ŭ �迭���� �Ҵ�
						
					} else if (selectNo==2) {
						//�迭�� �Ҵ�� ��� �ε����� �� �ֱ�
						for(int i=0; i< studentNum;  i++) {
							System.out.print(scores[i] + "������ �Է����ּ��� : "); 
							scores[i] = scanner.nextInt(); // �Է¹��� ���� i��°�� ���� 
						}
								
							
					} else if (selectNo==3) { 
						for(int i=0; i< studentNum;  i++) {
							System.out.print(scores[i]+",");// i��° �ε��� �� ���
						}
					}
					  else if (selectNo==4) {
						  int  max = 0; int sum = 0 ; double avg =0.0;
						  for(int i= 0; i<studentNum; i++) {
							  if(scores[i]> max) max = scores[i]; // i��° �ε����� ���� max ���� ũ�� max�� i��° �ε��� �� �ֱ�
							  sum+= scores[i]; //i��° �ε��� ���� sum �� �����հ�
						  }
						  avg= (double)sum/studentNum;
						  System.out.println("�ְ����� : " + max);
						  System.out.println("��� ���� : " + avg);
					  }
					  else if (selectNo==5) {
						  run = false;
					  }
				}
				System.out.println("���α׷� ����");
			}
}
