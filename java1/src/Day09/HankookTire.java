package Day09;

public class HankookTire extends Tire {
	//필드
	
	
	
	//생성자
	public HankookTire(String locationint, int maxRotation) {
		super(locationint, maxRotation);
		
	}
	
	//메소드 
	//오버라이딩 : 메소드 재정의 [메소드 내용물 바꾸기]
	@Override
	public boolean roll() {
		++accmulatedRotation; //누적 회전수 증가
		if(accmulatedRotation < maxRotation) { //최대회전수가 더 크면
			System.out.println(location + "Hankooktire 수명 : "+ (maxRotation-accmulatedRotation) + "회"); // 남은 수명 출력
			return true; // true면 수명이 남음을 표시하는 반환
		}else { //최대 회전수가 더 작으면
			System.out.println("***" + location + "Hankooktire 펑크 ***");
			return false; // 수명이 없음을 표시하는 반환
		}
	}
	
	
}
