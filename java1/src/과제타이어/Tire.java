package 과제타이어;

public class Tire {
	// 1차시기
	int 최대회전수;
	int 누적회전수;
	String 타이어위치;
	
	
	
	public Tire(int 최대회전수, String 타이어위치) {
		this.최대회전수 = 최대회전수;
		this.타이어위치 = 타이어위치;
	}



	boolean roll() {
		++누적회전수;
		if(누적회전수 < 최대회전수 ) {
			System.out.println(타이어위치 + "타이어 수명 " + (최대회전수-누적회전수));
			return true;
		}
		else { 
			System.out.println(타이어위치 + " 빵꾸났습니다.");
			return false;
		}
	}

}
