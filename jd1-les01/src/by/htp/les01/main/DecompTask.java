package by.htp.les01.main;

public class DecompTask {

	public static void task01() {
		int area = areaTriByPoint(-2, -1, 2, 3, 4, -2);

		System.out.println("������� ������������ ����� " + area);
	}

	public static void task02() {
		int x = 35;
		int y = 28;

		int a = max(x, y);
		int b = min(x, y);
		int c = nod(a, b);

		int nok = (a * b) / c;

		System.out.println("���������� ����� �������� ����� " + a + " � " + b + " ����� " + c);
		System.out.println("���������� ����� ������� ����� " + a + " � " + b + " ����� " + nok);
	}

	public static void task03() {
		int a = 12, b = 8, c = 32, d = 16;
		int nod = nod(nod(a, b), nod(c, d));
		System.out.println(nod);
	}

	public static void task04() {
		int a = 6, b = 8, c = 12;
		int nod;
		int nok;

		nod = nod(nod(a, b), c);
		nok = (a * b * c) / nod;

		System.out.println(nok);
	}

	public static void task05() {
		int a = 6, b = 8, c = 12;
		int min;
		int max;
		int sum;

		min = min(min(a, b), c);
		max = max(max(a, b), c);
		sum = sum(min, max);

	}

	public static void task06() {
		int a = 6;
		int areaHexagon;
		areaHexagon = 6 * areaTriEquil(a);
		System.out.println(areaHexagon);
	}

	public static void task07() {
	}

	public static void task09() {
		int a = 3, b = 7, c = 11;
		int nod;
		nod = nod(nod(a, b), c);
		if (Math.abs(nod) == 1) {
			System.out.println("����� " + a + ", " + b + ", " + c + " �������� ������� ��������");
		} else {
			System.out.println("����� " + a + ", " + b + ", " + c + " �� �������� ������� ��������");
		}
	}



	public static void task14() {
		int a = 3345;
		int b = 3456;
		quantity(a, b);

	}

	//
	// 01. ����������� ����� ������������ ����� ������. �������� ����� ���
	// ���������� ��� �������.
	public static int areaTriByPoint(int x1, int y1, int x2, int y2, int x3, int y3) {
		int area;
		area = Math.abs(((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1))) / 2;
		return area;
	}

	//
	// 02. �������� �����(������) ��� ���������� ����������� ������ �������� �
	// ����������� ������ ��������
	// ���� ����������� �����:
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

	public static int nod(int a, int b) {
		int x = 1;
		while (a != 0 && b != 0) {
			x = a % b;
			a = b;
			b = x;
		}
		return a;
	}

	//
	// 05. �������� �����(������) ��� ���������� ����� �������� � �������� �� ����
	// �����.
	public static int sum(int a, int b) {
		return a + b;
	}

	//
	//
	//
	//
	//
	//
	// 14. �������� �����(������), ������������, � ����� �� ������ ���� ����� ������
	// ����.
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
			System.out.println("� ����� " + a + " ���� ������, ��� � ����� " + b);
		} else if (countA < countB) {
			System.out.println("� ����� " + b + " ���� ������, ��� � ����� " + a);
		} else {
			System.out.println("� ������ " + a + " � " + b + " ���������� ���� ����������");
		}
	}

	public static int areaTriEquil(int a) {
		int area;
		area = (int) (((3 * Math.sqrt(3)) / 2) * (a * a));
		return area;
	}

}
