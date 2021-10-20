package 정리함;

public class gogo {

	public static void main(String[] args) {
		
		강아지 강아지 = new 강아지();
		고양이 고양이 = new 고양이();
		호랑이 호랑이 = new 호랑이();
		
		강아지.start();
		고양이.start();
		호랑이.start();
		
		try {Thread.sleep(6000);} catch (InterruptedException e) {	}
		
		System.out.println("스레드1 이름 : " + 강아지.getName());
		System.out.println("스레드2 이름 : " + 고양이.getName());
		System.out.println("스레드3 이름 : " + 호랑이.getName());
	}
}
