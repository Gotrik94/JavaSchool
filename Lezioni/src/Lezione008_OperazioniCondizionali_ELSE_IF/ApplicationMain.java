package Lezione008_OperazioniCondizionali_ELSE_IF;

import java.util.Scanner;

public class ApplicationMain {

	public static void main(String[] args) {
		/*
		 * 
		 * L'OPERATORE ELSE IF CONSISTE NEL CONCATENAMENTO DI PIU' LIVELLI DI IF, AMMETTIAMO CHE OLTRE ALL'ETA' 
		 * SI VOGLIA SAPERE SE SI E' VACCINATI O MENO, NEL CASO SI FOSSE VACCINATI SI ACCETTANO STRAPPI ALLE REGOLE SULL'ETA'
		 * 
		 */
		
		Persona p = new Persona();
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserire Nome");
		p.setNome(tastiera.nextLine());
		System.out.println("Inserire Eta");
		p.setEta(tastiera.nextInt());
		p.setVaccino(true);
		
		if(p.getEta() > 17) {
			System.out.println("Benvenuto "+p.getNome()+" !");
		}else if(p.isVaccino()){
			System.out.println("Non potresti mio caro "+p.getNome()+", ma per te farò un eccezione...");
			
		}else {
			System.out.println("Solo persone maggiorenni possono entrare!");
		}
		
		
		/*
		 * 
		 * PER FINIRE NELLE CONDIZIONE PUO' ESSERE ASSOCIATA PIU' DI UNA CONDIZIONE,
		 * E SI POSSONO ALLEGARE CON ...
		 * 
		 *||	:	QUESTO STA PER OR LOGICO E QUINDI IN UN IF CON DUE CONDIZIONI COLLEGATE DA UN OR, PER VERIFICARLA BASTA UNA
		 *			DELLE DUE VERIFICATE PER ACCEDERE.
		 *
		 *&&	:	QUESTO STA PER AND LOGICO E NEL CICLO SE PRESENTE, TUTTE LE CONDIZIONI COLLEGATE DA UN AND DEVONO ESSERE VERIFICATE PER
		 *			ACCEDERE.
		 * 
		 */
		

	}

}
