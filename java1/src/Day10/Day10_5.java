package Day10;

public class Day10_5 {

	// 예외처리 : 1.일반예외 2.실행예외
		// 목적 : 다양한 오류 발생시 => 프로그램 정상화의 목적
		
	// p.423 NullPointerException 예외
	public static void main(String[] args) {
		try {
		String data = null; // String 객체에 null 대입 o
				System.out.println(data.toString()); // toString : 객체정보반환
		} catch (Exception e) {
		System.out.println("예외가 발생 했습니다. [ 관리자 문의 ]");
		System.out.println("예외정보 : " + e);
		}finally {
			System.out.println("무조건 실행되는 위치");
		}
	// 예2 : ArrayIndexOutOfBoundsException 예외
	
	try {
	String[] 문자열배열 = new String[2];// String 2개를 저장하는 배열 선언
	문자열배열[0] = "유재석"; 문자열배열[1] = "강호동"; 문자열배열[3] ="신동엽";
	}
	catch (Exception e) {
		System.out.println("배열내 자리가 부족합니다. [관리자 문의]");
		System.out.println("예외정보 : "+ e);
	}finally {
		System.out.println("무조건 실행되는 위치");	
	}
	// 예3 p.426 : NumberFormatException 예외 [ a100을 숫자로 표현할 수 없다.]
	
	try {
	String data1 = "100"; // 문자 100 을 숫자 100으로 바꾼다 [ 가능] 
	String data2 = "a100"; // a100 을 숫자 100으로 바꾼다[ 불가능]
	
	System.out.println(Integer.parseInt(data1));
	System.out.println(Integer.parseInt(data2));
			// integer : 정수관련 클래스 [ 정수 관련 메소드 제공]
			// .parseint(문자)  : 문자를 정수형으로 변환해주는 메소드
	}catch (Exception e) {
		System.out.println("문자가 포함된 문자열은 정수로 변환이 불가 [ 관리자 문의]");
		System.out.println("예외정보는 : "+e);
	}finally {
		System.out.println("무조건 실행되는 위치");	
	}
	
	// 예외처리 코드
	// try {} 안에서 예외발생하면 catch 내 객체에 오류발생정보를 저장하고 catch 실행
	// 단 예외가 없을경우 try {} 정상실행 catch {}는 실행 안함
	// finally {예외 유무와 상관없이 실행되는 코드} (써도되고 안써도됨)
	
	// 작성방법
	// try { 예외가 발생 가능 코드}
	// catch(예외 클래스명 변수명) { 예외 발생시 실행되는 코드}
	
	// 예외클래스
	/* Exception : 예외 수퍼클래스 : 모든 예외 저장 가능
	 * NullPointerException
	 * ArrayIndexOutOfBoundsException
	 * NumberFormatException 
	 */
	// 예외 떠넘기기
		// 목적 : 메소드내에서 발생한 예외를 호출한 곳으로 이동 [예외 통일성]
	// 사용자 정의
	

	}
}
