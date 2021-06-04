package Lezione007_OperazioniCondizionali_IF;

import java.util.Scanner;

import Lezione006_Visibilita.Persona;

public class ApplicationMain {

	public static void main(String[] args) {
	
		
		/*
		 * 
		 * L'OPERATORE IF CONSISTE NEL CONTROLLO DI UNA CERTA CONDIZIONE DOVE AL VERIFICARSI
		 * DI QUEST'ULTIMA SUCCEDERA' QUALCHE COSA.
		 * 
		 * ESEMPIO PROVIAMO A SCRIVERE UN CODICE DOVE L'OBIETTIVO E' VERIFICARE SE L'UTENTE SIA O MENO MAGGIORENNE.
		 * 
		 */
		
		Persona p = new Persona();
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserire Nome");
		p.setNome(tastiera.nextLine());
		System.out.println("Inserire Eta");
		p.setEta(tastiera.nextInt());
		
		if(p.getEta() > 17) {
			System.out.println("Benvenuto "+p.getNome()+" !");
		}else {
			System.out.println("Solo persone maggiorenni possono entrare!");
		}
		
		/* LE OPERAZIONI POSSONO ESSERE :
		 * 
		 * <  : MINORE DI
		 * <= : MINORE UGUALE A
		 * >  : MAGGIORE DI
		 * >= : MAGGIORE UGUALE A
		 * == : UGUALE A
		 * != : DIVERSO DA
		 * 
		 */
		

	}

}
