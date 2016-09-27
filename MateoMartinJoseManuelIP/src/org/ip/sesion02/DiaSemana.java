package org.ip.sesion02;
import java.util.Scanner;
public class DiaSemana {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int d;
		int m;
		int y;
		System.out.println("Un día: ");
		d=(int) sc.nextDouble();
		System.out.println("Un mes: ");
		m=(int) sc.nextDouble();
		System.out.println("Un año: ");
		y=(int) sc.nextDouble();
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		switch (d0) {
		case 0 :
			System.out.println("Domingo");
			break;
		case 1 :
			System.out.println("Lunes");
			break;
		case 2 :
			System.out.println("Martes");
			break;
		case 3 :
			System.out.println("Miercoles");
			break;
		case 4 :
			System.out.println("Jueves");
			break;
		case 5 :
			System.out.println("Viernes");
			break;
		case 6 :
			System.out.println("Sabado");
			break;
		}
		
	}

}
