package by.htp.les03.decomp;

public class DecompTask13 {

	public static void main(String[] args) {

		// 13. Дано натуральное число N. Написать метод(методы) для формирования
		// массива, элементами которого являются цифры числа N.

		int a = 123698745;

		int count = count(a);
		int[] mas = new int[count];
		chToMass(mas, a);

	}

	public static int count(int a) {
		int count = 0;
		while (a > 0) {
			count++;
			a /= 10;
		}
		return count;
	}

	public static void chToMass(int[] a, int b) {
		while (b > 0) {
			for (int i = 0; i < a.length; i++) {
				int x;
				x = b % 10;
				b /= 10;

				a[i] = x;
				System.out.print(a[i] + " ");
			}
		}
	}
}
