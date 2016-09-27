package org.ip.sesion06;

import java.util.Scanner;

public class TestFraccion {
	
private static Scanner entrada;
public static void main(String[] args){
	entrada = new Scanner (System.in);
	int numFracciones = 0;
	int numerador = 0;
	int denominador = 0;
	System.out.println("¿Cuantas comparaciones de fracciones deseas hacer?");
	numFracciones = entrada.nextInt();
	for(int i = 1; i <= numFracciones; i++ ){
		System.out.println("Comparación " + i);
		System.out.println("Introduzca numerador y denominador de la primera fraccion");
		numerador = entrada.nextInt();
		denominador = entrada.nextInt();
		Fraccion primera = new Fraccion(numerador, denominador);
		System.out.println("Introduzca numerador y denominador de la segunda fraccion");
		numerador = entrada.nextInt();
		denominador = entrada.nextInt();
		Fraccion segunda = new Fraccion(numerador, denominador);
		
		if(primera.compareTo(segunda) > 0)
			System.out.println(primera + " es mayor que " + segunda);
		else 
			if(primera.compareTo(segunda) < 0)
			System.out.println(primera + " es menor que " + segunda);
		else 
			System.out.println(primera + " es igual que " + segunda);
		
		System.out.println();
	}
	
	
	
	
	
}

}
