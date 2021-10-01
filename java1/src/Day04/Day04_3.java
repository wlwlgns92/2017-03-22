package Day04;

import java.util.Scanner;

public class Day04_3 {
	// console용 키오스크 [ 자판기]
				// 1. 메뉴판 : 1. 콜라[300원] 2. 환타[200원] 3.사이다[100] 4. 결제
					// 메뉴판 아래에 선택한 제품 목록[ 제품수량 / 총 결제 예정 금액]
				// 2. 초기 재고 [ 10개씩] 팔렸을때 재고 감소 // 재고가 없으면 [품절]
				// 3. 결제금액을 입력받아서 결제액 만큼 차감후 잔돈 출력

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 재고 변수[ 지역변수 : 선언된 괄호 안에서만 사용 가능, 무한루프 안에 사용하면 계속 변수값이 돈다]
		int 콜라재고 =10; int 환타재고 = 10; int 사이다재고 = 10;
		// 장바구니 변수
		int 콜라구매수=0; int 환타구매수=0; int 사이다구매수=0;
		//1. 무한루프
		while(true) {
			if(콜라재고 == 0) { System.out.println("----------------메뉴판---------------");
			System.out.println("|1.콜라 품절|2.환타 200원|3.사이다 100원|");}
			else { System.out.println("----------------메뉴판---------------");
				System.out.println("|1.콜라 300원|2.환타 200원|3.사이다 100원|");}
			System.out.print("제품을 선택해 주세요 : "); int ch = scanner.nextInt();
			if(ch == 1) { // 품절시 구매 불가
				if(콜라재고 == 0) {System.out.println( "콜라가 품절되었습니다."); }
				else {
					
				}
				System.out.println("[[ 콜라 1개 담았습니다]]"); 
				콜라구매수++;
				콜라재고--;}
			if(ch == 2) { // 품절시 구매 불가
				if(환타재고 == 0) {System.out.println( "환타가 품절되었습니다."); }
				else {
					
				}
				System.out.println("[[ 환타 1개 담았습니다]]"); 
				환타구매수++;
				환타재고--;}
			
			if(ch == 3) { // 품절시 구매 불가
				if(사이다재고 == 0) {System.out.println( "사이다가 품절되었습니다."); }
				else {
					
				}
				System.out.println("[[ 사이다 1개 담았습니다]]"); 
				사이다구매수++;
				사이다재고--;}

			//장바구니 목록
			System.out.println("-----------------장바구니-----------------");
			System.out.println("제품명\t제품수량\t결제액");
			if(콜라구매수>0) { System.out.println("콜라\t"+ 콜라구매수+"\t"+콜라구매수*300);}
			if(환타구매수>0) { System.out.println("환타\t"+ 환타구매수+"\t"+환타구매수*200);}
			if(사이다구매수>0) { System.out.println("사이다\t"+ 사이다구매수+"\t"+사이다구매수*100);}
			System.out.println();
			System.out.println(">>>> 총 결제액 : "+ ((콜라구매수*300) + (환타구매수*200) + (사이다구매수*100))+ "원");
			System.out.println();
			
			
			if(ch==4) {
				if(콜라구매수 ==0 && 환타구매수==0 &&사이다구매수==0 ) {System.out.println("결제할 상품이 없습니다.");}
				else {
					while(true) {
				System.out.println(">>>>결제하시겠습니까?<<<<");
				System.out.println(">>>>[Y] [N]<<<<"); String ch2 = scanner.next();
				if(ch2.equals("y")) {
					
					while(true) {
						System.out.println(">>>>금액 투여<<<<"); int money = scanner.nextInt();
						int totalpay = (콜라구매수*300) + (환타구매수*200) + (사이다구매수*100);
						if(money < totalpay) { 
							System.out.println("[알림] 금액이 부족합니다");
							
							
						}else System.out.println("[결제완료] ㅣ 잔돈 : "+ (money - totalpay));
				
						//초기화면 이동
						콜라구매수 = 0; 환타구매수=0; 사이다구매수=0;
						break;
					}
					break;
				}else if (ch2.equals("n")) {
					콜라구매수 = 0; 환타구매수=0; 사이다구매수=0;
					break;
				}else { System.out.println("[알림] : 알수없는 행동입니다.");
				}
					}
				}
			}
		}//w e 
			
			
		
		
		
		
		
		
		
		/*int 콜라=300; int 환타=200; int 사이다100; int 재고 = 10;
		System.out.println("----------------메뉴판---------------");
		System.out.println("|1.콜라 300원|2.환타 200원|3.사이다 100원|");
		System.out.print("제품을 선택해 주세요 : "); int a = scanner.nextInt();
		
		if(a == 1) {
			System.out.println("선택된 제품은 콜라 :" + 콜라+ "원 입니다.");
		} */
	} // m e

}// c s
