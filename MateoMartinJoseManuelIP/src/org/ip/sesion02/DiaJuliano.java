package org.ip.sesion02;

public class DiaJuliano {
	public static void main(String[] args) {
		// D: Dia; M: Mes; Y: año.
		double DJ;
		int M;
		int D;
		int Y;
		D = 1;
		M = 1;
		Y = 1970;

		DJ = D - 32075 + 1461 * (Y + 4800 + (M - 14) / 12) / 4 + 367
				* (M - 2 - (M - 14) / 12 * 12) / 12 - 3
				* ((Y + 4900 + (M - 14) / 12) / 100) / 4;
		System.out.println("El día Juliano correspondiente al " + D + "/" + M
				+ "/" + Y + " es " + DJ);
	}

}
