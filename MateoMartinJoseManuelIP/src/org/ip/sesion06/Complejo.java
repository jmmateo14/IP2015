package org.ip.sesion06;

public class Complejo {
	private double real;
	private double imaginaria;
	
	public Complejo(double real, double imaginario){
		this.real = real;
		this.imaginaria = imaginario;
	
	}
	public Complejo (double real){
		this.real = real;
		this.imaginaria = 0;
	}
	/**
	 * @return the real
	 */
	public double getReal() {
		return real;
	}

	/**
	 * @return the imaginaria
	 */
	public double getImaginaria() {
		return imaginaria;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.imaginaria == 0)
			return this.real + "";
		if (this.real == 0)
			return this.imaginaria + "i";
		if (this.imaginaria < 0)
			return this.real + " - " + (-this.imaginaria) + "i";
		else
			return this.real + " + " + this.imaginaria + "i";	
	}
	
	
	public Complejo sumar (Complejo c){
		double parteReal = this.real + c.getReal();
		double parteImaginaria = this.imaginaria + c.getImaginaria();
		return new Complejo (parteReal, parteImaginaria);
	}
	
	public Complejo resta (Complejo c){
		double parteReal = this.real - c.getReal();
		double parteImaginaria = this.imaginaria - c.getImaginaria();
		return new Complejo (parteReal, parteImaginaria);
	}
	
	public Complejo multiplicar (Complejo c){
		double parteReal = (this.real * c.getReal() - this.imaginaria * c.getImaginaria());
		double parteImaginaria = (this.imaginaria * c.getReal() + this.real * c.getImaginaria());
		return new Complejo (parteReal, parteImaginaria);
	}
	
	public Complejo dividir (Complejo c){
		double parteReal = (this.real * c.getReal() + this.imaginaria * c.getImaginaria()) / (Math.pow(c.getReal(), 2) + Math.pow(c.getImaginaria(), 2));
		double parteImaginaria = (this.imaginaria * c.getReal() - this.real * c.getImaginaria()) / (Math.pow(c.getReal(), 2) + Math.pow(c.getImaginaria(), 2));
		return new Complejo (parteReal, parteImaginaria);
	}
	
	public Complejo abs (){
		return new Complejo (Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginaria, 2)));
	}
	
	public Complejo fase(){
		return new Complejo (Math.atan2(this.imaginaria, this.real));
	}
}
