package Test1022;

import java.util.ArrayList;

public class Student {
	public static ArrayList<Student> list = new ArrayList<Student>();
	//�ʵ�
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int total;
	public double avg;
	public static int rank;
	
	
	public static void mainmenu() {
		try {
		System.out.print("�̸��� �Է��� �ּ��� : "); String name = Appplication.scanner.next();
		System.out.print("�������� �Է��� �ּ��� : "); int kor = Appplication.scanner.nextInt();
		System.out.print("�������� �Է��� �ּ��� : "); int eng = Appplication.scanner.nextInt();
		System.out.print("�������� �Է��� �ּ��� : "); int math = Appplication.scanner.nextInt();
			
			Student student = new Student();
			student.setName(name);
			student.setKor(kor);
			student.setEng(eng);
			student.setMath(math);
			student.settotal(kor+eng+math);
			student.setAvg(Student.avgscore(kor, eng, math));
			student.settotal(Student.totalscore(kor, eng, math));
			student.setRank(student.totalrank(1));
			
			list.add(student);
		}
		catch (Exception e) {
			
		}
	}
	public static void print() {
		try {
			System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
			for(int i = 0; i < list.size(); i ++) {
				System.out.println(list.get(i).getName()+"\t"+
						list.get(i).getKor()+"\t"+list.get(i).getEng()+"\t"+
			list.get(i).getMath()+"\t"+list.get(i).gettotal()+"\t"+String.format("%.2f", list.get(i).getAvg()));
			}
		}
		catch (Exception e) {
			
		}
	}
	public static int totalscore(int kor, int eng, int math) {
		
		int stotal = kor+eng+math;
		return stotal;
	}
	public static double avgscore(int kor, int eng, int math) {
		double savg = ((kor+eng+math)/3.0);
		Math.round((savg*100)/100.00);
		return savg;
	}
	
	//������ �𸣰ڽ��ϴ�.
	public int totalrank(int rank) {
		for(int i =0; i < list.size(); i++) {
			rank=1;
			for(int j = 0; j < list.size(); j++) {
				if(list.get(i).gettotal() < list.get(j).gettotal()) {
				 rank++;
				}
			}
		}
		return rank;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int gettotal() {
		return total;
	}
	public void settotal(int total) {
		this.total = total;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
