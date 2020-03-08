package by.htp.les03.decomp;

public class DecompTask10 {

	public static void main(String[] args) {

		// 10. Написать метод(методы) для вычисления суммы факториалов всех нечетных
		// чисел от 1 до 9.

		int a = 1;
		int b = 9;
		System.out.println(factorial(a, b));
	}

	public static int factorial(int a, int b) {
		int fact = 1;
		for (int i = a; i <= b; i++) {
			fact *= i;
		}
		return fact;
	}
}
