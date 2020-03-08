package by.htp.les03.decomp;

public class DecompTask15 {

	public static void main(String[] args) {

		// 15. Даны натуральные числа К и N. Написать метод(методы) формирования массива
		// А, элементами которого являются числа, сумма цифр которых равна К и которые
		// не больше N.

		int k = 10;
		int n = 50;
		int a;
		int[] mas;

		a = count(k, n);
		mas = new int[a];

		masInit(mas, k, n);
		masPrint(mas);
	}

	public static int sum(int i) {
		int a = 0;
		int sum = 0;
		while (i > 0) {
			a = i % 10;
			sum += a;
			i /= 10;
		}
		return sum;
	}

	public static int count(int k, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (sum(i) == k) {
				count++;
			}
		}
		return count;
	}

	public static void masInit(int[] a, int k, int n) {
		int i = 0;
		for (int j = 0; j < n; j++) {
			if (sum(j) == k) {
				a[i] = j;
				i++;
			}
		}
	}

	public static void masPrint(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}