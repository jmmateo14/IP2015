package org.ip.sesion03;
import java.util.Scanner;
public class Euclides {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato1 ;
		int dato2;
		int aux;
		do {
			System.out.println("Intorduce el primer valor entero positivo");
			dato1 = teclado.nextInt();
		} while (dato1 < 0);
		
		do { 
			System.out.println("Intorduce el segundo valor entero positivo");
			dato2 = teclado.nextInt();
		} while (dato2 < 0);
		
		while (dato1 % dato2 !=0) {
			aux = dato1;
			dato1 = dato2;
			dato2 = aux % dato2;
		}
		
		System.out.println("El MCD de los valores dados es " + dato2);
		
	}
	
}
