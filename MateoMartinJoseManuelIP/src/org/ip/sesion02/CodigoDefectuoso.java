package org.ip.sesion02;

public class CodigoDefectuoso {
	public static void main(String[] args) {
		int codigo;
		codigo = 50000;
		if ((codigo >= 14681) && (codigo <= 15681) || (codigo >= 70001)
				&& (codigo <= 79999) || (codigo >= 99999) && (codigo <= 110110)) {
			System.out.println("CODIGO DEFECTUOSO");
		} else {
			System.out.println("CODIGO CORRECTO");
		}
	}

}
