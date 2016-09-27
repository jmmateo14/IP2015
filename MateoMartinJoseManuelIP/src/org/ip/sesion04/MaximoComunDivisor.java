package org.ip.sesion04;
import java.util.Scanner;
public class MaximoComunDivisor {
	public static int mcdRecursivo(int m, int n){
		if (m % n == 0){
			return n;
		}else{
			return mcdRecursivo (n, m % n);
		}
	}
	public static void main (String[] args){
		int dato1;
		int dato2;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce primer valor");
		dato1 = teclado.nextInt();
		System.out.println("Introduce segundo valor");
		dato2 = teclado.nextInt();
		int dato3;
		dato3 = mcdRecursivo(dato1, dato2);
		System.out.println("El MCD de " + dato1 + " y " + dato2 + " es " +dato3 );
		
	}
}
