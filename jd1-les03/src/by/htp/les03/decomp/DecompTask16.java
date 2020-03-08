package by.htp.les03.decomp;

public class DecompTask16 {

	public static void main(String[] args) {

		// 16. Два простых числа называются «близнецами», если они отличаются друг от
		// друга на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из
		// отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения
		// задачи использовать декомпозицию.

		int n = 4;
		int m = n * 2;
		twins(n, m);
		
		
	}
	public static void twins(int a, int b) {
		int y = 0;
		for(int i = a; i < b - 1; i++) {
			y = i + 2;
			System.out.println(i + " - " + y);
		}
	}
}

