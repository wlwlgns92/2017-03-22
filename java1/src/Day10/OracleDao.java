package Day10;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("����Ŭ DB���� �˻�");
	}

	@Override
	public void intsert() {
		System.out.println("����Ŭ DB���� ����");
	}

	@Override
	public void update() {
		System.out.println("����Ŭ DB���� ����");
	}

	@Override
	public void delete() {
		System.out.println("����Ŭ DB���� ����");
	}
	
	

}
