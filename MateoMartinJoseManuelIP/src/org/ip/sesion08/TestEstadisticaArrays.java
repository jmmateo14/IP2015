package org.ip.sesion08;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TestEstadisticaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		entrada.useLocale(Locale.ENGLISH);
		int [] a;
		int [] b;
		double[] c;
		double [] d;
		
		System.out.println("Vamos a guardar un array de enteros con valores que se introducirán por teclado");
		System.out.println("ARRAY 1");
		a = org.ip.sesion08.EntradaSalidaArrays.leerEnteros1D() ;
		EntradaSalidaArrays.mostrar1D(a);
		
		System.out.println();
		System.out.println("Vamos a guardar un array de enteros con valores que se introducirán por teclado");
		System.out.println("ARRAY 2");
		b = org.ip.sesion08.EntradaSalidaArrays.inicializarEntero1D();
		EntradaSalidaArrays.mostrar1D(b);
		
		System.out.println();
		System.out.println("Vamos a guardar un array de enteros con valores que se introducirán por teclado");
		System.out.println("ARRAY 3");
		c = org.ip.sesion08.EntradaSalidaArrays.leerReales1D();
		EntradaSalidaArrays.mostrar1D(c);
		
		System.out.println();
		System.out.println("Vamos a guardar un array de enteros con valores que se introducirán por teclado");
		System.out.println("ARRAY 4");
		d = org.ip.sesion08.EntradaSalidaArrays.inicializarReales1D();
		EntradaSalidaArrays.mostrar1D(d);
		
		System.out.println();
		System.out.println("ESTADÍTICA DEL PRIMER ARRAY => ");
		EntradaSalidaArrays.mostrar1D(a);
		
		System.out.println();
		int max = EstadisticaArrays.max(a);
		System.out.println("El máximo es... " + max );
		
		System.out.println();
		int min = EstadisticaArrays.min(a);
		System.out.println("El mínimo es... " + min);
		
		System.out.println();
		int media = EstadisticaArrays.media(a);
		System.out.println("La media es... " + media);
		
		System.out.println();
		double stdDev = EstadisticaArrays.stdDev(a);
		System.out.println("La desviacion del arrays es... " + stdDev);
		
		System.out.println();
		int inferior = 0;
		int superior = 0;
		double valorMedio = 0;
		boolean indicesCorrectos = false;
		while (!indicesCorrectos){
			try{
				System.out.println("Introduce indice inferior y superior para calcular la media del subarray");
				inferior = entrada.nextInt();
				superior = entrada.nextInt();
				valorMedio = EstadisticaArrays.media(a, inferior - 1, superior - 1);
				indicesCorrectos = true;
			}catch (RuntimeException e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("La media del subarray es... " + valorMedio );
		
		System.out.println();
		double stdDev1 = EstadisticaArrays.stdDev(a, inferior, superior);
		System.out.println("La desviacion del subarrays es... " + stdDev1);
		
		System.out.println();
		System.out.println("El máximo del subarray es... " + EstadisticaArrays.max(a, inferior - 1, superior - 1));
		
		System.out.println();
		System.out.println("El mínimo del subarray  es... " + EstadisticaArrays.min(a, inferior - 1, superior - 1));
		
		System.out.println();
		System.out.println("El ARRAY 2 ordenado es ");
		Arrays.sort(b);
		EntradaSalidaArrays.mostrar1D(b);
		
	}

	}

