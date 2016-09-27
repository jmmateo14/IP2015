package org.ip.sesion04;

import java.util.Scanner;

public class PrintCalendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		//El usuario introduce el a�o que desee
		System.out.print("Introduzca un a�o completo (ej: 2004): ");
		int a�o = teclado.nextInt();

		//El usuario introduce el mes que desee
		System.out.print("Introduzca un mes, como un n�mero entre 1 y 12: ");
		int mes = teclado.nextInt();

		//Muestra el calendario del mes y el a�o introducidos
		printMes(a�o, mes);
		teclado.close();
	}

	/** printMes puede parecerse a esto */
	public static void printMes(int a�o, int mes){
		printTituloMes(a�o, mes);
		printCuerpoMes(a�o, mes);
	}

	/** printTituloMes puede parecerse a esto */
	public static void printTituloMes(int a�o, int mes) {
		System.out.println("         " + getNombreMes(mes) + "  " + a�o);
		System.out.println("-------------------------------");
		System.out.println(" Lun Mar Mie Jue Vie Sab Dom");
	}

	/** printCuerpoMes puede parecerse a esto */
	public static void printCuerpoMes(int a�o, int mes) {
		int diaSem = getDiaInicio(a�o, mes);
		int numDia = getNumeroDeDiasDelMes(a�o, mes);
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
	public static int getDiaInicio(int a�o, int mes) {
		int y0, x, m0, d0;

		y0 = a�o - (14 - mes) / 12;
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
	public static int getNumeroDeDiasDelMes(int a�o, int mes) {
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
			if (esBisiesto(a�o)) {
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
	public static boolean esBisiesto(int a�o) {
		if (a�o % 4 == 0) {
			if (a�o % 100 == 0 && a�o % 400 != 0) {
				return false;
			} else {
				return true;
			}

		} else {
			return false;
		}
	}
}
