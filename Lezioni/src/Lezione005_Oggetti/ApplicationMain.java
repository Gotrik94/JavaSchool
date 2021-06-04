package Lezione005_Oggetti;

public class ApplicationMain {

	public static void main(String[] args) {
		
		/* ABBIAMO CREATO UNA CLASSE PERSONA, IN QUESTA ABBIAMO CREATO DUE VARIABILI
		 * UNA PER IL NOME E UNA PER L'ETA', DOPO ABBIAMO AGGIUNTO I DUE COSTRUTTORI 
		 * CON CUI NOI POSSIAMO ANDARE A CREARE L'OGGETTO PERSONA INCLUDENDO ANCHE LA POSSIBILITA'
		 * DI AVERE DEI CAMPI VUOI PER POI ASSEGNARE LE VARIABILI DELLA PERSONA IN UN SECONDO MOMENTO.
		 */
		
		Persona pippo = new Persona("Pippo",5);
		Persona tizioX = new Persona();
		
		tizioX.nome = "Geltrude";
		tizioX.eta = 54;
		
		System.out.println("Ciao sono "+pippo.nome+" ed ho "+pippo.eta+" anni");
		System.out.println("Ciao sono "+tizioX.nome+" ed ho "+tizioX.eta+" anni");

	}

}
