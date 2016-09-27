package org.ip.sesion07;

import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class DivisoresEnterosGrandes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger enteroGrande = new BigInteger (Long.MAX_VALUE + "");
		Scanner entrada = new Scanner (System.in);
		entrada.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduzca el primer divisor: ");
		String div1 = entrada.next();
		System.out.println("Introduzca el segundo divisor: ");
		String div2 = entrada.next();
		
		int limite = 5; //mostrar 5 numeros
		
		for (int i = 0; i < limite; i++){
			if ((esDivisible(enteroGrande, div1)) && 
			(esDivisible(enteroGrande, div2))){
				System.out.println(enteroGrande);
			}else{
				i--;
				
			}
			enteroGrande = enteroGrande.add(BigInteger.ONE);//enteroGrande++
		}
	}
	
	public static boolean esDivisible (BigInteger bi, String d){
		if (bi.remainder(new BigInteger(d)).equals(BigInteger.ZERO))
			return true;
			else 
				return false;
	}

}
