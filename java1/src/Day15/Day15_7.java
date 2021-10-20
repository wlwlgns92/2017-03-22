package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day15_7 {

	
	// �޸� ���� ��� [ �ڷᱸ�� ]
	
	// ���� : [ LIFO : ���Լ��� ] : ���߿� ���� ��ü�� ���� ����
		// ���� Ŭ���� ����
			// �Ա�, �ⱸ ����
			// �������̽�, Ctrl + z(�ǵ�����)
	// ť : [ FIFO : ���Լ��� ] : ���� ���� ��ü�� ���� ���� 
		// ť �������̽�
			// �Ա�,�ⱸ �ٸ�
			// ���, ����ö
	// Ʈ�� : 
	
	public static void main(String[] args) {
		
		// p.769 : Stack Ŭ����
		// 1. ���� ��ü ����
		Stack<Coin> coinbox = new Stack<>();
		
		// 2. ���ÿ� ��ü �ֱ�
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(10));
		
		System.out.println(coinbox);
		// 3. ���� : pop() : ���� ���߿� ���� ��ü�� ����
		System.out.println(coinbox.pop());
		
		// 4. 
		while(! coinbox.isEmpty()) {
		System.out.println(coinbox.pop());	
		}
		
		// Queue �������̽�
		Queue<Coin> coinbox2 = new LinkedList<>();
		
		// Queue�� ��ü�ֱ�
		coinbox2.offer(new Coin(100));
		coinbox2.offer(new Coin(50));
		coinbox2.offer(new Coin(500));
		coinbox2.offer(new Coin(10));
		
		System.out.println(coinbox2);
		// ����
		System.out.println(coinbox2.poll());
		while(!coinbox2.isEmpty()) {
			System.out.println("���� :" + coinbox2.poll());
		}
	}
}
