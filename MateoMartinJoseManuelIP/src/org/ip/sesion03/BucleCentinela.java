package org.ip.sesion03;
import java.util.Scanner;
public class BucleCentinela {
	static Scanner teclado = new Scanner (System.in);
	public static void main (String [] args){
		//TODO Auto-generated method stub
		int n, contPos, contNeg, cont, sumPos, sumNeg, sum;
		double med;
		System.out.println("Introduce valores enteros, el programa termina si la entrada es 0");
		n = teclado.nextInt();
		contPos = 0;
		contNeg = 0;
		cont = 0;
		sumPos = 0;
		sumNeg = 0;
		sum = 0;
		while (n != 0){
			if ( n > 0){
				contPos++;
				sumPos = sumPos + n;
		}
			else {
				contNeg++;
				sumNeg = sumNeg + n;
			}
			cont++;
			sum = sum + n;
			n = teclado.nextInt();
		}
		teclado.close();
		if (cont == 0){
			System.out.println("Error, no hay numeros validos");
		}
		else{
			med = (double)sum/cont;
			System.out.println("El numero de positivos es " + contPos);
			System.out.println("El numero de negativos es " + contNeg);
			System.out.println("El numero total de valores leidos es " + cont);
			System.out.println("La suma de positivos es " + sumPos);
			System.out.println("La suma de negativos es " + sumNeg);
			System.out.println("La media de los valores es " + med);
		}
	}
}
