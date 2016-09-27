package org.ip.sesion04;

import java.util.Scanner;

public class ConjeturaUlam {
	public static void generarUlam( int n) {
		// TODO Auto-generated method stub
		System.out.println("Sucesion de Ulam generada");
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
				
			} else {
				n = (n * 3) + 1;
			
			}
			System.out.println(n + "\t");
		}

	}
	
	public static void main (String[] args){
	Scanner teclado = new Scanner (System.in);	
		int n;
		do{
			System.out.println("Introduce cualquier numero entero positivo");
			n = teclado.nextInt();
		} while (n <= 0);
		
		generarUlam(n);
	}
}
