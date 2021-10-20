package Day15;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Day15_11 {
	
	// p.761
	
	public static void main(String[] args) {
		
		// 1. map�÷��� ��ü ����
		TreeMap<Integer, String> scores = new TreeMap<>();
			// Ű=integer   , �� =String
		
		// map�� ��ü �ֱ�
		scores.put(87, "ȫ�浿");
		scores.put(98, "�̵���");
		scores.put(75, "�ڱ��");
		scores.put(95, "�ſ��");
		scores.put(80, "���ڹ�");
		// 3. �������� [ scores.descendingMap(); �������̽��� ���� ]
		NavigableMap<Integer, String> desc = scores.descendingMap();
		
		for(Map.Entry<Integer, String> entry : desc.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}	
		// 3. ��������
		NavigableMap<Integer, String> asc = desc.descendingMap();
		for(Map.Entry<Integer, String> entry : asc.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}
}
