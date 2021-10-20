package Day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class Day14_5_ȸ����list {
	
	//ȸ���� ���α׷�
		// 1. ����Ʋ�� �̿��� ȸ������, �α��� , ȸ������, ȸ������, ȸ�� Ż��
	
	public static void main(String[] args) {
			
		//����
		Scanner scanner = new Scanner(System.in);
		// ����Ʈ ���� [ user Ŭ������ ������ �ִ� Ŭ���� ( ���࿡ ����� ������ �ڽ�Ŭ������ ����)
		ArrayList<User> users = new ArrayList<User>();
		// ���� �о���� : ���Ͽ� �ִ� ȸ������ ����Ʈ�� ���� [ ����Ʈ�� �ٽ� �����ϸ� ���� ]
			// 1. ���ϳ� ��� ���� ��������
		// 1. ���� �Է� Ŭ����
		try {
			FileInputStream fileInputStream = 
					new FileInputStream("C:/Users/505/git/2017-03-22/java1/src/Day14/Userlist.txt");
			// ���� �������� [ ��Ʈ�� ���� : ����Ʈ ]
				// ����Ʈ�迭 ����
			byte[] bytes = new byte[1024]; // 1bit 0 -> 8bit 0 -> 1byte -> 1024byte -> 1kbyte
								//����,����,Ư������ 1����Ʈ �ѱ� 2����Ʈ
			
			// �о����
			fileInputStream.read(bytes);
			// ����Ʈ�� ���ڿ��� ��ȯ
			String inString = new String(bytes);
			
			// 2. ȸ�������ϱ�
			String[] usernum = inString.split("\n");
					// split() : ���ڿ� �и� => �迭�� �޾ƾ� �Ѵ�.
			
			// �ʵ屸���ϱ�
			for(String temp : usernum) {
				String[] userdata = temp.split(",");
				if(userdata.length == 1) break;
				
				// ��ü ����
				User user = new User(userdata[0], userdata[1], userdata[2] );
			
			// ����Ʈ�� ���
				users.add(user);
			}
		} catch (Exception e1) { 
			System.out.println("���� �ҷ����� ����");
		  }
			

		//1. �޴�
		while(true) {
			System.out.println("1.ȸ������ | 2.�α���");
			int ch = scanner.nextInt();
			if(ch == 1 ) {
				// �Է¹ޱ�
				System.out.println("���̵� : "); String id = scanner.next();
				System.out.println("��й�ȣ : "); String password = scanner.next();
				System.out.println("�̸� : "); String name = scanner.next();
				// �Է¹��� �����͸� ��üȭ [ 3���� ������ �ϳ��� ��ü�� ��� ]
				User user = new User(id, password, name);
				
				
				// ���̵� üũ [ ����Ʈ�� ��ü �ϳ��� temp�� ���� ]
				boolean idcheck = true;
				for(User temp : users) {
					if(temp.getId().equals(id)) {
						System.out.println("�ߺ��� ���̵� �����մϴ�.");
						idcheck = false; break;
					}
				}
				
				//3. ����Ʈ�� ���� [ ���࿡ �ߺ����� ������ ]
				if(idcheck) {users.add(user); System.out.println("ȸ������ ����");
			
				// 4. ����ó��
				 // 1. ������� Ŭ���� [FileOutputStream] �ܺζ� ���õ� �ֵ��� ������ ����ó���� ���´�.
					// new FileOutputStream("���ϰ��/���ϸ�.Ȯ����" ); ���ξ���
					// new FileOutputStream("���ϰ��/���ϸ�.Ȯ����" true); �̾�� ����� ������ �־���Ѵ�.
				try {
					FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/2017-03-22/java1/src/Day14/Userlist.txt", true);
					
					// 2. �ʵ尣 ���� [,] // ȸ���� ���� [ \n ]
					String outstring = user.getId()+","+user.getPassword()+","+user.getName()+"\n";
					
					// 3. String --> bytes �������� [.write() �������� ]
					fileOutputStream.write(outstring.getBytes());
					System.out.println("����ó�� ����");
				} catch (Exception e) { System.out.println( " ����ó�� ���� ");	}
			    }
			}
			else if ( ch == 2) {
				// 1. �Է¹ޱ�
				System.out.println("���̵� : "); String id = scanner.next();
				System.out.println("��й�ȣ : "); String password = scanner.next();
				// 2. ����Ʈ�� ��ü�� ���ϱ�
				boolean logincheck = true;
				for(User temp : users) {
					if(temp.getId().equals(id) && temp.getPassword().equals(password)) {
						System.out.println(" �α��� ���� "); 
						logincheck = false; 
						while(true) {
							System.out.println("1.ȸ������|2.ȸ������|3.ȸ��Ż��|4.�α׾ƿ�");
							int ch2 = scanner.nextInt();
							if( ch2 == 1 ) {
								System.out.println( " ���̵� : " + temp.getId());
								System.out.println(" �̸� : " + temp.getName());
							}
							if( ch2 == 2 ) { 
								//������ ���� �Է�
								System.out.println("������ ���� : "); String newname = scanner.next();
								// set �޼ҵ带 ���� �ʵ� �� ����
								temp.setName(newname);
								// ���� ������Ʈ ó��
								// 1. ����Ʈ�� ��� ȸ�� ���� [ ������Ʈ ]
								try {
									// ������� ��ü ���� (���� ���)
									FileOutputStream fileOutputStream =
											new FileOutputStream("C:/Users/505/git/2017-03-22/java1/src/Day14/Userlist.txt");
									// 1. ����Ʈ�� ���ȸ�� ����
									String outString = ""; // ��� ȸ���� ������ ���� ���ڿ�
									for(User temp2 : users) {
										// ȸ�� �з�
										String outtemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
										// �з��� ������ ��� ȸ�� ���ڿ��� �߰�
										outString += outtemp;
									}
									//��� ȸ�� ��������
									fileOutputStream.write(outString.getBytes());
								} catch (Exception e) {		}
						
								
							}
							if( ch2 == 3 ) {
								// ����Ʈ���� ��ü ����
								users.remove(temp); 
								System.out.println("ȸ��Ż�� �Ϸ�Ǿ����ϴ�.");
								
								//���� ������Ʈ ó��
								try {
									// ������� ��ü ���� (���� ���)
									FileOutputStream fileOutputStream =
											new FileOutputStream("C:/Users/505/git/2017-03-22/java1/src/Day14/Userlist.txt");
									// 1. ����Ʈ�� ���ȸ�� ����
									String outString = ""; // ��� ȸ���� ������ ���� ���ڿ�
									for(User temp2 : users) {
										// ȸ�� �з�
										String outtemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
										// �з��� ������ ��� ȸ�� ���ڿ��� �߰�
										outString += outtemp;
									}
									//��� ȸ�� ��������
									fileOutputStream.write(outString.getBytes());
								} catch (Exception e) {		}
						
								
								
								break;
								
							}
							if( ch2 == 4 ) { System.out.println("�α׾ƿ� �Ǿ����ϴ�."); break;}
							
						}
						break;
					}
				}
				if( logincheck ) { System.out.println("��ġ�ϴ� ������ �����ϴ�."); }
			}
		}
	}
}
