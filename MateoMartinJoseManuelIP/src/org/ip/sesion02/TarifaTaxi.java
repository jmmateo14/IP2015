package org.ip.sesion02;

import java.util.Scanner;

public class TarifaTaxi {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int precioBase = 18;
		int km = 0;
		double kmAux;
		// AL sobre pasar los 100 km el precio sera = 18 + (70*0.85) + los km
		// que se sobre pase de 100
		double precioMasDe100Km = 59.50;
		System.out.println("¿Cuantos kilometros ha recorrido?");
		km = teclado.nextInt();
		if (km <= 30) {
			System.out.println("Su precio es " + precioBase + "€ .Gracias");
		} else {
			if (km > 30 && km <= 100) {
				kmAux = (double)((km - 30) * 0.85 + precioBase);
				System.out.println("Su precio es " + kmAux + "€ .Gracias");
			} else {
				if (km > 100) {
					kmAux = (double) (precioMasDe100Km + precioBase + (km - 100) * 0.65);
					System.out.println("Su precio es " + kmAux + "€ .Gracias");

				}
			}
		}
	}
}
