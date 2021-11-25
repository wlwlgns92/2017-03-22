package 과제;

import java.util.Scanner;

public class 키오스크Time {
	
	
	// 3차시
	// 1. 메뉴판 : 1. 콜라[300원] 2. 환타[200원] 3.사이다[100] 4. 결제
	// 메뉴판 아래에 선택한 제품 목록[ 제품수량 / 총 결제 예정 금액]
	// 2. 초기 재고 [ 10개씩] 팔렸을때 재고 감소 // 재고가 없으면 [품절]
	// 3. 결제금액을 입력받아서 결제액 만큼 차감후 잔돈 출력
	
	public static void main(String[] args) {
		int 콜라재고 = 10; int 환타재고 = 10; int 사이다재고 = 10;
		int 콜라구매수 = 0; int 환타구매수 = 0; int 사이다구매수 = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			if(콜라재고==0) {
				System.out.println("1. 콜라[품절] 2. 환타[200원] 3.사이다[100] 4. 결제");
			}else {
				System.out.println("1. 콜라[300원] 2. 환타[200원] 3.사이다[100] 4. 결제");
				System.out.print("선택"); int ch = scanner.nextInt();
				
				if(ch==1) {
					if(콜라재고==0) {
						System.out.println("콜라가 품절되었습니다.");
					}else {
						콜라구매수++;
						콜라재고--;
						System.out.println("콜라 한개 담았습니다.");
					}
				}else if(ch==2) {
					if(환타재고==0) {
						System.out.println("환타가 품절되었습니다.");
					}else {
						환타구매수++;
						환타재고--;
						System.out.println("환타 한개 담았습니다.");
					}
				}else if(ch==3) {
					if(사이다재고==0) {
						System.out.println("사이다가 품절되었습니다.");
					}else {
						사이다구매수++;
						사이다재고--;
						System.out.println("사이다 한개 담았습니다.");
					}
				}else if ( ch == 4) {
					int total = 콜라구매수*300+환타구매수*200+사이다구매수*100;
					System.out.println();
					System.out.println("---------장바구니----------");
					System.out.println("콜라"+콜라구매수+"개 환타"+환타구매수+"개 사이다"+ 사이다구매수 +"개");
					System.out.println("총금액은 : " + total+"원");
					System.out.println("결제하시겠습니까 ? 1.예 | 2.아니오"); int ch1 = scanner.nextInt();
					if (ch1 == 1) {
						System.out.print("금액을 투입해 주세요 "); int 돈 = scanner.nextInt();
						if(돈<total) {
							System.out.println("금액이 부족합니다.");
						}else {
							System.out.println("결제가 완료되었습니다. 잔액은 : " +(돈-total)+"원");
						}
					}else {
						System.out.println("초기 화면으로 돌아갑니다.");
					}
				}
			}
		} //w e	
	}
}
