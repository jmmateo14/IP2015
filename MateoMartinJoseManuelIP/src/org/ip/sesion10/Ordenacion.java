package org.ip.sesion10;

public class Ordenacion {
	
	public static void burbuja(int[] a){ 
		 int aux;
		 for (int i = 1; i < a.length; i++)
		  for (int j = 0; j < a.length - i ;j++) 
		   if (a[j] > a[j +1]){
		   //Intercambio
		    aux = a[j];
		    a[j] = a[j +1]; 
		    a[j + 1] = aux; 
		   } 
		} 
		
	public static void burbujaMejorada(int[] a) {
		 boolean cambiado = true;
		 int i = 1;
		 int aux;
		 while (cambiado && (i < a.length)) {
		  cambiado = false;
		  for (int j = 0; j < a.length - i; j++) { 
		        if (a[j] >(a[j + 1])) {
		   //Intercambio
		   aux = a[j];
		   a[j] = a[j +1]; 
		   a[j + 1] = aux; 
		   cambiado = true;} 
		  }  
		  i++; 
		  }
		 } 
		
	private static void intercambio (int[] a, int i, int j){
		int swap;
		 swap = a[j];
		   a[j] = a[j +1]; 
		   a[j + 1] = swap; 
		
	}
	
	public static void insercion(int[] a) {
		 for (int i = 1; i < a.length; i++) { 
		      int aux = a[i];
		      int j;
		      for (j = i - 1; j >= 0 && aux < a[j]; j--) { 
		  a[j + 1] = a[j];
		       }
		      // Inserto el elemento (aux) en a[j + 1]
		      a[j + 1] = aux;
		 }
		} 
	
	public static void seleccion(int[] a) {
		 for (int i = 0; i < a.length - 1; i++) {
		       //Busco el mínimo en a[i ..a.length-1]
		      int valorMinimo = a[i];
		      int posicionMinimo = i;
		      for (int j = i + 1; j  < a.length; j++) {
		  if (a[j] < valorMinimo){ 
		         valorMinimo = a[j];
		         posicionMinimo = j;}
		       }
		      // Intercambio a[i] con a[posicionMinimo] si es necesario
		      if (posicionMinimo != i){
		  a[posicionMinimo] = a[i];
		  a[i] = valorMinimo;
		  }
		 }
		 } 
		 
	public static void burbuja(Comparable[] a){ 
		 Comparable aux;
		 for (int i = 1; i < a.length; i++)
		  for (int j = 0; j < a.length - i ;j++) 
		   if (a[j].compareTo(a[j +1]) < 0 ){
		   //Intercambio
		    aux = a[j];
		    a[j] = a[j +1]; 
		    a[j + 1] = aux; 
		   } 
		} 
		
	public static void burbujaMejorada(Comparable[] a) {
		 boolean cambiado = true;
		 int i = 1;
		 Comparable aux;
		 while (cambiado && (i < a.length)) {
		  cambiado = false;
		  for (int j = 0; j < a.length - i; j++) { 
		        if (a[j].compareTo(a[j + 1]) > 0) {
		   //Intercambio
		   aux = a[j];
		   a[j] = a[j +1]; 
		   a[j + 1] = aux; 
		   cambiado = true;} 
		  }  
		  i++; 
		  }
		 } 
	
	private static void intercambio (Comparable[] a, int i, int j){
		Comparable swap;
		 swap = a[j];
		   a[j] = a[j +1]; 
		   a[j + 1] = swap; 
	}
	
	public static void insercion(Comparable[] a) {
		 for (int i = 1; i < a.length; i++) { 
		      Comparable aux = a[i];
		      int j;
		      for (j = i - 1; j >= 0 && aux.compareTo(a[j]) < 0; j--) { 
		  a[j + 1] = a[j];
		       }
		      // Inserto el elemento (aux) en a[j + 1]
		      a[j + 1] = aux;
		 }
		} 
	
	public static void seleccion(Comparable[] a) {
		 for (int i = 0; i < a.length - 1; i++) {
		       //Busco el mínimo en a[i ..a.length-1]
		      Comparable valorMinimo = a[i];
		      int posicionMinimo = i;
		      for (int j = i + 1; j  < a.length; j++) {
		  if (a[j].compareTo(valorMinimo) < 0){ 
		         valorMinimo = a[j];
		         posicionMinimo = j;}
		       }
		      // Intercambio a[i] con a[posicionMinimo] si es necesario
		      if (posicionMinimo != i){
		  a[posicionMinimo] = a[i];
		  a[i] = valorMinimo;
		  }
		 }
		 } 

	
}


