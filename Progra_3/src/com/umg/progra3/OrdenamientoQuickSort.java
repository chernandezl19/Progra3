package com.umg.progra3;

import java.util.Arrays;

public class OrdenamientoQuickSort {

	public static void main(String[] args) {

		double lista[] = { 79,21,15,99,88,65,75,85,76,46,84,24 };
		System.out.println("Array: " + Arrays.toString(lista));
		quickSort(lista);
		System.out.println("Array: " + Arrays.toString(lista));

	}

	public static void quickSort(double a[]) {
		quickSort(a, 0, a.length - 1);
	}

	private static void quickSort(double a[], int primero, int ultimo) {
		System.out.println("************ordenando desde: " + primero +" hasta "+ ultimo);
		int i, j, central;
		double pivote;
		central = (primero + ultimo) / 2;
		pivote = a[central];

		i = primero;
		j = ultimo;
		do {
			while (a[i] < pivote)
				i++;
			while (a[j] > pivote)
				j--;
			if (1 <= j) {
				System.out.println("se intercambian los extremos");
				intercambiar(a, i, j);
				i++;
				j--;
			}
		} while (i <= j);
		if (primero < j)
			quickSort(a, primero, j); // mismo proceso con sublista izqda
		if (i < ultimo)
			quickSort(a, i, ultimo); // mismo proceso con sublista drcha
	}

	static void intercambiar(double[] lista, int i, int j) {
		System.out.println("intercambiar " + lista[i] + " y " + lista[j]);
		double aux = lista[i];
		lista[i] = lista[j];
		lista[j] = aux;
	}

}
