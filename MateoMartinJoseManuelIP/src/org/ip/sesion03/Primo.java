package org.ip.sesion03;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int dato = 9;
	int divisor = 2;
	boolean primo = true;
	int suma = 1;
	if(dato % divisor != 0){
		divisor = 3;
		suma = 2;
		
	}
	while (primo && divisor <= Math.sqrt(dato)){
		if (dato % divisor == 0){
			primo = false;
		}
		divisor = divisor + suma;
	}
	if (primo)
		System.out.println("El numero es primo");
	else 
		System.out.println("El numero no es primo");
	}
}