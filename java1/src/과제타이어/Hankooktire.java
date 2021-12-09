package 과제타이어;

public class Hankooktire extends Tire{
	//1차시기 
	
	public Hankooktire(int 최대회전수, String 타이어위치) {
		super(최대회전수, 타이어위치);
	}
	
	@Override
	
	boolean roll() {
		++누적회전수;
		if(누적회전수 < 최대회전수 ) {
			System.out.println(타이어위치 + "한국타이어 수명 " + (최대회전수-누적회전수));
			return true;
		}
		else { 
			System.out.println(타이어위치 + " 한국타이어 빵꾸났습니다.");
			return false;
		}
	}
}
