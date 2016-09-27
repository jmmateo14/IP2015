package org.ip.sesion03;
import java.util.Scanner;
public class TrianguloNumeros {
static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato;
		int suma;
		int fila;
		do {
			System.out.println("Introduce un valor natural no superior a 20");
			dato = teclado.nextInt();
			teclado.close();
		} while (dato <= 0 || dato > 20 );
		suma = 0;
		for (int i = 1;i <= dato;i ++)
			suma = suma + i;
		System.out.println("TRIANGULO GENERAL");
		for (fila = 1; fila <= dato; fila++){
			for (int i = 1; i <= fila; i++){
				System.out.println(suma + "\t");
				suma--;
			}
			System.out.println();
		}
	}

}
