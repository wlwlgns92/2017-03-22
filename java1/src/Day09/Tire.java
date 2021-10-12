package Day09;

public class Tire {
	//필드
	public int maxRotation; //최대 회전수(타이어 수명)
	public int accmulatedRotation; //누적 회전수
	public String location; // 타이어 위치
	
	//생성자 : 객체 초기값
	public Tire( String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	//메소드
	public boolean roll() {
		++accmulatedRotation; //누적 회전수 증가
		if(accmulatedRotation < maxRotation) { //최대회전수가 더 크면
			System.out.println(location + "tire : "+ (maxRotation-accmulatedRotation) + "회"); // 남은 수명 출력
			return true; // true면 수명이 남음을 표시하는 반환
		}else { //최대 회전수가 더 작으면
			System.out.println("***" + location + "tire 펑크 ***");
			return false; // 수명이 없음을 표시하는 반환
		}
	}


}
