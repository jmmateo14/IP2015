package org.ip.sesion07;

import java.util.Locale;
import java.util.Scanner;

public class ComprobarPalindromo2 {

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
		int inicio = 0;
		int fin = s.length()-1;
		
		boolean resultado = true;
		
		while(inicio < fin){
			while (s.charAt(inicio)== ' '){
				inicio++;
			}
			while (s.charAt(fin)== ' '){
				fin--;
			}
			
			
			if (s.charAt(inicio) == s.charAt(fin)){
				inicio++;
				fin--;
			}
			else {
				return false;
			}
		}
		return true;
		
	}
}