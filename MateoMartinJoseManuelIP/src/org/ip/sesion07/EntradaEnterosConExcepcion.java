package org.ip.sesion07;

import java.util.Scanner;

public class EntradaEnterosConExcepcion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);
	    // Introducir dos enteros
	    System.out.print("Introduzca dos valores enteros: ");
	    int number1 = 0;
	    int number2 = 0;
	    boolean correcto = false;
	    do {
		try {
			number1 = entrada.nextInt();
			number2 = entrada.nextInt();
			 System.out.println("La suma es  " + (number1 + number2));
			 correcto = true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Los numeros leidos no son correctos. Introduzca dos valores enteros:");
			entrada.nextLine();
		}
	    }
		while (correcto == false);
	   
	    }
	}

