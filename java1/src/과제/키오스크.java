package 과제;

import java.util.Scanner;

public class 키오스크 {

	// 1. 메뉴판 : 1. 콜라[300원] 2. 환타[200원] 3.사이다[100] 4. 결제
	// 메뉴판 아래에 선택한 제품 목록[ 제품수량 / 총 결제 예정 금액]
	// 2. 초기 재고 [ 10개씩] 팔렸을때 재고 감소 // 재고가 없으면 [품절]
	// 3. 결제금액을 입력받아서 결제액 만큼 차감후 잔돈 출력
	
	public static void main(String[] args) {
		
		int 콜라재고 =10; int 환타재고 = 10; int 사이다재고 = 10; // 재고관리를 위한 변수선언
		int 콜라구매수 = 0; int 환타구매수 = 0; int 사이다구매수 = 0;	// 계산을 위한 변수 선언 장바구니라고 보자
		Scanner scanner = new Scanner(System.in);	// 입력객체 
		
		while(true) { // 반복문
			if(콜라재고==0) { // 만약에 콜라재고가 품절이라면 아래와 같이 출력 원래 모든 음료의 경우에 적용해야 하지 않나 싶다.
			System.out.println("1. 콜라[품절] 2. 환타[200원] 3.사이다[100] 4. 결제");
			}else {	// 아니면 아래와 같이 출력
				System.out.println("1. 콜라[300] 2. 환타[200원] 3.사이다[100] 4. 결제");
			}
			
			System.out.print("선택 : "); int ch = scanner.nextInt(); // 선택 : 입력받기
			
			if(ch == 1) { // 만약에 입력한 숫자가 1이라면
				if(콜라재고 == 0) { // 만약에 콜라재고가 0이라면
					System.out.println("콜라 품절"); // 품절 문구 출력 여기에 continue가 있어야되지 않나 ?
				}else { // 아니면 
				콜라재고--; 콜라구매수++; //콜라재고 1감소 콜라구매수 1증가
				System.out.println("콜라 한개 담았습니다."); //문구 출력
				}
			}else if (ch == 2) {// 아니면  입력한 숫자가 2이라면
				if(환타재고 == 0) {// 만약에 환타재고가 0이라면
					System.out.println("환타 품절"); // 문구 출력
				}else {	// 아니면
				환타재고--; 환타구매수++; //환타재고 1감소 환타구매수 1증가
				System.out.println("환타 한개 담았습니다."); // 문구출력
				}
			}else if (ch == 3) { // 아니면  입력한 숫자가 3이라면
				if(사이다재고 == 0) { // 사이다재고가 0이라면
					System.out.println("사이다 품절"); // 문구출력
				}else { // 아니면
				사이다재고--; 사이다구매수++; // 사이다재고 1감소 사이다구매수1증가
				System.out.println("사이다 한개 담았습니다."); // 문구출력
				}
			}else if ( ch == 4) { // 만약에 입력한 숫자가 4라면
				System.out.println(); // 한칸띄우기 용도
				System.out.println("------------장바구니-----------");
				System.out.println("콜라 : "+콜라구매수+"개 환타 : "+환타구매수+"개 사이다 : " +사이다구매수+"개" ); // 각 음료 선택 개수 출력
				int total = (콜라구매수*300)+(환타구매수*200)+(사이다구매수*100); // 음료 개수에 가격을 곱한다음 합하여 변수에 넣기
				System.out.println( " 총 결제 금액은 : " + total + "원 입니다." ); // 합계금액 출력
				System.out.println("결제하시겠습니까 ? 1.예 | 2.아니오"); int ch2 = scanner.nextInt(); // 선택 입력
				if(ch2==1) { // 만약에 결제 선택이 1번이라면
					System.out.println("금액을 넣어주세요 "); int 돈 = scanner.nextInt(); // 돈 입력받기
						if(돈 < total) {  // 만약에 돈이 합계금액보다 작다면
							System.out.println("금액이 부족합니다."); // 문구출력
						}else { // 아니면 (돈>total)
							System.out.println("결제가 완료되었습니다. 잔돈을 받아가세요 잔돈 : " + (돈-total)+"원"); // 문구 출력 및 잔액(돈-total) 출력
						}
				}else { 
					// return 을 넣으면 어떻게 되나
				}
			}else {	// 1~4 외의 숫자를 누르면
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
