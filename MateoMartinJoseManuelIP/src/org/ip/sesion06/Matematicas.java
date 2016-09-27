package org.ip.sesion06;

public class Matematicas {
	
	public static long factorialIterativo (int n){
		long fact = 1;
		for (int i = 1; i <= n; i++){
			fact = fact * i;
		}
		return fact;
	}
	
	public static long factorialRecursivo (int n){
		
			if (n == 0){
		        return 1;
			}else{
		        return n*(factorialRecursivo(n - 1));
			}
	}
	
	public static void generarConjeturaUlam (int n){	

		while (n > 1){
			if (n % 2 == 0) {
			n = n / 2; 
			System.out.println("    " + n + "    ");
		} else {
			n = (n * 3) + 1;
		}
			System.out.println("    " + n + "    ");
	}

	}
	
	public static boolean esPrimo (int n){
		
		boolean primo = true;
		int divisor = 2;
		if(n == 2 || n == 3){
			primo = true;
			
		}else if (n % divisor == 0){
			primo = false;
		
		}else{
			for (divisor = 2; divisor <= Math.sqrt(2 * n); divisor++){
				if (n % divisor == 0)
					primo = false;
			}
	}	
		return primo;
	}
		
	
	public static boolean esPerfecto (int n){
		boolean perfecto = true;
		int cociente1;
		int cociente2 = 0;
		for (int divisor = 2; divisor <= n; divisor++){
			cociente1 = n / divisor;
			cociente2 = cociente2 + cociente1;
		}{	
		}
	
	if (cociente2 == n){
		perfecto = true;
	}else{
		perfecto = false;
	}
	return perfecto;
}
	
	public static double absoluto (double n){
		if (n >= 0){
			return n;
		}else{
			return -n;
		}
		
	}
	
	public static int absoluto (int n){
		if (n >= 0){
			return n;
		}else{
			return -n;
		}
		
	}
	
	public static int min (int n1, int n2){
		int menor = Math.min(n1, n2);
		return menor;
	}
	
	public static double min (double n1, double n2){
		double menor = Math.min(n1, n2);
		return menor;
	}
	
	public static double min (double n1, double n2, double n3){
		double menor = Math.min(n1, n2);
		double menor1 = Math.min(menor, n3);
		return menor1;
	}
	
	public static int max (int n1, int n2){
		int mmayor = Math.max(n1, n2);
		return mmayor;
	}
	
	public static double max (double n1, double n2){
		double mayor = Math.max(n1, n2);
		return mayor;
	}
	
	public static double max (double n1, double n2, double n3){
		double mayor = Math.max(n1, n2);
		double mayor1 = Math.max(mayor, n3);
		return mayor1;
	}
	
	public static int mcdRecursivo (int m, int n){
		if (m % n == 0){
			return n;
		}else{
			int r = m % n;
			m = n;
			n = r;
			
			return mcdRecursivo(m, n);
			
		}
	}
	
	public static int mcdEuclides(int m, int n){
		while(m % n != 0){
			int r = m % n;
			m = n;
			n = r;
		}
		return n;
	}
}

	
	
	

