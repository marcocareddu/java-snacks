package org.lessons.java;

// Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari.
public class Snack3 {

	public static void main(String[] args) {
		
//		Array
		int[] numbers = {74, 32, 56, 23, 10, 45, 87, 5, 98, 12, 68, 41, 89, 2, 77, 30, 53, 14, 67, 91};
		
//		Support Variable
		int sum = 0;
		
//		Calc
		for(int i = 0; i < numbers.length; i++) {
			
			if((i %2) != 0) {
				sum += numbers[i];
				System.out.println("In posizione " + i + " c'è il numero " + numbers[i]);
			}
		}
		
//		Print
		System.out.println("La somma dei numeri in posizione dispari è: " + sum);
	}
}
