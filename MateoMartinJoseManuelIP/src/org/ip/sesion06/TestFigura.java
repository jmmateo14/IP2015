package org.ip.sesion06;
import java.util.Locale;
import java.util.Scanner;
public class TestFigura {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		entrada.useLocale(Locale.ENGLISH);
		
		double x;
		double y;
		double ancho;
		double alto;
		double x1;
		double y1;
		double lado;
		
		
		System.out.println("Introducir coordenada x del rectangulo");
		x = entrada.nextDouble();
		System.out.println("Introducir coodenada y del rectangulo");
		y = entrada.nextDouble();
		System.out.println("Introducir ancho del rectangulo");
		ancho = entrada.nextDouble();
		System.out.println("Introducir alto del rectangulo");
		alto = entrada.nextDouble(); 
		
		
		System.out.println("Introducir coordenada x del cuadrado");
		x1 = entrada.nextDouble();
		System.out.println("Introducir coordenada y del cuadrado");
		y1 = entrada.nextDouble();
		System.out.println("Introducir lado del cuadrado");
		lado = entrada.nextDouble();
		
		
		System.out.println("El rectangulo con: ");
		System.out.println("Origen: " + "(" + x + ", " + y + ")");
		System.out.println("Ancho = " + ancho + "  Alto = " + alto + "\n" + "tiene un área de " + ancho * alto);
		System.out.println();
		System.out.println("El cuadrado con: ");
		System.out.println("Origen: " + "(" + x1 + ", " + y1 + ")");
		System.out.println("Lado = " + lado + "\n" + "tiene un área de " + Math.pow(lado, 2));
		
		
	}

}
