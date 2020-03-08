package by.htp.les03.decomp;

public class DecompTask14 {

	public static void main(String[] args) {

		// 14. Написать метод(методы), определяющий, в каком из данных двух чисел больше
		// цифр.

		int a = 33457;
		int b = 3456;
		quantity(a, b);

	}

	public static void quantity(int a, int b) {
		int aa = a;
		int bb = b;
		;
		int countA = 0;
		int countB = 0;

		while (aa != 0) {
			aa = aa / 10;
			countA++;
		}
		while (bb != 0) {
			bb = bb / 10;
			countB++;
		}
		if (countA > countB) {
			System.out.println("В числе " + a + " цифр больше, чем в числе " + b);
		} else if (countA < countB) {
			System.out.println("В числе " + b + " цифр больше, чем в числе " + a);
		} else {
			System.out.println("В числах " + a + " и " + b + " количество цифр одинаковое");
		}
	}
}
