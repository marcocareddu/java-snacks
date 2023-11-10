package org.lessons.java;

import java.util.Scanner;

// Data in input una stringa verificare se è palindroma
public class Snack4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		User input
		System.out.println("Inserisci una parola: ");
		String word = in.nextLine();
		
//		Close Scanner
		in.close();
		
//		Support var
		String reversedWord = "";
		
//		Calc
		for(int i = word.length()-1; i >= 0; i--) {
			char letter = word.charAt(i);
			reversedWord += letter;
		}
		
//		Print result
		if(word.equals(reversedWord)) {
			System.out.println("La parola " + word + " è palindroma!");
		} else {
			System.out.println("La parola " + word + " non è palindroma!");
		}
	}
}
