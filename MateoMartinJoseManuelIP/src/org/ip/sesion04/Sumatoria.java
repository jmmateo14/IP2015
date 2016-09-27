package org.ip.sesion04;
import java.util.Scanner;
public class Sumatoria {
	
	public static int sumaIterativa(int numero) {
		int suma = 0;
		for (int i = 1; i <= numero; i++)
			suma = suma + i;
		return suma;
	}
	public static int sumaDirecta (int numero){
		int suma = (numero * (numero + 1))/2;
		return suma;
	}
	public static int sumaRecursiva (int numero){
		int suma;
		if (numero == 1)
			suma = 1;
		else
			suma = numero + sumaRecursiva (numero - 1);
		return suma;
	}
	public static void main (String[] args){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		int n;
		System.out.println("Introduce el numero de terminos que desea sumar");
		n = teclado.nextInt();
		int resul1 = sumaIterativa(n);
		int resul2 = sumaDirecta(n);
		int resul3 = sumaRecursiva(n);
		System.out.println("La suma usando el metodo iterativo de los " + n + " primeros numeros es " + resul1);
		System.out.println("La suma usando el metodo directo de los " + n + " primeros numeros es " + resul2);
		System.out.println("La suma usando el metodo recursivo de los " + n + " primeros numeros es " + resul3);
		if (resul1 == resul2 && resul1 == resul3){
			System.out.println("Funcionamiento corecto");
				
		}else{
			System.out.println("Funcionamiento incorrecto");
		}
	}

}
