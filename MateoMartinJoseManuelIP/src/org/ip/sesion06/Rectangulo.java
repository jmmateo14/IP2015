package org.ip.sesion06;

public class Rectangulo {
	protected double ancho;
	protected double alto;
	public Rectangulo (double x, double y, double ancho, double alto){
		
	}
	
	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}
	/**
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangulo [ancho = " + ancho + ", alto = " + alto + "]";
	}
	public double area (){
		return (ancho * alto);
	}
	
	
}
