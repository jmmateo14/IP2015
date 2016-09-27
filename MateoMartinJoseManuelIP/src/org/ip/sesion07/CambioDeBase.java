package org.ip.sesion07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CambioDeBase {
private static Scanner input;
public static int leerOpcion(){
	
	boolean entradaCorrecta = false;
	int opcion = 0;
	input = new Scanner (System.in);
	while (!entradaCorrecta){
		try{
			opcion = input.nextInt();
			if(opcion >6 || opcion < 0)
				throw new ExcepcionIntervalo ("Opcion fuera de rango");
			entradaCorrecta = true;
		}catch (InputMismatchException ex){
			System.out.println("Incorrecto, introduzca un valor...");
			input.nextLine();
		}catch (ExcepcionIntervalo ex){
			System.out.println(ex.getMessage());
			System.out.println("Introduzca un valor entre 0 y 6...");
			input.nextLine();
		}
	}
	return opcion;
}
public static void menu (){
	System.out.println("1.- Combertir de Decimal a Hexadecimal");
	System.out.println("2.- Combertir de Decimal a Octal");
	System.out.println("3.- Combertir de Decimal a Binario");
	System.out.println("4.- Combertir de Hexadecimal a Decimal");
	System.out.println("5.- Cobertir de Octal a Decimal");
	System.out.println("6.- Combertir de Binario a Decimal");
	System.out.println("0.- TERMINAR");
}


public static void main (String [] arg) throws ExcepcionIntervalo{
	System.out.println("PROGRAMA QUE PERMITE CONVERTIR UN NUMERO DECIMAL A HEXADECIMAL, OCTAL O BINARIO Y VICEVERSA");
	int opcion = 0, valor;
	boolean entradaCorrecta = false;
	String cadena;
	input = new Scanner (System.in);
	menu();
	opcion = leerOpcion();
	
	while (opcion != 0){
		entradaCorrecta = false;
		switch (opcion){
		case 0:
			System.out.println("HA FINALIZADO EL PROGRMA");
			break;
		
		case 1:
			while (!entradaCorrecta){
				try{
					System.out.println("Introducir el numero decimal");
					valor = input.nextInt();
					cadena = Integer.toHexString(valor);
					System.out.println("El numero" + valor + "en hexadecimal" + cadena);
					entradaCorrecta = true;
				}catch (InputMismatchException e){
					System.out.println("No es un numero decimal");
					input.nextInt();
				}
			}
			break;
			
		case 2:
			while (!entradaCorrecta){
				try{
					System.out.println("Introducir el numero decimal");
					valor = input.nextInt();
					cadena = Integer.toOctalString(valor);
					System.out.println("El numero" + valor + " en octal es " + cadena);
					entradaCorrecta = true;
				}catch (InputMismatchException e){
					System.out.println("No es un numero decimal");
					input.nextInt();
				}
			}
			break;
			
		case 3:
			while (!entradaCorrecta){
				try{
					System.out.println("Introducir el numero decimal");
					valor = input.nextInt();
					cadena = Integer.toBinaryString(valor);
					System.out.println("El numero" + valor + " en binario es " + cadena);
					entradaCorrecta = true;
				}catch (InputMismatchException e){
					System.out.println("No es un numero decimal");
					input.nextInt();
				}
			}
			break;
		case 4:
			while (!entradaCorrecta){
				try{
					System.out.println("Introducir el numero hexadecimal");
					cadena = input.next();
					valor = Integer.parseInt(cadena, 16);
					
					System.out.println("El numero" + cadena + " en decimal es " + valor);
					entradaCorrecta = true;
				}catch (NumberFormatException e){
					System.out.println("No es un numero hexadecimal");
					input.nextLine();
					//TODO: hazle excepcion
		}
	}
	break;
	
		case 5:
			while (!entradaCorrecta){
				try{
					System.out.println("Introducir el numero Octal");
					cadena = input.next();
					valor = Integer.parseInt(cadena, 8);
					
					System.out.println("El numero" + cadena + " en decimal es " + valor);
					entradaCorrecta = true;
				}catch (NumberFormatException e){
					System.out.println("No es un numero Octal");
					input.nextLine();
		}
	}
	break;
	
		case 6:
			while (!entradaCorrecta){
				try{
					System.out.println("Introducir el numero Binario");
					cadena = input.next();
					valor = Integer.parseInt(cadena, 2);
					
					System.out.println("El numero" + cadena + " en decimal es " + valor);
					entradaCorrecta = true;
				}catch (NumberFormatException e){
					System.out.println("No es un numero binario");
					input.nextLine();
		}
	}
	break;
}
		
}
}
}
