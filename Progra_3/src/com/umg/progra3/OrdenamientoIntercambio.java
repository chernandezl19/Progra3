package com.umg.progra3;

import java.util.Arrays;

public class OrdenamientoIntercambio {

	public static void main(String[] args) {
		int lista[] = { 8, 4, 6, 2 };
		
		System.out.println("Array: " + Arrays.toString(lista));
		
		for (int i = 0; i < lista.length; i++) {
			// sitúa mínimo de a[i+1]...a[n-1] en a[i]
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i] > lista[j]) {
					intercambiar(lista, i, j);
				}
			}
			System.out.println("Array: " + Arrays.toString(lista));
		}
		
		System.out.println("Array: " + Arrays.toString(lista));

	}

	static void intercambiar(int[] lista, int i, int j) {
		System.out.println("intercambiar "+lista[i]+" y "+lista[j]);
		int aux = lista[i];
		lista[i] = lista[j];
		lista[j] = aux;
	}

}
