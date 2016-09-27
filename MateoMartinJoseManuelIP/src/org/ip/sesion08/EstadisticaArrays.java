package org.ip.sesion08;

public class EstadisticaArrays {

	public static double max(double[] a) {
		int max = (int) a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = (int) a[i];
		}
		return max;
	}

	public static double max(double[] a, int inferior, int superior) {
		if (inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException();
		int max = (int) a[inferior];
		for (int i = inferior; i <= superior; i++) {
			if (a[i] > max)
				max = (int) a[i];
		}
		return max;
	}

	public static int max(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static int max(int[] a, int inferior, int superior) {
		if (inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException();
		int max = (int) a[(int) inferior];
		for (int i = (int) inferior; i <= superior; i++) {
			if (a[i] > max)
				max = (int) a[i];
		}
		return max;
	}

	public static double min(double[] a) {
		int min = (int) a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min)
				min = (int) a[i];
		}
		return min;
	}

	public static double min(double[] a, int inferior, int superior) {
		if (inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException();
		int min = (int) a[(int) inferior];
		for (int i = (int) inferior; i <= superior; i++) {
			if (a[i] < min)
				min = (int) a[i];
		}
		return min;
	}

	public static int min(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}

	public static int min(int[] a, int inferior, int superior) {
		if (inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException();
		int min = (int) a[inferior];
		for (int i = inferior; i <= superior; i++) {
			if (a[i] < min)
				min = (int) a[i];
		}
		return min;
	}

	public static double media(double[] a) {
		double suma = 0.0;
		for (int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		return suma / a.length;
	}

	public static double media(double[] a, int inferior, int superior) {
		double suma = 0.0;
		int componentes = superior - inferior + 1;
		if (inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException("Indices del subarray fuera de rango");
		for (int i = inferior; i <= superior; i++) {
			suma += a[i];
		}
		return suma / componentes;
	}

	public static int media(int[] a) {
		double suma = 0.0;
		for (int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		return (int) (suma / a.length);
	}

	public static double media(int[] a, int inferior, int superior) {
		double suma = 0.0;
		int componentes = superior - inferior + 1;
		if (inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException("Indices del subarray fuera de rango");
		for (int i = inferior; i <= superior; i++) {
			suma += a[i];
		}
		return (suma / componentes);
	}

	public static double var(double[] a) {
		double suma = 0.0;
		double med = media(a);
		for (int i = 0; i < a.length; i++) {
			suma += Math.pow((a[i] - med), 2);
		}
		return suma / (a.length - 1);
	}

	public static double var(double[] a, int inferior, int superior) {
		double suma = 0.0;
		double med = media(a, inferior, superior);
		int componentes = superior - inferior + 1;
		if (inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException("Indices del subarray fuera de rango");
		for (int i = inferior; i <= superior; i++) {
			suma += Math.pow((a[i] - med), 2);
		}
		return suma / (componentes - 1);
	}

	public static double var(int[] a) {
		double suma = 0.0;
		double med = media(a);
		for (int i = 0; i < a.length; i++) {
			suma += Math.pow((a[i] - med), 2);
		}
		return suma / (a.length - 1);
	}

	public static double var(int[] a, int inferior, int superior) {
		double suma = 0.0;
		int componentes = superior - inferior + 1;
		double med = media(a, inferior, superior);
		if (inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException("Indices del subarray fuera de rango");
		for (int i = inferior; i <= superior; i++) {
			suma += Math.pow((a[i] - med), 2);
		}
		return suma / (componentes - 1);
	}

	public static double stdDev(double[] a) {
		return Math.sqrt(var(a));
	}

	public static double stdDev(double[] a, int inferior, int superior) {

		if (inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException("Indices del subarray fuera de rango");
		return Math.sqrt(var(a, inferior, superior));
	}

	public static double stdDev(int[] a) {
		return Math.sqrt(var(a));
	}

	public static double stdDev(int[] a, int inferior, int superior) {

		if (inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException("Indices del subarray fuera de rango");
		return Math.sqrt(var(a, inferior, superior));

	}
}
