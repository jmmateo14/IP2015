package org.ip.sesion03;
import java.util.Scanner;
public class Armonico {
	static Scanner teclado = new Scanner (System.in);
	public static void main (String[] args){
		double suma;
		int n;
		do{
			System.out.println("Introduce un n�mero para mostrar el N�mero Armonico");
			n = teclado.nextInt();
		}while (n <= 0);
		 suma = 0;
		for (int i=1; i<=n; i++){           
            suma = suma + 1.0/i;   
		}
		System.out.println("El valor del n�mero arm�nico es " + suma);
	}
}