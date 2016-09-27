package org.ip.sesion01;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int i = 8;
		int a, b, c;
		System.out.println("\tantes\tdurante\tdespu�s");
		i = 8;
		a = i;
		b = i++;
		c = i;
		System.out.println("i++\t" + a + '\t' + b + '\t' + c);
		i = 8;
		a = i;
		b = i--;
		c = i;
		System.out.println("i--\t" + a + '\t' + b + '\t' + c);
		i = 8;
		a = i;
		b = ++i;
		c = i;
		System.out.println("++i\t" + a + '\t' + b + '\t' + c);
		i = 8;
		a = i;
		b = --i;
		c = i;
		System.out.println("--i\t" + a + '\t' + b + '\t' + c);
	}
}
//El programa OperadoresUnarios conseguimos que con el i++ la variable se mantenga antes, durante, pero que se implemente despu�s una vez; 
//con el i-- pasa lo mismo que con i++ con la peque�a diferencia de que despu�s decrementa en vez de aumentar.
//Con ++i la variable aumenta una vez durante y despu�s del proceso,  con --i decrementa una vez durante y despu�s del proceso
