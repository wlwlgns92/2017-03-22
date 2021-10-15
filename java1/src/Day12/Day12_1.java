package Day12;

import java.util.Arrays;
import java.util.Collections;

public class Day12_1 {
		
	public static void main(String[] args) {
		/* p.521
		 * 	1. Arrays 클래스
		 * 
		 * 		1. .copyOf("복사할 배열", 복사길이) : 배열복사
		 * 
		 * 		char : 기본자료형
		 * 		String : 클래스 [문자열]
		 * 
		 */
		
		char[] arr1 = { 'j', 'a', 'v', 'a'};
		
		
				// 배열길이 = 배열명.length 	: 필드로 호출
				// 문자열길이 = 문자열.length() : 메소드로 호출
		
		//복사방법
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
					// 현재 클래스에서 다른 클래스 메소드 호출하는 방법
						// . : 접근제한자를 통한 메소드 호출
							// 동일한 클래스 내에서는 .생략
						// 1. 객체를 통한 메소드 호출
								//클래스명 객체명 = new 생성자()
								// 객체명.메소드명()
						// 2. static 메소드 객체 없이 호출
							//클래스명. 메소드명()
				// 2. Arrays.toString(배열) : 인덱스 순으로 정보 출력
		System.out.println( Arrays.toString(arr2));
		
			// 방법2 copyOfRange(복사할배열, 시작인덱스, 끝 인덱스)
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); // [1] ~ [2] 복사
		System.out.println( Arrays.toString(arr3));
			// System.arraycopy( 원본배열, 시작인덱스, 타겟배열, 타겟시작인덱스 복사개수)
		char[] arr4 = new char[arr1.length]; // 배열1의 길이만큼 배열4 선언
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
		
		//p.522 배열 비교 
			// Arrays.equals(배열1, 배열2) : 1차원 배열 비교
		System.out.println(Arrays.equals(arr1, arr2));
//		System.out.println(Arrays.deepEquals(arr1, arr2)); //2차원
		
		// Arrays.sort (배열명) : 해당 배열내 정렬 : sort 만 입력하면 오름차순
		Arrays.sort(arr1);
		System.out.println(arr1.toString()); // 클래스를 안통한 toString은 주소값
		System.out.println(Arrays.toString(arr1));
		
		// 배열내 내림차순 : sort(배열명, Collections.reverseOrder());
		// 주의사항 : 해당 배열이 기본자료형일 경우 사용불가 (클래스)
//		Arrays.sort(arr1, Collections.reverseOrder()); 
		
		// p.526
			//9. Arrays.binarySearch(배열명, 데이터) 
					// 조건 : 오름차순(sort) 정렬후 사용
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println(index);
	}	
}
