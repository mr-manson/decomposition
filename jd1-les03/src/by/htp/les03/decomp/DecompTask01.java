package by.htp.les03.decomp;

public class DecompTask01 {

	public static void main(String[] args) {
		
		// 01. Треугольник задан координатами своих вершин. Написать метод для
		// вычисления его площади.

		int area = areaTriByPoint(-2, -1, 2, 3, 4, -2);

		System.out.println("Площадь треугольника равна " + area);
	}

	public static int areaTriByPoint(int x1, int y1, int x2, int y2, int x3, int y3) {
		int area;
		area = Math.abs(((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1))) / 2;
		return area;
	}

}
