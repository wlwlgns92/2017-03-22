package Day14_p666;

import Day14.Box;

public class Util {

	public static <T> Box<T> boxing(T t) {
				// <제네릭> 반환타입 메소드명(인수)
		Box<T>box = new Box<>();
		box.setT(t);
		return box;
		
		
	}
}
