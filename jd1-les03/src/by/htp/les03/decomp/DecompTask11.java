package by.htp.les03.decomp;

public class DecompTask11 {

	public static void main(String[] args) {

		// 11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] +
		// D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для
		// вычисления суммы трех последовательно расположенных элементов массива с
		// номерами от k до m.

		int[] mas = new int[] { 3, 5, 6, 9, 7, 1, 5, 8, 4, 9 };
		// massInit(mas, i);
		for (int j = 0; j < mas.length; j++) {
			System.out.print(mas[j] + " ");
		}
		int k = 1;
		int m = k + 2;
		System.out.println();
		massSum3(mas, k, m);
	}

	public static void massSum3(int[] a, int k, int m) {
		int sum = 0;
		for (int i = k; i <= m; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}
