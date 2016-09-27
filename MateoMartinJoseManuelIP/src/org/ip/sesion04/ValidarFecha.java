package org.ip.sesion04;

import java.util.Scanner;

public class ValidarFecha {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int dia, mes, a�o;
		boolean correcta;
		do {
			System.out.println("Introduce el dia");
			dia = entrada.nextInt();
			System.out.println("Introduce el mes");
			mes = entrada.nextInt();
			System.out.println("Introduce el a�o");
			a�o = entrada.nextInt();
			correcta = esFechaCorrecta(dia, mes, a�o);
			if (correcta == false) {
				System.out.println("Fecha incorrecta, introduzca fecha nueva");
			}
		} 
		while (correcta == false);
		entrada.close();
		System.out.println("Fecha correcta");
	}

	private static boolean esFechaCorrecta(int dia, int mes, int a�o) {
		if (dia < 1) {
			return false;
		}

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia > 31) {
				return false;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia > 30) {
				return false;
			}
			break;
		case 2:
			if (a�o % 4 == 0) {
				if (a�o % 100 == 0 && a�o % 400 != 0) {
					if (dia > 28) {
						return false;
					}
				} else {
					if (dia > 29) {
						return false;
					}
				}
			} else {
				if (dia > 28) {
					return false;
				}
			}
			break;
			default:
				return false;
		}
		return true;
	}

}