package ����;

public class �ζ����� {
	// 1. ����ڷκ��� �ߺ����� ���� 1 ~ 45 �� 6���� �Է¹޾� ��÷��ȣ ��ȸ 
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in); // �Է°�ü
			
			int[] number = new int[6];	// ���� 6���� ��� �迭
			int[] ��ǻ�� = new int[6];	// ���� 6���� ��� �迭
			
			// ���Է¹ޱ�
			for(int i = 0; i < 6; i++) { // i�� 0�϶� i�� 6���� �۴ٸ� ������ i 1������
				System.out.print("1~45 �� ��ȣ�� �Է��� �ּ��� : "); int num = scanner.nextInt(); // �� �Է�
				
				// ����
				if(num< 1 || num>45) { // num�� 1���� �۰� 45���� ũ�ٸ�
					System.out.println("1~45�� �Է� �����մϴ�."); // ���
					i--;	// i 1����
					continue; // ����� �ݺ��� �ٽ� ����
				}
				boolean check = true; // boolean Ÿ���� check �� true��
				// �迭�� ����
				for(int j=0; j<6; j++ ) { // j�� 0�϶� j�� 6���� �۴ٸ� ������ j 1������
					if(num == number[j]) { // ���࿡ num�� number[j]�� ���ٸ�
						System.out.println("�Է��� ���� �̹� �����մϴ�."); // ���
						i--; // i 1����
						check = false; // check�� false�� ����
						break; // �ݺ��� Ż��
					}
				}
				if(check) number[i] = num; // ���࿡ check�� true��� number[i]��°�� num ����
			}
			
			// ���
			System.out.println("����ڰ� ������ �� : "); //���
			for(int i =0; i < 6; i++) { // i�� 0�϶� i�� 6���� �۴ٸ� ������ i 1������
				System.out.print(number[i] + " "); // number[i] ���
			}
			System.out.println(); // ����
			
			// ��÷��ȣ ����
			for(int i = 0; i < 6; i++ ) { // i�� 0�϶� i�� 6���� �۴ٸ� ������ i 1������
				Random random = new Random(); // ���� ��ü ����
				int ��÷��ȣ = random.nextInt(45)+1; // 1~45 �� ������ ������ ��÷��ȣ�� ����
				
				boolean check = true; // boolean Ÿ���� check �� true��
				
				for(int j=0; j < 6; j++) { // j�� 0�϶� j�� 6���� �۴ٸ� ������ j 1������
					if(��÷��ȣ==��ǻ��[j]) { // ���࿡ ��÷��ȣ�� ��ǻ��[j]�� ���ٸ�
						i--; // i 1����
						check = false; // check�� false������ ����
						break; // �ݺ��� Ż��
					}
				}
				if(check) ��ǻ��[i] = ��÷��ȣ; // ���࿡ check���� true��� ��ǻ��[i]������ ��÷��ȣ ����
			}
			
			System.out.print("�̹��� ��÷��ȣ :"); // ���
			for(int i = 0; i < 6; i++) { // i�� 0�϶� i�� 6���� �۴ٸ� ������ i 1������
				System.out.print(��ǻ��[i] + " "); //��ǻ��[i] ���
			}
			System.out.println(); // ����
			
			// ������ ��
			int count = 0; // ���� ����� �ʱⰪ ����
			for(int i = 0; i < 6; i++) { //  i�� 0�϶� i�� 6���� �۴ٸ� ������ i 1������
				for(int j = 0; j < 6; j++) { // j�� 0�϶� j�� 6���� �۴ٸ� ������ j 1������
					if(number[i] == ��ǻ��[j]) { // ���࿡ number[i]�� ��ǻ��[j]�� ���ٸ�
						count++; // count 1�� ����
					}
				}
			}
			System.out.println("���� ���� : "+count); //�������� ���
		}

}
