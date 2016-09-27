package org.ip.sesion10;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

import org.ip.sesion08.EntradaSalidaArrays;

public class TestBusqueda {
	
	public static void main (String[] args){
		Scanner entrada = new Scanner (System.in);
		int [] a;
		int valorBuscado;
		int posicion = -1;
		 a = org.ip.sesion09.EntradaSalidaArrays.inicializarEntero1D() ;
		
		
		EntradaSalidaArrays.mostrar1D(a);
		System.out.println();
		System.out.println("Introduzca el numero quedesea econtrar en el array");
		 valorBuscado = entrada.nextInt();
		
		posicion = BusquedaArray.busquedaSecuencial(a, valorBuscado);
		if (posicion != -1)
			System.out.println("Valor " + valorBuscado + " encontrado en la posicion " + posicion);
		else
			System.out.println("Valor " + valorBuscado + " no encontrado");
			
		
		Arrays.sort(a); //Ordenar array
		EntradaSalidaArrays.mostrar1D(a);
		System.out.println();
		posicion = BusquedaArray.busquedaBinaria(a, valorBuscado);
		if (posicion != -1)
			System.out.println("Valor " + valorBuscado + " encontrado en la posicion " + posicion);
		else
			System.out.println("Valor " + valorBuscado + " no encontrado");
	}

}
