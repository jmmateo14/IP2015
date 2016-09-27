package org.ip.sesion02;
import java.util.Scanner;
public class OperacionAritmetica {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		//TODO Auto-generated method stub
	 double x;
	 double y;
	 
		System.out.println("Valor de la x = ");
		x = teclado.nextInt();
		System.out.println("Valor de la y = ");
		y = teclado.nextInt();
		System.out.println("Operador elejido = /");
		
		System.out.println("El valor de x elegido es " + x);
		System.out.println("El valor de y elejido es " + y);
		System.out.println("El operador elegido es /");
		System.out.println("La solucion es " + x + " / " + y + " = " + (x / y));
	}


}




