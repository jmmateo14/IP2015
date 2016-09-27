package org.ip.sesion06;

public class Figura {
	
	protected double x;
	protected double y;

	
	public Figura (double x, double y){
		super();
		this.x = x;
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Figura [x =" + x + ", y = " + y + "]";
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}


	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}
	public double area (){
		return (y * x);
		
	}
	

}
