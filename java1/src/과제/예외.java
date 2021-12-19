package 과제;

public class 예외 {
	
	public static void main(String[] args) {
		String[] 배열 = {"10", "2a"};
		int value = 0;
		
		for(int i =0; i <= 2; i++) {
			try {
				value = Integer.parseInt(배열[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했다.");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 형변환 불가");
			}finally {
				System.out.println(value);
			}
		}
	}
}
