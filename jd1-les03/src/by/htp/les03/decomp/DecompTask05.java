package by.htp.les03.decomp;

public class DecompTask05 {

	public static void main(String[] args) {
		
		// 05. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.

		int a = 6, b = 8, c = 12;
		int min;
		int max;

		min = min(min(a, b), c);
		max = max(max(a, b), c);
		sum(min, max);

	}

	public static int max(int a, int b) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}

	public static int min(int a, int b) {
		int min = 0;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		return min;
	}


	public static int sum(int a, int b) {
		return a + b;
	}
}
