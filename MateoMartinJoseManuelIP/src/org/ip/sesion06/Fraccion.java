package org.ip.sesion06;


public class Fraccion implements Comparable <Object>{
	//Atributos de la clase Fraccion
		private int numerador;
		private int denominador;
		
		
		//Metodos de la clase
		public Fraccion(){
			this.numerador = 0;
			this.denominador = 1;
			
		}
		
		public Fraccion(int numerador, int denominador){
			this.numerador = numerador;
			this.denominador = denominador;
			
		}
		
		public boolean equals (Object obj){
			//Precondicion: las fracciones deben estar simplificadas
			
			if ( (this.getNumerador() == ((Fraccion)obj).getNumerador()) && 
				(this.getDenominador() == ((Fraccion)obj).getDenominador())
				)
				return true;
			else 
				return false;
				
		}
		
		public int getNumerador(){
			return this.numerador;
		}
		
		public int getDenominador(){
			return this.denominador;
		}
	

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			if (this.denominador == 1){
				return this.numerador + "";
			} else{
				return this.numerador + "/" + this.denominador;
			}
		}
		
		public Fraccion sumar(Fraccion b){
			Fraccion resultado = new Fraccion();
			resultado.numerador = this.getNumerador() * b.getDenominador() + b.getNumerador() * this.getDenominador();
			resultado.denominador = this.getDenominador() * b.getDenominador();
			 
			return resultado;
		}
		
		public static Fraccion sumar (Fraccion a, Fraccion b){
			Fraccion resultado = new Fraccion();
			resultado.numerador = a.getNumerador() * b.getDenominador() + b.getNumerador() * a.getDenominador();
			resultado.denominador = a.getDenominador() * b.getDenominador();
			
			return resultado;
		}
		
		public Fraccion recta(Fraccion b){
			Fraccion resultado = new Fraccion();
			resultado.numerador = this.getNumerador() * b.getDenominador() - b.getNumerador() * this.getDenominador();
			resultado.denominador = this.getDenominador() * b.getDenominador();
			
			return resultado;
		}
		
		public Fraccion multiplicar(Fraccion b){
			Fraccion resultado = new Fraccion();
			resultado.numerador = this.getNumerador() * b.getNumerador();
			resultado.denominador = this.getDenominador() * b.getDenominador();
			 
			return resultado;
		}
		
		public Fraccion dividir (Fraccion b){
			Fraccion resultado = new Fraccion();
			resultado.numerador = this.getNumerador() * b.getDenominador(); 
			resultado.denominador = this.getDenominador() * b.getNumerador();
			
			return resultado;
		}
		
		private static int mcd (int u,int v){
			if (u % v == 0){
				return v;
			}else{
				return mcd(u, u % v);
			}
		}
		
		//Hacer metodo máximo común divisor
		public Fraccion simplificar(){
			Fraccion resultado = new Fraccion();
			resultado.numerador = this.getNumerador();
			resultado.denominador = this.getDenominador();
			for (int i = 1; i < resultado.numerador || i < resultado.denominador; i++){
				if ((resultado.numerador % i == 0) && (resultado.denominador % i == 0)){
					resultado.numerador = resultado.numerador / i;
					resultado.denominador = resultado.denominador / i;
				}else{
					if (resultado.numerador == resultado.denominador){
						resultado.numerador = 1;
						resultado.denominador = 1;
						
					}
				}
			}
			
			return resultado;
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub

			Fraccion f = (Fraccion) o;
			double n = (double) numerador / denominador;
			double m = (double) f.numerador / f.denominador;
			if (n < m) {
				return -1;
			}
			else {
				if (n > m) {
					return 1;
				}
				else {
					return 0;
				}
			}
			
		}

	}



