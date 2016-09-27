package org.ip.sesion09;

import java.util.Scanner;

public class TestOperacionesMatrices {
	public static void main (String[] arg){
		System.out.println("LECTURA DE LA MATRIZ A");
		System.out.println("Introduce el numero de filas y columnas de la matriz");
		Scanner entrada = new Scanner (System.in);
		int [][] a = EntradaSalidaArrays.leerEnteros2D();
		
		
		
		System.out.println("LUCTURA DE LA MATRIZ B");
		System.out.println("Introduce el numero de filas y columnas de la matriz");
		int[][] b = EntradaSalidaArrays.leerEnteros2D();
		
		
		System.out.println("Matriz A");
		EntradaSalidaArrays.mostrar2D(a);
		
		System.out.println("Matriz B");
		EntradaSalidaArrays.mostrar2D(b);
		
		System.out.println("LA MATRIZ PRODUCTO ES");
		System.out.println();
		int[][] c = OperacionesMatricesCuadradas.producto(a, b);
		EntradaSalidaArrays.mostrar2D(c);
		
		System.out.println("LA MATRIZ SUMA ES");
		int [][] resultado = OperacionesMatricesCuadradas.suma(a, b);
		EntradaSalidaArrays.mostrar2D(resultado);
		
		System.out.println("LA MATRIZ D ES");
		int[][] d = {{1,2,3}, {2,1,7}, {3,7,1}};
		EntradaSalidaArrays.mostrar2D(d);
		boolean simetria = OperacionesMatricesCuadradas.esSimetrica(d);
		if(simetria)
			System.out.println("ES SIMÉTRICA");
		else
			System.out.println("NO ES SIMÉTRICA");
		
		
		System.out.println();
		System.out.println("LA TRAZA DE LA MATRIZ D ES " + OperacionesMatricesCuadradas.traza(d));
		System.out.println();
		
		
		System.out.println("LA MATRIZ A MULTIPLICADA POR 3 ES");
		int f = 3;
		int [][] z = OperacionesMatricesCuadradas.producto(a, f);
		EntradaSalidaArrays.mostrar2D(z);
		
		System.out.println("VAMOS A GENERAR UNA MATRIZ CON VALORES ALEATORIOS");
		int[][] g = EntradaSalidaArrays.inicializarEntero2D();
		System.out.println("Matriz A");
		EntradaSalidaArrays.mostrar2D(g);
		boolean simetria1 = OperacionesMatricesCuadradas.esSimetrica(g);
		if(simetria1)
			System.out.println("ES SIMÉTRICA");
		else
			System.out.println("NO ES SIMÉTRICA");
		
	
		
		
		
	}

}
