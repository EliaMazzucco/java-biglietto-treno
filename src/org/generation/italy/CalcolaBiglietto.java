package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Il programma dovr� chiedere all�utente il numero di chilometri che vuole percorrere e l�et� del passeggero
		
		double kmDaPercorrere;
		int anni;
		
		System.out.print("Inserisci il numero di chilometri da percorrere: ");
		kmDaPercorrere = scanner.nextDouble();	
				
		System.out.print("Inserisci la tua et�: ");
		anni = scanner.nextInt();		
		
		if (kmDaPercorrere > 0 && (anni >0 && anni < 100)) {
			System.out.println("I tuoi chilometri: " + kmDaPercorrere);
		
			
			//Sulla base di queste informazioni dovr� calcolare il prezzo totale del viaggio, secondo queste regole:			
			
			//-il prezzo del biglietto � definito in base ai km (0.21 � al km)
			
			double prezzoKm = 0.21;
			
			double prezzoBiglietto = kmDaPercorrere * prezzoKm;
				
			System.out.println("Il prezzo del tuo biglietto �: " + prezzoBiglietto);			
			
			//-va applicato uno sconto del 20% per i minorenni
			//-va applicato uno sconto del 40% per gli over 65
			
			double scontoMinorenni = (prezzoBiglietto *20) / 100;
			double scontoOver = (prezzoBiglietto *40) / 100;
			
			if(anni < 18) {			
				
				System.out.println("Il prezzo del tuo biglietto scontato �: " + (prezzoBiglietto - scontoMinorenni));	
				
			} else if(anni > 65) {
				System.out.println("Il prezzo del tuo biglietto scontato �: " + (prezzoBiglietto - scontoOver));			
			}	
		}
		
		else {
			System.out.println("Non puoi comprare il bliglietto");
		}
		
		scanner.close();
	}

}
