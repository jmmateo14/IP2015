package org.ip.sesion04;

import java.util.Scanner;

public class InvertirEntero {
	public static void mostrarInverso (int valor){
		int cifra1;
		int resto;
		if (valor / 10 < 1 && valor / 10 > -1){
			cifra1 = valor % 10;
			System.out.println(cifra1);
		}else{
			resto = valor % 10;
			System.out.println(resto);
			if (valor < 0){
				valor = -valor;
			}
			mostrarInverso(valor / 10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero;
		System.out.println("Introduzca un valor entero");
		numero = teclado.nextInt();
				teclado.close();
				System.out.println("El entero " + numero + "invertido es");
				mostrarInverso(numero);
	}

}
