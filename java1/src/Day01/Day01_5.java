package Day01;

import java.util.Scanner; //import : 다른 패키지에서 클래스를 가저올때 사용[System 클래스는 사용하지않음]

public class Day01_5 {

	public static void main(String[] args) {
		// 1. 입력객체 만들기
		Scanner scan = new Scanner(System.in);
		// 2. 입력받은 값을 변수/객체 저장[옮기기]
		System.out.print(" 아이디 : ");		String 아이디 = scan.next();
		System.out.print(" 비밀번호 : "); 		String 비밀번호 = scan.next();
		System.out.print(" 성명 : ");		String 성명 = scan.next();
		System.out.print(" 이메일 : ");		String 이메일 = scan.next();
		
		// 3. 출력
		System.out.println(">>>>>> 최원가입 완료 아래 정보를 확인해주세요 >>>>>>");
		System.out.println("아이디\t비밀번호\t성명\t이메일");
		System.out.println( 아이디+"\t"+비밀번호+"\t"+성명+"\t"+이메일);
	}
}
