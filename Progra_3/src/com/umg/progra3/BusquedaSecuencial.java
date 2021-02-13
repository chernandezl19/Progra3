package com.umg.progra3;

import java.util.Scanner;

public class BusquedaSecuencial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese valor a buscar");
		int buscar = entrada.nextInt();
		int[] lista = new int[100];	// Lista de números enteros que supondremos llena.
		boolean encontrado = false;	// Declaramos e inicializamos una bandera.
		int i = 0;			// Declaramos e inicializamos un índice.
		
		for (int j =0; j<100; j++) {
			lista[j] = j;
		}
		
		while ( (i < 100) && !encontrado )
			if (lista[i++] == buscar)		// Incrementamos el índice después de la comparación
				encontrado = true;
		
		// Al finalizar el programa, la bandera nos indica si hemos encontrado el valor
		if (encontrado)
			System.out.println("Sí hay algún valor "+buscar+" en la lista.");
		else
			System.out.println("No hay ningún valor "+buscar+" en la lista.");
	}
	
	
}
