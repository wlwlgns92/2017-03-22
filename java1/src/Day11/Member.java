package Day11;

public class Member {

	
		public String id;
		public Member( String id) {
			this.id = id;
		}
		
		
		@Override
		public boolean equals(Object obj) { // ���� ��ü�� �μ��� ����[ �񱳴�� ]
		if(obj instanceof Member) { // instanceof Ÿ�� Ȯ�� / ����ȯ �Ǵ��� Ȯ�� / ��Ӱ��� Ȯ�� Ű����
			// Member Ŭ������ obj ���ԵǾ� �ִ��� Ȯ�� [ true , false ]
			Member member = (Member)obj;
			//�μ��� ��ü�� ��������ȯ 
			if(id.equals(member.id)) {
			//���� Ŭ������ ������ �μ��� ������ �� 
				return true;
			}
		}
		return false;
		}
		
		@Override
		public String toString() {
		
		return " ���� ��ü�� ����� �ʵ�� : " + this.id;
		}
}
