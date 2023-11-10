package org.lessons.java;

/*
 * Dato un array di numeri interi casuali 
 * compresi tra 0 e 100, 
 * scrivi un programma che trovi e stampi 
 * il numero massimo, minimo e il valore medio.
 */

public class Snack11 {

	public static void main(String[] args) {

//		Array
		int[] numbers = {87, 42, 3, 56, 91, 28, 14, 69, 5, 39, 76, 11, 50, 20, 95, 7, 34, 82, 62, 17};

//		Vars
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;

//		Calc	
		for(int i = 0; i < numbers.length; i++) {
			int currentNumber = numbers[i];
			sum += currentNumber;

			if(currentNumber > max) {
				max = currentNumber;
			} else if(currentNumber < min) {
				min = currentNumber;
			}
		}

//		Average calc
		int average = sum/numbers.length;

//		Print result
		System.out.println("Numero massimo: " + max);
		System.out.println("Numero minimo: " + min);
		System.out.println("Media: " + average);
	}
}