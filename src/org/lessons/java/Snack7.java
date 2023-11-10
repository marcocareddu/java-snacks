package org.lessons.java;

import java.util.Scanner;

/*Scrivere un programma che dati dei secondi li converta in 
 * ore, minuti, secondi e mostri a video 
 * la stringa generata (secondi → “hh:mm:ss”)
 */
public class Snack7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		User input
		System.out.println("Inserisci i secondi; ");
		int input = in.nextInt();
		
//		Close input
		in.close();
		
//		Calc
		int hours = input / 3600;
        int minutes = (input % 3600) / 60;
        int seconds = input % 60;

        String humanClock = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        System.out.println(input + " secondi corrispondono a : " + humanClock);
	}
}
