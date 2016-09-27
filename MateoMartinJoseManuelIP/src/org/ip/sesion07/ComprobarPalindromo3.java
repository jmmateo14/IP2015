package org.ip.sesion07;

import java.util.Locale;
import java.util.Scanner;

public class ComprobarPalindromo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		entrada.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduzca una cadena: ");
		String s = entrada.nextLine();
		String s2 = s.toLowerCase(); //cadena de entrada en minusculas 
		
		if (esPalindromo(s2)== true)
			System.out.println(s + " es palindromo.");
		else
			System.out.println(s + " no es palindromo.");
	}

	public static boolean esPalindromo (String s){
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		
		System.out.println("s = " + s);
		System.out.println("sb = " + sb);
		String s2 = sb.substring(0, s.length()-1); //String desde posicion 0 hasta el ultimo.
		
		if (s.equals(s2)){
			return true;
		}else{
			return false;
		}
			
	}
}