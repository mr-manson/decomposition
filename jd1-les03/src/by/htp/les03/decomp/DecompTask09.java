package by.htp.les03.decomp;

public class DecompTask09 {

	public static void main(String[] args) {

		// 09. Написать метод(методы), проверяющий, являются ли данные три числа взаимно
		// простыми.

		int a = 3, b = 7, c = 11;
		simple(a, b, c);
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

	public static void simple(int a, int b, int c) {
		int nod;
		nod = nod(nod(a, b), c);
		if (Math.abs(nod) == 1) {
			System.out.println("Числа " + a + ", " + b + ", " + c + " являются взаимно простыми");
		} else {
			System.out.println("Числа " + a + ", " + b + ", " + c + " не являются взаимно простыми");
		}
	}
}
