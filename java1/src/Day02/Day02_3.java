package Day02;

public class Day02_3 {
	
	/* p.64 ������ [����� ���Ǵ� Ư������]
		// ��������� : + - * / %(������)
		// �񱳿�����
		   >= �̻�[ũ�ų� ����]		>�ʰ� [ũ��]	==[����]
		   <= ����[������ ����]		<�̸� [�۴�]	!=[�����ʴ�]
		   
		   �������� : �񱳿����� 2���̻��϶�
		   && : AND[�̸鼭, �鼭, �̰�, �׸���, ���]
		   || : or [�̰ų�, �ų�, �Ǵ�, �ϳ���]
		   ! : not[���� (�ݴ�)]
		   
		   ���Կ����� : 
		   		= [ �����ʰ���; ���ʿ� ����]
		   		+=[ ������ ���� ���ʰ��� ���� �� ���ʿ� ����] (���п����� ���� �ȵ����� ��ǻ�Ϳ����� ����)
		   		*=, /=, -=, %=
		   	
		   ���������� :
		    	++ [1����]
		    	-- [1����]
		    	
		    ���ǿ����� : 
		    	���ǽ� ? true(��) : false(����)
	*/
	public static void main(String[] args) {
		
		int a = 10; int b = 20;
		System.out.println("���ϱ� : " + (a+b));
		System.out.println("���� : " + (a-b));
		System.out.println("���ϱ� : " + (a*b));
		System.out.println("������ : " + (a/b));
		System.out.println("������ : " + (a%b));
		
		// p.70 : ����������
			// ��Ģ���� ����/���� 
		// 
		a++; System.out.println("���� : " + a);
		a--; System.out.println("���� : " + a);
			// ��������[++������] , ��������[������++]
		System.out.println(" �������� : " + ++a); // 1���� 11
		System.out.println(" Ȯ�� : " + a);		// Ȯ�� 11
		System.out.println(" �������� : " + a++); // ���������ڰ� ����Ʈ�� �ǰ��� �������� ó���� �׷��� 11
		System.out.println(" Ȯ�� : " + a); // 12
		
		System.out.println(" �������� : " + --a); // 1���� 11
		System.out.println(" Ȯ�� : " + a);		// 11
		System.out.println(" �������� : " + a--);	// 1���� 11
		System.out.println(" Ȯ�� : " + a);		// 10
		
		// p.88 �񱳿�����
		System.out.println(" �̻� : " + (a >= b));
		System.out.println(" ���� : " + (a <= b));
		System.out.println(" �ʰ� : " + (a > b));
		System.out.println(" �̸� : " + (a < b));
		System.out.println(" ���� : " + (a == b));
		System.out.println(" �����ʴ� : " + (a != b));
		
		// p.92 �������� and, or : �񱳿����ڰ� 2�� �̻��϶�
			// and : 2���̻��� �񱳿����ڰ� ��� True -> ��� true �ϳ��� false -> false
			// or : 2���̻��� �񱳿����ڰ� �ϳ��ﵵ ture -> ture
		int c = 30; int d = 40;
		System.out.println(" and : " + (a>=b && d >= c));
		System.out.println(" or : " + (a>=b || d >= c));
		System.out.println(" not : " + !(a>=b || d >= c));
		
		// p.98 ���Կ�����
		a+= 1; // ������ += �� �����ʰ��� ���� ������ �����Ŀ� ���� ������ ����
		a*= 10;		System.out.println(a);
		a -= 10;	System.out.println(a);
		a /= 10l;	System.out.println(a);
		
		// p.100 ���ǿ�����
		int e = 85;
		char f = e > 90 ? 'A' : 'B'; System.out.println(f);
		char g = e > 90 ? 'A' : e > 80 ? 'B' : 'C'; System.out.println(g);
		
		
			
	}

}
