package org.ip.sesion02;

public class Ecuacion2Grado {
	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int c = 1;
		double x1;
		double x2;
		double raiz;
		double discriminante;
		System.out.println("SOLUCI�N DE UNA ECUACI�N DE 2� GRADO");
		System.out.println("Valores de los coeficientes.\n " + "a = " + a + ", b = " + b + ", c = " + c);
		raiz = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
		x1 = ((-b + raiz) / (2 * a));
		x2 = ((-b - raiz) / (2 * a));
		discriminante = (b*b)-(4*a*c);
		
		if (a == 0) {
			System.out.println("No es una ecuaci�n de 2� grado");
		} else {
			if (discriminante < 0) {
				System.out.println("No tiene soluci�n real");
			} else {
				if (raiz >= 0 && x1 == x2) {
					System.out.println("Una �nica raiz doble.\n " + "x = " + x1);
				} else {
					if (raiz > 0 && x1 != x2) {
						System.out.println("Dos raices de valores.\n "+ "x1 = " + x1 + " y x2 = " + x2);
					}
				}
			}
		}
	}

}
	


