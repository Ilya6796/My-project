package ostpc;

import java.util.Scanner;

class Elements {
	double x = 10;
	double y = 10;
	double R = 5;
}
public class Circle {
	static Scanner sc = new Scanner(System.in);
	static Elements cl = new Elements();
	private static void center() {
		int dx = 1, dy = 2;
		double x = dx + cl.x;
		double y = cl.y + dy;
		System.out.println("x = " + x + " y = " + y);
	}
	private static void dotInCircle() {
		System.out.print("x1 = ");
		double x1 = sc.nextDouble();
		System.out.print("y2 = ");
		double y1 = sc.nextDouble();
		if (Math.pow(x1 - cl.x, 2) + Math.pow(y1 - cl.y, 2) <= Math
				.pow(cl.R, 2)) {
			System.out.println("Вы попали в окружность");
		} else {
			System.out.println("Вы вне окружности");
		}
	}
	private static void circleInCircle() {
		System.out.print("x1 = ");
		double x1 = sc.nextDouble();
		System.out.print("y2 = ");
		double y1 = sc.nextDouble();
		System.out.print("R = ");
		double r1 = sc.nextDouble();
		double d = Math.sqrt(Math.pow(x1 - cl.x, 2) + Math.pow(y1 - cl.y, 2));
		double hR = cl.R - r1;
		if (d <= hR && d == hR) {
			System.out.println("Вы попали в окружность");
		} else {
			System.out.println("Вы не попали в окружность");
		}
	}
	private static void parametrs() {
		System.out.println("x = " + cl.x + " y = " + cl.y + " r = " + cl.R);
	}
	public static void main(String[] args) {
		System.out.println("Смещение окружности:");
		center();
		System.out.println("Попадание точки в окружность:");
		dotInCircle();
		System.out.println("Попадание окружности в окружность:");
		circleInCircle();
		System.out.println("Параметры окружности:");
		parametrs();
	}
	}
