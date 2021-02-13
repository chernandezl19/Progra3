package com.umg.progra3;

import java.util.Arrays;

public class OrdenamientoSeleccion {

	public static void main(String[] args) {
		int lista[] = { 51, 21, 39, 80, 36 };

		System.out.println("Array: " + Arrays.toString(lista));
		ordenamientoSeleccion(lista);
		System.out.println("Array: " + Arrays.toString(lista));
		
	}

	public static void ordenamientoSeleccion(int a[]) {
		int indiceMenor;
		
		for (int i = 0;i<a.length; i++) {
			//comientza con la exploracion del indice i
			indiceMenor = i;
			//j explora la sublista [i+1]..[n-1] y busca el menor de todos
			for (int j = i+1; j<a.length; j++) {
				if (a[j] < a[indiceMenor]) {
					indiceMenor = j;
				}		
					
			}
			if (i != indiceMenor) {
				intercambiar(a, i, indiceMenor);
			}
		}
	}
	
	static void intercambiar(int[] lista, int i, int j) {
		System.out.println("intercambiar "+lista[i]+" y "+lista[j]);
		int aux = lista[i];
		lista[i] = lista[j];
		lista[j] = aux;
	}
}
