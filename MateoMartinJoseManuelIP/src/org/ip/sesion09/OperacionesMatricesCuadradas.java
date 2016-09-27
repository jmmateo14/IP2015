package org.ip.sesion09;

public class OperacionesMatricesCuadradas {

	public static boolean esSimetrica(int [][] matriz){
		 boolean simetria = true;  
		 int fila = 0; int columna;
		 while(simetria &&  (fila < matriz.length -1)){
		  columna = fila +1;
		  while(simetria && (columna < matriz[fila].length)){
		      if(matriz[fila][columna] != matriz[columna][fila] ) 
		   simetria = false;
		      columna++;
		  }
		  fila++;
		 } 
		 return simetria;
			 
		}
		 
	public static int traza(int[][] a){
        int tr = 0;
		for(int i = 0; i < a.length; i++){
			tr += a[i][i];
        }
        return tr;
    }
		 
	public static int[][] suma(int[][] a, int[][] b){
        int[][] resultado = new int[a.length][b.length];
        for(int i=0; i < a.length; i++){
            for(int j=0; j < a.length; j++){
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }
	
	
	public static int [][] producto(int [][] a, int [][] b) { // OJO!  Matrices cuadrada     
		if (a.length != b.length) throw new RuntimeException("Las dimensiones no coinciden, no se puede realizar la operación");
		     int [][] c = new int [a.length][b.length];
		     for (int i = 0; i < a.length; i++) {
		           for (int j = 0; j < b.length; j++) {
		                      c[i][j] = 0; 
		                      for (int k = 0; k < b.length; k++) {  //Desarrolla la sumatoria
		                                 c[i][j] += a[i][k] * b[k][j];
		                      }
		          }
		      } 
		      return c;
		} 
	
	
	public static int[][] producto(int [][] a, int f){
	    int [][] matrizResultado =new int[a.length][a[0].length];
	    for(int i = 0;i != a.length;i++)
	        for(int j = 0;j != a[i].length;j++)
	            matrizResultado[i][j] = (int) (a[i][j] * f); // se multiplica cada valor de la matriz por el valor escalar.
	    return matrizResultado;
	}
	
}


