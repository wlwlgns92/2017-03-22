package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ����������
			// 1. ����ڷκ��� ����[0]����[1]��[2] �� �ϳ��� �Է� �ޱ�
			// 2. ��ǻ�ʹ� �������� ����������[0~2] �� �ϳ� ����
			// 3. �¸��� �÷��̾� ȣ��
				// + : ���࿡ ����[3]�� �Է��ϸ� ��������
				// + : ��������� ���Ӽ� �� �����¸�[ ���� ���� �̱� �÷��̾� ȣ�� ]
		// �ʿ� ���� ����  -> Ű����� �Է� -> ���� ���� -> ����[�¸��� �Ǵ�]
		
		// 1. ���� ����
		int �÷��̾�; 
		int ��ǻ��; 
		int ���Ӽ� = 0; // while���� �ݺ�Ƚ��
		int �÷��̾�¸� = 0; int ��ǻ�ͽ¸�=0;
	// ���� �¸��� 
		// �̱� Ƚ���� �����Ѵ�.
			// �̱�� 1�� ����
			// ���� ����� �̱� Ƚ���� ���Ѵ�
			// ���� �¸��� ���
		
		while(true) {
			
			// 2. �Է¹ޱ�
			System.out.println("---------- ���������� ���� -------------");
			System.out.print(">>>����[0] ����[1] ��[2]<<<<<<<"); �÷��̾� = scanner.nextInt();
			
			// 4. ��������
			if(�÷��̾� == 3) {
				System.out.println(" ���� ���� ���� Ƚ�� : " + ���Ӽ�);
				if( �÷��̾�¸� > ��ǻ�ͽ¸�) { System.out.println("�����¸��� : �÷��̾� " + �÷��̾�¸�);
					
				}
				else if (�÷��̾�¸� < ��ǻ�ͽ¸�) {
					System.out.println("���� �¸��� : ��ǻ�� "+ ��ǻ�ͽ¸�);
				}
				System.out.println(" ���� �¸��� : " );
				break; // ���� ����� �ݺ��� Ż��
			}
			// 4-1 0~3�� ���� �Է½�
			if(�÷��̾� < 0 || �÷��̾� >3) {
				System.out.println(" �ٽ� �Է����ּ��� ");
				continue; // ���� ����� �ݺ��� �ٽ� ����
			}
			// 3. ��ǻ�ͷκ��� ���� ����
			System.out.println(">>>>>>>��ǻ�� ���� ��<<<<<<<<");
			Random random = new Random(); // ���� ��ü
			��ǻ�� = random.nextInt(3); // 0~2 ���� ����
			System.out.println(��ǻ��);
			// 4. �¸��� �Ǵ�
			if((�÷��̾� == 0 && ��ǻ�� == 2) || (�÷��̾� ==1 && ��ǻ�� ==0) || (�÷��̾� ==2 && ��ǻ�� ==1)) {
				System.out.println("�÷��̾ �̰���ϴ�");
				�÷��̾�¸�++;
			}
			else if ((�÷��̾�==0 &&��ǻ�� == 0) || (�÷��̾� == 1 && ��ǻ�� == 1) || (�÷��̾� == 2 && ��ǻ�� ==2) ) {
				System.out.println("���º� �Դϴ�.");
			}

			else { 
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				��ǻ�ͽ¸�++;
			}
			���Ӽ�++;
		} // w e
		
	} // m e

} //c e