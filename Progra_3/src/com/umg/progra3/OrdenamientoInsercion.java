package com.umg.progra3;

import java.util.Arrays;

public class OrdenamientoInsercion {
	
	public static void main(String[] args) {
		int lista[] = { 30,15,2,21,44,8 };
		System.out.println("Array: " + Arrays.toString(lista));
		insercionDirecta(lista);
		System.out.println("Array: " + Arrays.toString(lista));
		
	}
		
	
	public static void insercionDirecta(int A[]){                                            
	    int p, j;
	    int aux;
	    for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
	              aux = A[p];           // el final, guardamos el elemento y
	              j = p - 1;            // empezamos a comprobar con el anterior
	              while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el                                
	                                                // valor de aux sea menor que los
	                             A[j + 1] = A[j];   // de la izquierda, se desplaza a
	                             j--;               // la derecha
	              }
	              System.out.println("intercambiamos "+A[j + 1] + " y "+ aux);
	              A[j + 1] = aux;       // colocamos aux en su sitio
	              System.out.println("Array: " + Arrays.toString(A));
	    }
	}

}
