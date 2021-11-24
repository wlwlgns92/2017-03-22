package 과제;

public class 회원제방문록 {
	public static void main(String[] args) {
		
		int[][] 배열2 = new int[2][3];
		배열2[0][0] = 80; 배열2[0][1] = 90; 배열2[0][2] = 100;
		배열2[1][0] = 40; 배열2[1][1] = 50; 배열2[1][2] = 60;
		
		System.out.println("2차원 배열 : "+배열2);
		System.out.println(배열2[0][0]);
		System.out.println("배열의 전체 가로길이 : " + 배열2.length);
		System.out.println("배열의 전체 세로 길이 : " + 배열2[0].length);
	}
}
