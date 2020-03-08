package by.htp.les03.decomp;

public class DecompTask04 {

	public static void main(String[] args) {
		
		// 04. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.

		int a = 6, b = 8, c = 12;
		int nod;
		int nok;

		nod = nod(nod(a, b), c);
		nok = (a * b * c) / nod;

		System.out.println(nok);
	}

	public static int nod(int a, int b) {
		int x = 1;
		while (a != 0 && b != 0) {
			x = a % b;
			a = b;
			b = x;
		}
		return a;
	}
}
