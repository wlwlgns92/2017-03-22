package Day14_p666;

import Day14.Box;

public class Util {

	public static <T> Box<T> boxing(T t) {
				// <���׸�> ��ȯŸ�� �޼ҵ��(�μ�)
		Box<T>box = new Box<>();
		box.setT(t);
		return box;
		
		
	}
}
