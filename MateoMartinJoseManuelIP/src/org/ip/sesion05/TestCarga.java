package org.ip.sesion05;

import java.util.Locale;
import java.util.Scanner;

public class TestCarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		entrada.useLocale(Locale.ENGLISH);
		
		int numCargas;
		double x;
		double y;
		double total;
		
		System.out.println("Programa que permite calcular el POTENCIAL ELECTRICO en un puto generado por una distribucion  discreta de cargas");
		System.out.println();
		do{
			System.out.println("Indique cuantas cargas tiene el sistema");
			numCargas = entrada.nextInt();
		}while (numCargas <= 0);
		System.out.println("Indica el potencial en cada punto P (x, y) en metros donde vas a calcular el potencia producido por las cargas");
		
		x = entrada.nextDouble();
		y = entrada.nextDouble();
		total = 0;
		for (int i = 1; i <= numCargas; i++){
			System.out.println("CARGA" + i);
			System.out.println("Introduce el valor de la carga en culombios y la posicion de la misma en metros");
			double q = entrada.nextDouble();
			double rx = entrada.nextDouble();
			double ry = entrada.nextDouble();
			Carga carga = new Carga (rx, ry, q);
			System.out.println("q" + i + " = " + carga.toString());
			total = total + carga.potenciaEn(x, y);
			
		}
		System.out.println();
		System.out.print("El potencial en el punto (" + x +  ", " + y + ") debido a las " + numCargas + " cargas es = ");
		System.out.printf("%6.2f V", total);

	}

}
