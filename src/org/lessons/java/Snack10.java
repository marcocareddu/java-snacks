package org.lessons.java;

import java.util.Scanner;

/*
 * Dati due numeri interi acquisiti dall'utente (Scanner), 
 * calcolare la somma di tutti i numeri 
 * compresi tra questi due valori (inclusi).
 */

public class Snack10 {

	public static void main(String[] args) {
		
//		User inputs
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero: ");
		int number1 = in.nextInt();
		
		System.out.println("Inserisci il secondo numero: ");
		int number2 = in.nextInt();
		
//		Close Scanner
		in.close();
		
//		Vars
		int difference = number2 - number1;
		int number = 0;
		
//		Calc
		for(int i = 0; i <= difference; i++) {
			number += number1 + i;
		}
		
//		Print result
		System.out.println(number);
	}
}
