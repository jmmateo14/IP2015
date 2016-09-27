package org.ip.sesion01;

public class EnfriamientoViento {
	public static void main (String[] args){
		double t, v, w;
		// t= temperatura, v= velocidad, w= enfriamiento.
		t = 40.00;
		v = 30.00;
		w = 35.74 + 0.6215 * t +(0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("Si la temperatura es de 40.00 fahrenheit y la velocidad es 30.00 millas/hora, el enfriamiento (w) será "  +w+  " fahrenheit");
		
		
		
	}
	

}
