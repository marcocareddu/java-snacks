package org.lessons.java;

import java.util.Scanner;

// Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo
public class Snack1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		Inputs from user
		System.out.println("Inserisci un numero");
		String input = in.nextLine();
		int number = Integer.valueOf(input);
		
//		Close Scanner
		in.close();
		
//		Calc even/odd and print
		if((number %2) == 0) {
			System.out.println("Il numero " + number + " è pari!");	
		} else {
			System.out.println("Il numero successivo è " + (number + 1));
		}
	}
}
