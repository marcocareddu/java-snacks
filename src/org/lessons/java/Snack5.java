package org.lessons.java;

import java.util.Scanner;

/* Data una stringa in input mostrare a video 
 * quanti caratteri alfabetici contiene, 
 * quanti numeri e quanti simboli non alfanumerici. 
 * Continuare a chiedere una nuova stringa finché non si inserisce lo 0.
 */

public class Snack5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		Support Vars
		int totNumbers = 0;
		int totLetters = 0;
		int totSpecialChars = 0;
		String word = "";
		
//		Cicle
		do {
//			Input
			System.out.println("Scrivi qualcosa");
			word = in.nextLine();
			
			for(int i = 0; i < word.length(); i++) {
				
				char character = word.charAt(i);
				
				if(Character.isDigit(character)) {
					totNumbers++;
				} else if (Character.isLetter(character)) {
					totLetters++;
				} else {
					totSpecialChars++;
				}
			}
			
//			Print
			System.out.println("\nNumeri totali: " + totNumbers);
			System.out.println("Lettere totali: " + totLetters);
			System.out.println("Caratteri speciali: " + totSpecialChars + "\n");
			
		} while (!word.equals("0"));
		
//		Close Scanner
		in.close();
	}
}