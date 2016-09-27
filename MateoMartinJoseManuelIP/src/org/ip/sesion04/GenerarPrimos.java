package org.ip.sesion04;

public class GenerarPrimos {
	
		public static boolean esPrimo (int numero) {
			boolean primo = true;
			for (int divisor = 2; divisor < numero; ++divisor){
				if (numero % divisor == 0)
					primo = false;
			}
			return primo;
		}

		public static void main (String[] args){
			int num = 2;
			int i = 1;
			int j = 1;
			while (i <= 50){
				while (i <= 10*j){
					boolean k =esPrimo(num);
					if (k == true){
						System.out.println(num + "\t");
						++i;
					}
					++num;
				}
				++j;
				System.out.println();
			}
				
		}
}
			

