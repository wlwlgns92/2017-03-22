package Day12;

import java.util.Scanner;

import Day11.Member;

public class �α���ȸ������ {
	// ���� main �ۿ� �����ؾ� �ٸ�Ŭ�������� ��밡��
	public static Scanner scanner = new Scanner(System.in);
	public static ȸ������[] Members = new ȸ������[100];
	
	
		public static void main(String[] args) throws Exception {

			// 1. �Է¹ޱ� - > 2. ��ü���� -> 3. ���Ͼ���[out]
			// ������ : ȸ������, ȸ���� �ʵ屸��,
		
			
			while(true) { 

				System.out.println("-----------------�α���/ȸ������ ���α׷�--------------");
				System.out.println("1.�α��� | 2.ȸ������");
				System.out.print("���� > " ); int ch = scanner.nextInt();
				
				if(ch==1) {	}
				if(ch==2) {ȸ������.signup(); }
				
			}
				
		}
}
