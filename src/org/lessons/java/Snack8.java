package org.lessons.java;

/*
 * Dato un input stringa, il programma deve sostituire 
 * tutti i caratteri 'a' con 'o' e viceversa, 
 * quindi stampare la nuova stringa.
 */

import java.util.Scanner;

public class Snack8 {

	public static void main(String[] args) {
		
//		User input
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci una stringa");
		String word = in.nextLine();
		
//		Close Scanner
		in.close();
		
//		Support var
		String finalWord = "";
		
//		Calc
		for(int i = 0; i < word.length(); i++) {
			
			char character = word.charAt(i);
		
			if(character == 'a') {
				character = 'o';
			} else if (character == 'o') {
				character = 'a';
			}
			finalWord += character;
		}

//		Print result
		System.out.println("La parola è: " + finalWord);
	}
}
