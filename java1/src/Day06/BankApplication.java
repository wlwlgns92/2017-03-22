package Day06;

import java.util.Scanner;

public class BankApplication { // p.277
	
	// 접근제한자 : 필드나 메모리 보호
				// public :가장 낮음 : 프로젝트내 모든곳에서 호출[사용] 가능
				// private : 보안이 가장 뛰어남 : 현재 파일[클래스]에서만 호출 가능
				// default[생략] : 동일한 패키지 내에서만 호출 가능
				// protected : 동일한 패키지내에서만 호출 가능
			//static : 정적 변수 : 프로그램 실행 전반에 걸쳐 변수의 수명이 유지된다.
			// main 메소드와 같이 프로그램 시작시 메모리 할당
			// 모든 메소드에 사용되는 필드에 사용
			// <---> 지역변수 : 선언된{}안에서만 사용 --> {]밖으로 나가면 초기화
	//100개 계좌객체를 저장할 수 있는 배열 선언
		// main메소드 밖에 선언시 : main메소드 외 모든 메소드에서 호출 가능
	private static Account[] accountArray =new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------");
			System.out.println("선택>"); int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) { 
				accountList();
			} else if (selectNo == 3 ) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
	}
	//메소드 선언
	//접근제한자 키워드 반환타입 메소드명(매개변수, 매개변수2 ~~) {실행코드 ; return;}
	
	//계좌생성하기	[인수x 반환x]
			//static 메인에서 호출하기 위해 사용 [ 미사용시 : main 해당 메소드 사용 불가]
	private static void createAccount() {
		//1. 입력받은 정보를 변수에 저장 //작성위치
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		System.out.println();
		//1. 입력받기 => 변수에 저장
		System.out.print(">>계좌번호 : "); String ano = scanner.next();
		System.out.print(">>계좌주 : "); String owner = scanner.next();
		System.out.print(">>초기입금액 : "); int balance = scanner.nextInt();
		
		
		//2. 객체생성 [ 입력받은 변수값을 객체 생성자에 넣어서 객체 만들기
		Account account = new Account(ano, owner, balance);
		
		//3. 배열에 저장[ 배열내 빈공간을 찾아서 빈공간 인덱스에 객체 저장]
		for(int i=0; i<accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account; //i번째 인덱스에 객체 넣기
				System.out.println("계좌가 생성되었습니다.");
				break; // 계좌생성시 반복문 종료
			}
		}
			
	}
	//계좌목록보기 [인수x 반환x]
	private static void accountList() {
		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");
		//1. 배열내 모든 인덱스를 호출
		for(int i =0; i<accountArray.length; i++) {
			if(accountArray[i] == null ) break; 
			System.out.println(accountArray[i].getAno() + 
					"\t" + accountArray[i].getOwner() + 
					"\t" + accountArray[i].getBalance());//작성 위치
		}
	}
	//Account 배열에엇 ano와 동일한 Account 객체 찾기 [인수o(String ano) 반환o (Account 객체)]
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) { //i번째 인덱스가 공백이 아니면서
				if(accountArray[i].getAno().equals(ano) ) {// i번째ㅔ 인덱스의 객체내 계좌번호가 인수[입력계좌]와 같으면 o
					account = accountArray[i]; // 찾은 객체를 임시 객체에 저장
					break;//작성 위치
				}
			}
		}
		return account; // 만약에 동일한 계좌번호가 있으면 객체[찾은객체] 반환 동일한 계좌번호가 없으면 객체[null]반환
	} 
	//예금하기 [인수x 반환x]
	private static void deposit() {
		System.out.println("------------");
		System.out.println("예금하기");
		System.out.println("------------");
		//1.입력받기
		System.out.println(">>>계좌번호 : "); String ano =scanner.next();
		System.out.println(">>>예금액 : "); int balance = scanner.nextInt();
		//2.입력받은 계좌번호 존재하는지 체크하는 메소드 호출
		Account account = findAccount(ano);
		// findAccount 반환 : 찾은 객체 혹은 null
		//3.
		if( account == null ) { //반환이 null 일경우
			System.out.println("계좌가 존재하지 않습니다.");
			return;//현재 메소드 강제 종료
		}
		//4. 
		account.setBalance(account.getBalance()+balance);
									//기존예금액 + 입력받은 입금액
		//set 메소드 : 필드에 값 대입 메소드
		//get 메소드 : 필드에 값 호출 메소드
		System.out.println("예금되었습니다.");
		
	}
	//출금하기 [인수x 반환x]
	private static void withdraw() {
		System.out.println("------------");
		System.out.println("출금하기");
		System.out.println("------------");
		//1.입력받기
		System.out.println(">>>계좌번호 : "); String ano =scanner.next();
		System.out.println(">>>출금액 : "); int balance = scanner.nextInt();
		//2.입력받은 계좌번호 존재하는지 체크하는 메소드 호출
				Account account = findAccount(ano);
				// findAccount 반환 : 찾은 객체 혹은 null
				//3.
				if( account == null ) { //반환이 null 일경우
					System.out.println("계좌가 존재하지 않습니다.");
					return;//현재 메소드 강제 종료
				}if( account.getBalance()<balance) { // 잔액부족
					System.out.println("잔액이 부족합니다."); return;
				}
				//4. 기존예금액 - 출금액 
				account.setBalance(account.getBalance()-balance);
						//private를 사용해서 set을 사용//기존예금액 - 입력받은 출금액
				//set 메소드 : 필드에 값 대입 메소드
				//get 메소드 : 필드에 값 호출 메소드
				System.out.println("출금되었습니다.");
		
	}
	
	
}
