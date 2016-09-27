package org.ip.sesion08;

import java.util.Scanner;

public class EntradaSalidaArrays {
	private static Scanner entrada;
	
	public static double[] leerReales1D(){
		entrada = new Scanner (System.in);
		System.out.println("Introduzca el numero de componentes del array");
		int dimension = entrada.nextInt();
		double[] a = new double [dimension];
		System.out.println("Introduce valores reales en el array");
		for (int i = 0; i<a.length;i++){
			System.out.println("Introducir valor " + (i + 1) + " => ");
			a[i]= entrada.nextDouble();
			
		}
		return a;
	}

	public static int[] leerEnteros1D(){
		entrada = new Scanner (System.in);
		System.out.println("Introduzca el numero de componentes del array");
		int dimension = entrada.nextInt();
		int[] a = new int [dimension];
		System.out.println("Introduce valores reales en el array");
		for (int i = 0; i<a.length;i++){
			System.out.print("Introducir valor " + (i + 1) + " => ");
			a[i]= entrada.nextInt();
			
		}
		return a;
	}
	public static int [] inicializarEntero1D(){
		int N = 50;
		entrada = new Scanner (System.in);
		System.out.println("Introducir el numero de componentes del array de enteros");
		int dimension = entrada.nextInt();
		int [] a = new int [dimension];
		for(int i = 0; i < a.length; i++){
			a[i]= (int)(Math.random()*N);
		}
		return a;
	}
	
	public static double [] inicializarReales1D(){
		double N = 50;
		
		System.out.println("Introducir el numero de componentes del array de enteros");
		int dimension = entrada.nextInt();
		double [] a = new double [dimension];
		for(int i = 0; i < a.length; i++){
			a[i]= Math.random()*N;
		}
		return a;
	}
	
public static void mostrar1D (double[] a){
	System.out.println("Los valores guardados en el array son");
	for(int i = 0;i<a.length;i++){
		System.out.print(a[i] + "\t");
	}
}
	
	public static void mostrar1D (int[] a){
		System.out.println("Los valores guardados en el array son");
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i] + "\t");
		}	
}
}
