package Day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Day15_1 {
	
	//컬렉션 : 자료구조 바탕으로 객체를 효율적으로 추가, 삭제, 검색 할 수 있도록[ 배열의 문제점 보완 ]
		// 1. List : 순서(인덱스)를 유지하고 저장// 배열과 유사 // 중복 저장 가능
			// 1.Arrarylist, 2.Vector 3. Linkedlist
				// 리스트명.add(객체명) : 해당 객체를 리스트에 저장
				// 리스트명.contains(객체명) : 해당 객체가 리스트에 존재 여부 (true / false)
				// 리스트명.indexOf(객체명) : 해당 객체의 인덱스 번호
				// 리스트명.get(인덱스) : 해당 인덱스의 객체 호출
				// 리스트명.isEmpty() : 리스트가 비어 있는지 확인 (true / false)
				// 리스트명.size() : 리스트내 객체수
				// 리스트명.clear() : 리스트 초기화 [ 모든 객체 삭제]
				// 리스트명.remove(인덱스 or 객체명) : 해당 인덱스 혹은 객체 삭제
			// 차이
				// ArrayList : 단일스레드(동기화x) , 검색 용이
				// Vector : 멀티스레드(동기화o)
				// Linkedlist : 중간에 삽입 / 삭제 용이
		// 2. Set : 순서를 유지하지 않고 저장// 중복 저장 불가
			// 1. HashSet 2. TreeSet
				// set명.add(객체명) : 해당 객체를 set에 저장
				// set명.contains(객체명) : 해당 객체가 리스트에 존재하는지 여부 확인(true /false)
				// set명.isEmpty() : 리스트가 비어 있는지 확인 (true / false)
				// set명.iterator() : 저장된 객체를 하나씩 가져오는 반복자 리턴 // set는 저장순서가 없기 때문에 필수
					// hashNext() : 다음 객체가 존재하면 true 없으면 false 
					// next() : 객체 가져오기
					// remove() : 객체 삭제
				// set명.size() : set내 객체수
				// set명.clear() : set 초기화
				// set명.remove(객체) : 해당 인덱스 객체 삭제
	
		// 3. Map : 키-값 한쌍으로 저장 // 키는 중복 저장 불가
			// 1. HashMap 2. Hashtable 3. TreeMap 4. Properties
				// map명.put(키, 값); : 키와 값으로 이루어진 엔트리 추가
				// map명.containsKey(키) : 키 존재 여부 확인
				// map명.containsvalue(값) : 값 존재 여부 확인
				// map명.entryset() : 해당 엔트리 set에 저장
				// map명.get(키) : 해당 키의 값을 호출
				// map명.isEmpty() : map이 비어있는지 확인
				// map명.Keyset() : 해당 키를 set에 저장
				// map명.size() : map내 키의 수
				
			//차이
				// HashMap : 단일스레드[동기화x]
				// Hashtable : 멀티스레드[동기화]
	
	public static void main(String[] args) {
			
			// p.729 Vector
				// ArraryList : 동기화 x -- > 단일스레드
				// Vector : 동기화 o --> 멀티스레드 ( 채팅 등 멀티미디어 프로그래밍에 사용 )
				
		
				// 리스트 선언
				Vector<Board> boards = new Vector<>();
					// <제네릭?  : 리스트 안에 들어갈 자료형
				
				//2. 리스트 객체 넣기
					// 2.1
				boards.add(new Board("제목1", "내용1", "글쓴이1"));
					// 2.2
				Board board = new Board("제목1", "내용1", "글쓴이1");
				boards.add(board);
				
				
				boards.add(new Board("제목3", "내용3", "글쓴이3"));
				boards.add(new Board("제목4", "내용4", "글쓴이4"));
				boards.add(new Board("제목5", "내용5", "글쓴이5"));
				
				System.out.println(boards);
				boards.remove(2);
				boards.remove(3);
				//출력
				for(Board temp : boards ) { // boards 에는 Board 를 담고있기떄문에 대입하려면 Board 타입을 받을수 있어야한다. 갑자기 int로 받을수는 없다.
					//리스트내 객체 하나씩 왼쪽에 대입
					System.out.print(temp.subject);
					System.out.print(temp.content);
					System.out.print(temp.writer);
				}
				
			// p.729
					//ArrayList : 추가, 검색용이 [인덱스를 사용해서 검색이 빠름]
					// Linkedlist : 삽입, 삭제 용이
				ArrayList<String> list1 = new ArrayList<>();
				LinkedList<String> list2 = new LinkedList<>();
				
				long startTime;
				long endTime;
				
				startTime = System.nanoTime();
				for(int i= 0; i < 10000; i++) {
					list1.add(0, String.valueOf(i));
				}
				endTime = System.nanoTime();
				System.out.println( "ArrayList가 10000개 삽입 시간 : " + (endTime - startTime) + "ns");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
				startTime = System.nanoTime();
				//2. Linkedlist에 i를 0번 인덱스에 10000개 삽입
				for(int i= 0; i < 10000; i++) {
					list2.add(0, String.valueOf(i));
				}
				endTime = System.nanoTime();
				System.out.println( "Linkedlist가 10000개 삽입 시간 : " + (endTime - startTime) + "ns");

	}

}
