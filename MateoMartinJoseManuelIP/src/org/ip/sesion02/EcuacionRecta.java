package org.ip.sesion02;
import java.util.Scanner;
public class EcuacionRecta {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int x1 = 0;
		int x2 = 0;
		int y1 = 0;
		int y2 = 0;
		double a = 0;
		double b = 0;
		System.out.println("Dime X1: ");
		x1 = teclado.nextInt();
		System.out.println("Dime X2: ");
		x2 = teclado.nextInt();
		System.out.println("Dime Y1: ");
		y1 = teclado.nextInt();
		System.out.println("Dime Y2: ");
		y2 = teclado.nextInt();
		
		if (x1 == x2 && y1 == y2){
			System.out.println("Los dos puntos coinciden (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")" + " COINCIDEN, no se puede obtener la ecuacion de la recta");
		} else {
			if (x1 == x2) {
				System.out.println();
				System.out.println("x = " + x1);
			} else {
				if (y1 == y2) {
					System.out.println();
					System.out.println("y = " + y1);
				} else {
					a = (y2 - y1) / (x2 - x1);
					b = y1 - (x1 * a);
					if (b == 0) {
						System.out.println("y = " + a + "x");
					} else {
						if (b > 0) {
							System.out.println("y = " + a + "x + " + b);
						} else {
							System.out.println("y = " + a + "x " + b);
						}
					}
				}
			}
		}
	}
}
