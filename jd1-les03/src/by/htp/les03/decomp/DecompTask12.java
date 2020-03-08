package by.htp.les03.decomp;

public class DecompTask12 {

	public static void main(String[] args) {

		// 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать
		// метод(методы) вычисления его площади, если угол между сторонами длиной X и Y—
		// прямой.

		int x = 6, y = 3, z = 5, t = 5;
		int gip;
		int areaXY;
		int areaZT;
		int areaQuatro;

		gip = gipotenuza(x, y);
		areaXY = areaTri90(x, y);
		areaZT = areaTriBySide(z, t, gip);
		areaQuatro = areaXY + areaZT;
		System.out.println("Площадь прямоугольника " + areaQuatro);
	}

	public static int areaTri90(int a, int b) {
		int area;
		area = (a * b) / 2;
		return area;
	}

	public static int areaTriBySide(int a, int b, int c) {
		int p;
		int area;

		p = (a + b + c) / 2;
		area = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return area;
	}

	public static int gipotenuza(int a, int b) {
		int c;
		c = (int) Math.sqrt(a * a + b * b);
		return c;
	}
}
