package org.ip.sesion05;

public class TestFraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear las fracciones 1/5, 4/5 y -11/22.
		Fraccion f1 = new Fraccion (1 ,5);
		Fraccion f2 = new Fraccion (4 ,5);
		Fraccion f3 = new Fraccion (-11 ,22);
		
		//Mostrar las fracciones
		System.out.println("LAS FRACCIONES CREADAS SON:");
		System.out.println();
		System.out.println("Primera fraccion ==> " + f1.toString());
		System.out.println("Segunda fraccion ==> " + f2.toString());
		System.out.println("Tercera fraccion ==> " + f3.toString());
		
		//Mostrar el numero de fracciones creadas
		System.out.println("El numero de fracciones creadas es " + Fraccion.getNumFracciones());
		
		//Comprobar si la primera fraccion es igual a la segunda
		if (f1.equals(f2))
			System.out.println("Las dos fracciones SON IGUALES");
		else
			System.out.println("Las dos fracciones NO SON IGUALES");
		
		//Mostrar el numerador de la tercera fraccion
		System.out.println("El numerador de la tercera fraccion es: " + f3.getNumerador());
		//Mostrar el denominador de la primera fraccion
		System.out.println("El denominador de la primera fraccion es: " + f1.getDenominador());

		
		//Mostrar suma de la 1 y la 2. Metodo de clase
		String salida;
		salida = "La suma, utilizando el metodo de clase" + f1.toString() + " + " + f2.toString() + " es ";
		System.out.println(salida + Fraccion.sumar(f1, f2));
		
		//Mostrar suma de la 1 y la 2. Metodo de objeto
		salida = "La suma, utilizando el metodo de objeto" + f1.toString() + " + " + f2.toString() + " es ";
		System.out.print(salida + f1.sumar(f2));
		System.out.println("Simplificada" + f1.sumar(f2).simplificar());
		
		//Mostrar la resta de la primera y segunda fraccion 
		System.out.print("La resta de" + f1 + " - " + f2 + " es " + f1.recta(f2) );
		System.out.println("Simplificada " + f1.recta(f2).simplificar());
		
		//Mostrar el producto de la rimera y segunda fraccion 
		System.out.println("El producto " + f1 + " X " + f2 + " es " + f1.multiplicar(f2));
		
		//Mostrar la division de la primera y tercera fraccion
		System.out.println("La division de " + f1 + " / " + f3 + " es " + f1.dividir(f3));
		
		//Mostrar la inversa de la primera fraccion 
		System.out.println("La inversa de la primera fraccion es " + f1.inversa());
		
		//Mostrar la tercera fraccion simplificada
		System.out.println("La fraccion " + f3 + " simplificada es " + f3.simplificar());
		
		//Mostra el numero de fracciones creadas
		System.out.println("El número de fracciones creadas es " + Fraccion.getNumFracciones());
		
	}

}
