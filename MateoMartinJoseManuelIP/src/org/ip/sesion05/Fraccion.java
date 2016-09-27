package org.ip.sesion05;

public class Fraccion {
	
	//Atributos de la clase Fraccion
	private int numerador;
	private int denominador;
	static private int numFracciones;
	
	//Metodos de la clase
	public Fraccion(){
		this.numerador = 0;
		this.denominador = 1;
		numFracciones++; //numFracciones + 1
	}
	
	public Fraccion(int numerador, int denominador){
		this.numerador = numerador;
		this.denominador = denominador;
		numFracciones++;
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
	
	static public int getNumFracciones(){
		return numFracciones;
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
		if (resultado.denominador == 1)
			numFracciones--; 
		return resultado;
	}
	
	public static Fraccion sumar (Fraccion a, Fraccion b){
		Fraccion resultado = new Fraccion();
		resultado.numerador = a.getNumerador() * b.getDenominador() + b.getNumerador() * a.getDenominador();
		resultado.denominador = a.getDenominador() * b.getDenominador();
		if (resultado.denominador == 1)
			numFracciones--; 
		return resultado;
	}
	
	public Fraccion recta(Fraccion b){
		Fraccion resultado = new Fraccion();
		resultado.numerador = this.getNumerador() * b.getDenominador() - b.getNumerador() * this.getDenominador();
		resultado.denominador = this.getDenominador() * b.getDenominador();
		if (resultado.denominador == 1)
			numFracciones--; 
		return resultado;
	}
	
	public Fraccion multiplicar(Fraccion b){
		Fraccion resultado = new Fraccion();
		resultado.numerador = this.getNumerador() * b.getNumerador();
		resultado.denominador = this.getDenominador() * b.getDenominador();
		if (resultado.denominador == 1)
			numFracciones--; 
		return resultado;
	}
	
	public Fraccion dividir (Fraccion b){
		Fraccion resultado = new Fraccion();
		resultado.numerador = this.getNumerador() * b.getDenominador(); 
		resultado.denominador = this.getDenominador() * b.getNumerador();
		if (resultado.denominador == 1)
			numFracciones--; 
		return resultado;
	}
	
	public Fraccion inversa(){
		Fraccion resultado = new Fraccion();
		resultado.numerador = this.getDenominador();
		resultado.denominador = this.getNumerador();
		if (resultado.denominador == 1)
			numFracciones--; 
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
					numFracciones--;
				}
			}
		}
		if (resultado.denominador == 1)
			numFracciones--;
		return resultado;
	
		
	}
}
