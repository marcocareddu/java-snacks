package org.lessons.java;

import java.util.Arrays;

/*
 * Dato un array di numeri interi, 
 * dividere i numeri in due nuovi array: 
 * uno contenente solo numeri pari e l'altro solo numeri dispari.
 */

public class Snack9 {

	public static void main(String[] args) {
		
//		Array
		int[] numbers = {1, 5, 7, 12, 8, 3, 6, 9, 2, 10};
		
//		Vars
		int evenNumber = 0;
		int oddNumber = 0;
		
//		Calc Array dimension
		for(int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			if((num %2) == 0) {
				oddNumber++;
			} else {
				evenNumber++;
			}	
		}
		
//		Empty Arrays
		int[] evenArray = new int[evenNumber];
		int[] oddArray = new int[oddNumber];
		
//		Array Index
		int evenIndex = 0;
		int oddIndex = 0;
		
//		Fill Arrays
		for(int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			if((num %2) == 0) {
				oddArray[oddIndex] = num;
				oddIndex++;
			} else {
				evenArray[evenIndex] = num;
				evenIndex++;
			}	
		}
		
//		Print Arrays results
		System.out.println("Numeri Pari: " + Arrays.toString(oddArray));
		System.out.println("Numeri Dispari: " + Arrays.toString(evenArray));
	}
}
