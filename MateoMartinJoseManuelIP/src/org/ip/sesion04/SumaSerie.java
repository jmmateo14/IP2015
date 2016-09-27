package org.ip.sesion04;

public class SumaSerie {
	public static void main (String[] args){
		//TODO Auto-generated method stub
		
		System.out.println("i\t   SUMA");
		for (int i = 1; i <= 10; i++){
			float s = calcularSuma(i);
			System.out.println(i + "\t" + s); 
		}
	}
	private static float calcularSuma(int n){
		if (n == 0){
			return 0;
		}else{
			return (float)n / (n+1) + calcularSuma(n - 1);
		}
	}

}
