package org.ip.sesion03;
import java.util.Scanner;
public class ConjeturaUlam {
	static Scanner teclado = new Scanner (System.in);
	public static void main (String[] args) {
		//TODO Auto-generated method stub
		int n;
		
		do{
			System.out.println("Introduce cualquier numero entero positivo");
			n = teclado.nextInt();
		} while (n <= 0);
		System.out.println("Sucesion de Ulam generada a partir de " + n);
		System.out.println();
		while (n != 1){
			if (n % 2 == 0) {
			n = n / 2; 
		} else {
			n = (n * 3) + 1;
		}System.out.println(n+ "\t");
		}
		
	}
		
}
