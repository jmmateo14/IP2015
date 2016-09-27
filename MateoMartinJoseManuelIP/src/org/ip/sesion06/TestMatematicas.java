package org.ip.sesion06;

import java.util.Scanner;

public class TestMatematicas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x , y;
		double N1, N2, N3;
		do{
			System.out.println("Introduzca un numero entero positivo para calcular el factorial");
			x = entrada.nextInt();
		}while(x < 0);
		System.out.println("El factorial por el metodo iterativo es => " + Matematicas.factorialRecursivo(x));
		System.out.println("El factorial por el metodo recursivo es => " + Matematicas.factorialIterativo(x));
		
		do{
			System.out.println("Introduzca un entero positivo para calcular la conjetura de Ulam");
			x = entrada.nextInt();
		}while(x < 0);
		Matematicas.generarConjeturaUlam(x);
		System.out.println();
		
		do{
			System.out.println("Introduzca entero positivo mayor que 1 para comprobar si es primo");
			x = entrada.nextInt();
		}while(x <= 1);
		if(Matematicas.esPrimo(x)){
			System.out.println("El numero entero" + x + "es primo");
		}else{
			System.out.println("El numero entero" + x + "no es primo");
		}
		
		System.out.println("Introduce un numero para verificar si es perfecto");
		x =entrada.nextInt ();
		if (Matematicas.esPerfecto(x)== true){
			System.out.println(x + "Es perfecto");
		}else{
			System.out.println(x + "No es perfecto");
		}
		
		System.out.println("Introduzca un numero entero para calcular su absoluto");
		x = entrada.nextInt();
		System.out.println("El valor absoluto de " + x + " es => " + Matematicas.absoluto(x));
		
		System.out.println("Introduzca un numero real para calcular su absoluto");
		N1 = entrada.nextDouble();
		System.out.println("El valor absoluto de " + x + " es => " + Matematicas.absoluto(N1));
		
		System.out.println("Introduzca dos numeros enteros para calcular su minimo");
		x = entrada.nextInt();
		y = entrada.nextInt();
		System.out.println("El minimo de " + x + "y" + y + "es => " + Matematicas.min(x, y));
		
		System.out.println("Introduzca dos numeros reales para calcular su minimo");
		N1 = entrada.nextDouble();
		N3 = entrada.nextDouble();
		System.out.println("El minimo de " + N1 + "y" + N3 + "es => " + Matematicas.min(N1, N3));
		
		System.out.println("Introduce tres numeros reales para calcular su minimo");
		N1 = entrada.nextDouble();
		N3 = entrada.nextDouble();
		N2 = entrada.nextDouble();
		System.out.println("El minimo de " + N1 + " , " + N2 + " y " + N3 + "es => " + Matematicas.min(N1, N2, N3));
		
		
		System.out.println("Introduzca dos numeros enteros para calcular su maximo");
		x = entrada.nextInt();
		y = entrada.nextInt();
		System.out.println("El minimo de " + x + "y" + y + "es => " + Matematicas.max(x, y));
		
		
		System.out.println("Introduzca dos numeros reales para calcular su maximo");
		N1 = entrada.nextDouble();
		N3 = entrada.nextDouble();
		System.out.println("El minimo de " + N1 + "y" + N3 + "es => " + Matematicas.max(N1, N3));
		
		
		System.out.println("Introduzca tres numeros reales para calcular su maximo");
		N1 = entrada.nextDouble();
		N3 = entrada.nextDouble();
		N2 = entrada.nextDouble();
		System.out.println("El minimo de " + N1 + " , " + N2 + " y " + N3 + "es => " + Matematicas.max(N1, N2, N3));
		
		
		System.out.println("Introduzca dos numeros enteros para realizar su mcd");
		x = entrada.nextInt();
		y = entrada.nextInt();
		System.out.println("El mcd por el metodo recursivo de" + y + "y" + x + "es => " + Matematicas.mcdRecursivo(y, x));
		System.out.println("El mcd por el metodo de Euclides de" + y + "y" + x + "es => " + Matematicas.mcdEuclides(y, x));

	}

}
