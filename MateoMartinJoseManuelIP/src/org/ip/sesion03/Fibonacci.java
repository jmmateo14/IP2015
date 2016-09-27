package org.ip.sesion03;
import java.util.Scanner;
public class Fibonacci {
	static Scanner teclado = new Scanner (System.in);
	public static void main (String[] args){
		int numero, fibo1, fibo2, i;
		do{ 
			System.out.println("Introdzca un número de términos mayor que 1 que desea ver de la serie de Fibonacci");
		numero = teclado.nextInt();
		}while(numero <= 1);
		System.out.println("Los " + numero + " primeros terminos de la serie de Fibonacci son: ");
		fibo1 = 0;
		fibo2 = 1;
		System.out.println(fibo1 + " ");
		for (i = 2; i <= numero; i++){
			System.out.println(fibo2 + " ");
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
		System.out.println();
		
	}

}
