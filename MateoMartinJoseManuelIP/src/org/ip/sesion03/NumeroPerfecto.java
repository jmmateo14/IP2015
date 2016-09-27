package org.ip.sesion03;
import java.util.Scanner;
public class NumeroPerfecto {
static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, suma;
		do{
			System.out.println("Introduce un numero entero positivo, para saber si es perfecto");
			n = teclado.nextInt();
		}while(n <= 0);
		suma = 0;
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0)
				suma = suma + i;
		}
		if (suma == n){
			System.out.println("El numero es perfecto");
		}else{
			System.out.println("El numero no es perfecto");
		}
	}

}
