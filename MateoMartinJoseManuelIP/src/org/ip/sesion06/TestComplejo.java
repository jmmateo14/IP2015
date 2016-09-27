package org.ip.sesion06;

import java.util.Locale;
import java.util.Scanner;

public class TestComplejo {

	private static Scanner entrada;
	
	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		entrada.useLocale(Locale.ENGLISH);
		
		Complejo c1;
		Complejo c2;
		double pReal, pImaginaria;
		
		//Lectura del primer complejo
		System.out.println("PRIMER NUMERO COMPLEJO");
		System.out.println("Introduzca la parte real");
		pReal= entrada.nextDouble();
		
		System.out.println("Introducir la parte imaginaria");
		pImaginaria= entrada.nextDouble();
		
		c1 = new Complejo (pReal, pImaginaria);
		
		//Lectura del segundo complejo
		System.out.println("SEGUNDO NUMERO COMPLEJO");
		System.out.println("Introduzca la parte real");
		pReal= entrada.nextDouble();
		
		System.out.println("Introducir la parte imaginaria");
		pImaginaria= entrada.nextDouble();
		
		c2 = new Complejo (pReal, pImaginaria);
		
		//Resultado de las operaciones
		System.out.println("RESULTADO DE LAS OERACIONES");
		
		//suma de los dos numeros complejos
		System.out.println("(" + c1.toString()+ ")" + " + " + "(" + c2.toString() + ")" + " = " + c1.sumar(c2).toString());
		
		//resta de los dos numeros complejos
		System.out.println("(" + c1.toString()+ ")" + " - " + "(" + c2.toString() + ")" + " = " + c1.resta(c2).toString());
		
		//multiplicacion de los dos numeros complejos
		System.out.println("(" + c1.toString()+ ")" + " * " + "(" + c2.toString() + ")" + " = " + c1.multiplicar(c2).toString());
		
		//division de los dos numeros complejos
		System.out.println("(" + c1.toString()+ ")" + " / " + "(" + c2.toString() + ")" + " = " +  c1.dividir(c2).toString());
		
		//Valor absoluto
		System.out.println("|" + c1.toString() + "|" + " = " + c1.abs());
		
		//Fase
		System.out.println("La fase del primer complejo es " + c1.fase() + " radianes");
	}

}
