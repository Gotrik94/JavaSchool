package Lezione4_Operazioni_Matematiche_Con_Scanner;

import java.util.Scanner;

public class ApplicationMain {
	
	public static void main(String[] args) {

		
		/*
		 * IN QUESTO CASO UTILIZIAMO UN OGGETTO ( PER OGGETTO 
		 * CAPIREMO PROSSIMA LEZIONE COSA SI INTENDE )  DI TIPO SCANNER
		 * CHE CHIAMEREMO TASTIERA, QUESTO OGGETTO CI PERMETTE DI OSSERVARE
		 * UN FLUSSO DI DATI IN INGRESSO ( TRAMITE IL System.in ) E POSSIAMO
		 * USARE QUESTO PER LEGGERE L'INPUT DA TASTIERA ED ASSEGNARLO AD UNA VARIABILE
		 * 
		 */
		Scanner tastiera = new Scanner(System.in);
		
		// Il System.out.println() ci permette di stampare in console un messaggio, questo può essere formato da più valori , quindi stringhe, variabili, ecc.
		
		System.out.println("Inserire il valore di x");
		int x = tastiera.nextInt();
		System.out.println("Inserire il valore di y");
		int y = tastiera.nextInt();
		
//	SOMMA
		
		int somma = x+y;
		System.out.println("La somma di x + y e':"+somma);
//	DIFFERENZA
		
		int differenza = x-y;	
		System.out.println("La differenza tra x - y e':"+differenza);
//  PRODOTTO
		
		int prodotto = x*y;
		System.out.println("Il prodotto tra x * y e':"+prodotto);
//	QUOZIENTE
		
		double quoziente = x/y;
		System.out.println("Il quoziente di x / y e':"+quoziente);
//	MODULO/RESTO
		
		int resto = x%y;
		System.out.println("Il resto tra x / y e':"+resto);
		

	}

}
