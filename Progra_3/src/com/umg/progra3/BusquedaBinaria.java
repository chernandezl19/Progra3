package com.umg.progra3;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese valor a buscar");
		int buscar = entrada.nextInt();
		int[] lista = new int[100];	
		
		for (int j =0; j<100; j++) {
			lista[j] = j;
		}
		
		if (binarySearch(lista, buscar))
			System.out.println("Sí hay algún valor "+buscar+" en la lista.");
		else
			System.out.println("No hay ningún valor "+buscar+" en la lista.");

	}

	public static boolean binarySearch(int[] numbers, int numberToSearch) {
	    
		  int size = numbers.length;  // Número de elementos
		  int middle = size/2;        // Mitad del array
		    
		  System.out.println("Size: " + size);
		  System.out.println("Middle: " + middle);
		  System.out.println("Array: " + Arrays.toString(numbers));
		    
		  if (numbers[middle] == numberToSearch)
		    return true;
		  else if (size == 1)
		    return false;
		  else if (numbers[middle] > numberToSearch)
		    return binarySearch(Arrays.copyOfRange(numbers,0,middle),numberToSearch); //llamada recursiva
		  else
		    return binarySearch(Arrays.copyOfRange(numbers,middle+1,size),numberToSearch);    

		}
}
