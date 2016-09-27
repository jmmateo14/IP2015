package org.ip.sesion04;

import java.util.Scanner;

public class PrintCalendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		//El usuario introduce el año que desee
		System.out.print("Introduzca un año completo (ej: 2004): ");
		int año = teclado.nextInt();

		//El usuario introduce el mes que desee
		System.out.print("Introduzca un mes, como un número entre 1 y 12: ");
		int mes = teclado.nextInt();

		//Muestra el calendario del mes y el año introducidos
		printMes(año, mes);
		teclado.close();
	}

	/** printMes puede parecerse a esto */
	public static void printMes(int año, int mes){
		printTituloMes(año, mes);
		printCuerpoMes(año, mes);
	}

	/** printTituloMes puede parecerse a esto */
	public static void printTituloMes(int año, int mes) {
		System.out.println("         " + getNombreMes(mes) + "  " + año);
		System.out.println("-------------------------------");
		System.out.println(" Lun Mar Mie Jue Vie Sab Dom");
	}

	/** printCuerpoMes puede parecerse a esto */
	public static void printCuerpoMes(int año, int mes) {
		int diaSem = getDiaInicio(año, mes);
		int numDia = getNumeroDeDiasDelMes(año, mes);
		for (int i = 1; i <= diaSem - 1; i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <= numDia; i++) {
			System.out.printf("%4d", i);
			diaSem++;
			if (diaSem > 7) {
				System.out.println();
				diaSem = 1;
			}
		}
	}

	/** getNombreMes puede parecerse a esto */
	public static String getNombreMes(int mes) {
		switch (mes) {
		case 1:
			return "Enero";
		case 2:
			return "Febrero";
		case 3:
			return "Marzo";
		case 4:
			return "Abril";
		case 5:
			return "Mayo";
		case 6:
			return "Junio";
		case 7:
			return "Julio";
		case 8:
			return "Agosto";
		case 9:
			return "Septiembre";
		case 10:
			return "Octubre";
		case 11:
			return "Noviembre";
		case 12:
			return "Diciembre";

		}
		return "";
	}

	/** getDiaInicio puede parecersea esto */
	public static int getDiaInicio(int año, int mes) {
		int y0, x, m0, d0;

		y0 = año - (14 - mes) / 12;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = mes + 12 * ((14 - mes) / 12) - 2;
		d0 = (1 + x + (31 * m0) / 12) % 7;
		if (d0 == 0) {
			return 7;
		} else {
			return d0;
		}
	}

	/** getNumeroTotalDeDiaDelMes puede parecerse a esto */
	public static int getNumeroDeDiasDelMes(int año, int mes) {
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			if (esBisiesto(año)) {
				return 29;
			} else {
				return 28;
			}
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		}
		return 0;
	}

	/** esBisiesto puede parecerse a es */
	public static boolean esBisiesto(int año) {
		if (año % 4 == 0) {
			if (año % 100 == 0 && año % 400 != 0) {
				return false;
			} else {
				return true;
			}

		} else {
			return false;
		}
	}
}
