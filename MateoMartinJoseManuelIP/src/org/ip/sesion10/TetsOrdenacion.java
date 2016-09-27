package org.ip.sesion10;

import org.ip.sesion06.Fraccion;

import java.util.Arrays;

public class TetsOrdenacion {

	public static void main(String[] args) {
		int[] a = { 20, 6, -30, 8, 1 };
		Integer[] arrayEnteros = { new Integer(24), new Integer(0),
				new Integer(13), new Integer(7) };
		// int[] b = {24, 13, 7, 0};
		Fraccion[] fracciones = { new Fraccion(-1, 4), new Fraccion(1, 4),
				new Fraccion(2, 3), new Fraccion(1, 5) };
		String[] b = { "Garcia", "Perez", "Amat", "Gimenez", "Abad" };

		System.out.println("Array de enteros generados " + "\n"
				+ Arrays.toString(a));
		System.out.println();
		System.out.println("Array de objetos enteros generado " + "\n"
				+ Arrays.toString(arrayEnteros));
		System.out.println();
		System.out.println("Array de fracciones generado " + "\n"
				+ Arrays.toString(fracciones));
		System.out.println();
		System.out.println("Array de string generado " + "\n"
				+ Arrays.toString(b));

		System.out.println();
		Ordenacion.burbuja(a);
		System.out
				.println("Array de enteros ordenado por el método de la burbuja "
						+ "\n" + Arrays.toString(a));

		System.out.println();
		Ordenacion.burbujaMejorada(arrayEnteros);
		System.out
				.println("Array de objetos enteros ordenados por el metodo de la burbuja mejorado "
						+ "\n" + Arrays.toString(arrayEnteros));

		System.out.println();
		Ordenacion.insercion(fracciones);
		System.out
				.println("Array de fracciones ordenado por el método de insercion "
						+ "\n" + Arrays.toString(fracciones));

		System.out.println();
		Ordenacion.seleccion(b);
		System.out
				.println("Array de string ordenado por el método de seleccion "
						+ "\n" + Arrays.toString(b));
		
		System.out.println();
		System.out
				.println("Array de enteros ordenado por el metodo de la burbuja Comparable");
		Ordenacion.burbuja(fracciones);
		
		System.out.println(Arrays.toString(fracciones));
		System.out.println();

		System.out
				.println("Array de enteros ordenados por bubujaMejorada Comparable");
		Ordenacion.burbujaMejorada(a);
		System.out.println(Arrays.toString(a));
		System.out.println();

		System.out
				.println("Array de enteros ordenados por insercion Comparable");
		Ordenacion.insercion(a);
		System.out.println(Arrays.toString(a));
		System.out.println();

		System.out
				.println("Array de String ordenados por seleccion Comparable");
		Ordenacion.seleccion(fracciones);
		System.out.println(Arrays.toString(fracciones));
		System.out.println();
	}

}
