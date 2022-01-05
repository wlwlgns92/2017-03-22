package Test;

import java.util.Scanner;

public class 인덕션 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean sw1 = true;
		boolean sw2 = true;

		while (true) {
			System.out.print("1번인덕션 | 2번인덕션 | 선택 : ");
			int ch = scanner.nextInt();

			if (ch == 1) {
				Thread thread = new first();
				if (sw1) {
					first.start(sw1);
					thread.start();
					sw1 = false;
				} else {
					first.start(sw1);
					sw1 = true;
				}
			} else if (ch == 2) {
				Thread thread = new second();
				if (sw2) {
					second.start(sw2);
					thread.start();
					sw2 = false;

				} else {
					second.start(sw2);
					sw2 = true;
				}
			}
		}
	}
}
