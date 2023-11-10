package org.lessons.java;


/* Generatore di “nomi cognomi” casuali: il Grande Gatsby 
 * ha una lista di nomi e una lista di cognomi, 
 * e da queste vuole mostrare a video una falsa lista di 
 * invitati con nome e cognome.
 */

public class Snack2 {

	public static void main(String[] args) {
		
//		Arrays
		String[] nomi = {
				"Mario", "Luigi", "Giovanna", "Anna", "Carlo", 
				"Maria", "Luca", "Giuseppe", "Elena", "Francesca"
				};
		String[] cognomi = {
				"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", 
				"Esposito", "Romano", "Gallo", "Conti", "Marino"
				};
		
//		Support Array
		String[] list = new String[10];
		
//		Generate and print fake list
		for(int i = 0; i < nomi.length; i++) {
			String nome = nomi[i] + " " + cognomi[i];
			list[i] = nome;
			System.out.println(nome);
		}
	}
}
