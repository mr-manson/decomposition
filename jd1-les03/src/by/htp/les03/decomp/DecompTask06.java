package by.htp.les03.decomp;

public class DecompTask06 {

	public static void main(String[] args) {

		// 06. Вычислить площадь правильного шестиугольника со стороной а, используя
		// метод вычисления площади треугольника.

		int a = 6;
		int areaHexagon;
		areaHexagon = 6 * areaTriEquil(a);
		System.out.println(areaHexagon);
	}

	public static int areaTriEquil(int a) {
		int area;
		area = (int) (((3 * Math.sqrt(3)) / 2) * (a * a));
		return area;
	}
}
