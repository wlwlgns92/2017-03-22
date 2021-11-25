package 과제;

public class 로또정답 {
	// 1. 사용자로부터 중복되지 않은 1 ~ 45 중 6개를 입력받아 당첨번호 조회 
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in); // 입력객체
			
			int[] number = new int[6];	// 정수 6개를 담는 배열
			int[] 컴퓨터 = new int[6];	// 정수 6개를 담는 배열
			
			// 수입력받기
			for(int i = 0; i < 6; i++) { // i가 0일때 i가 6보다 작다면 실행후 i 1씩증가
				System.out.print("1~45 중 번호를 입력해 주세요 : "); int num = scanner.nextInt(); // 수 입력
				
				// 오류
				if(num< 1 || num>45) { // num이 1보다 작고 45보다 크다면
					System.out.println("1~45만 입력 가능합니다."); // 출력
					i--;	// i 1감소
					continue; // 가까운 반복문 다시 실행
				}
				boolean check = true; // boolean 타입의 check 는 true값
				// 배열에 저장
				for(int j=0; j<6; j++ ) { // j가 0일때 j가 6보다 작다면 실행후 j 1씩증가
					if(num == number[j]) { // 만약에 num이 number[j]와 같다면
						System.out.println("입력한 수는 이미 존재합니다."); // 출력
						i--; // i 1감소
						check = false; // check는 false로 변경
						break; // 반복문 탈출
					}
				}
				if(check) number[i] = num; // 만약에 check가 true라면 number[i]번째에 num 대입
			}
			
			// 출력
			System.out.println("사용자가 선택한 수 : "); //출력
			for(int i =0; i < 6; i++) { // i가 0일때 i가 6보다 작다면 실행후 i 1씩증가
				System.out.print(number[i] + " "); // number[i] 출력
			}
			System.out.println(); // 띄우기
			
			// 당첨번호 생성
			for(int i = 0; i < 6; i++ ) { // i가 0일때 i가 6보다 작다면 실행후 i 1씩증가
				Random random = new Random(); // 난수 객체 생성
				int 당첨번호 = random.nextInt(45)+1; // 1~45 중 난수를 생성해 당첨번호에 대입
				
				boolean check = true; // boolean 타입의 check 는 true값
				
				for(int j=0; j < 6; j++) { // j가 0일때 j가 6보다 작다면 실행후 j 1씩증가
					if(당첨번호==컴퓨터[j]) { // 만약에 당첨번호가 컴퓨터[j]와 같다면
						i--; // i 1감소
						check = false; // check는 false값으로 변경
						break; // 반복문 탈출
					}
				}
				if(check) 컴퓨터[i] = 당첨번호; // 만약에 check값이 true라면 컴퓨터[i]번쨰에 당첨번호 대입
			}
			
			System.out.print("이번주 당첨번호 :"); // 출력
			for(int i = 0; i < 6; i++) { // i가 0일때 i가 6보다 작다면 실행후 i 1씩증가
				System.out.print(컴퓨터[i] + " "); //컴퓨터[i] 출력
			}
			System.out.println(); // 띄우기
			
			// 동일한 수
			int count = 0; // 변수 선언과 초기값 설정
			for(int i = 0; i < 6; i++) { //  i가 0일때 i가 6보다 작다면 실행후 i 1씩증가
				for(int j = 0; j < 6; j++) { // j가 0일때 j가 6보다 작다면 실행후 j 1씩증가
					if(number[i] == 컴퓨터[j]) { // 만약에 number[i]가 컴퓨터[j]와 같다면
						count++; // count 1씩 증가
					}
				}
			}
			System.out.println("맞은 개수 : "+count); //맞은개수 출력
		}

}
