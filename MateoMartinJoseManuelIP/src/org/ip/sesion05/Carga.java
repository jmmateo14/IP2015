package org.ip.sesion05;

public class Carga {
	private double rx;
	private double ry;
	private double q;
	private static final double k = 8.99e09;
	
	public Carga (double rx, double ry, double q){
		this.rx = rx;
		this.ry = ry;
		this.q = q;
	}

	/**
	 * @return the rx
	 */
	public double getRx() {
		return rx;
	}

	/**
	 * @param rx the rx to set
	 */
	public void setRx(double rx) {
		this.rx = rx;
	}

	/**
	 * @return the ry
	 */
	public double getRy() {
		return ry;
	}

	/**
	 * @param ry the ry to set
	 */
	public void setRy(double ry) {
		this.ry = ry;
	}

	/**
	 * @return the q
	 */
	public double getQ() {
		return q;
	}

	/**
	 * @param q the q to set
	 */
	public void setQ(double q) {
		this.q = q;
	}
	
	public double potenciaEn (double x, double y){
		double r = distancia (x, y);
		return k * (q / r);
	}
	
	private double distancia (double x, double y){
		return Math.sqrt(Math.pow(x-rx, 2) + Math.pow(y-ry, 2));	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return q + " C en (" + rx + ", " + ry + ") m.";
	}
	
	

}
