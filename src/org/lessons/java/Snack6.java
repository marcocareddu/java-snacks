package org.lessons.java;

import java.util.Scanner;

/*
 * 		Dato un numero sotto forma di stringa, 
 * 		convertirlo in intero senza utilizzare funzioni già pronte.
		Possibile usare solo: cicli, chartAt, if/switch
 */

public class Snack6 {
	
	public static void main(String[] args) {
		
//		Comparison Array
		int[] intNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		char[] stringNumbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
//		Support Var
		int number = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		String input = in.nextLine();
		
		in.close();
		for(int i = 0; i < input.length(); i++) {
			
			char singleChar = input.charAt(i);

			for(int y = 0; y < stringNumbers.length; y++) {
				if(stringNumbers[y] == singleChar) {
					number =  number * 10 + intNumbers[y]-1;
				}
			}
		}
		System.out.println(number);
	}
}
