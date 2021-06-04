package Lezione006_Visibilita;

public class ApplicationMain {

	public static void main(String[] args) {
		
		/*
		 * 
		 * ABBIAMO 3 LIVELLI DI VISIBILITA' :
		 * 1) PUBLIC : IL LIVELLO PUBLIC PERMETTE L'UTILIZZO DI UN DETERMINATO ELEMENTO ALL'INTERNO DELL'INTERO PROGETTO.
		 * 2) PRIVATE : POSSIAMO UTILIZZARE UN DATO ELEMENTO SOLO ALL'INTERNO DI UN CERTO CONTESTO.
		 * 3) PROTECTED : POSSIAMO UTILIZZARE UN DETERMINATO ELEMENTO ALL'INTERNO DELLO STESSO PACKAGE.
		 * 
		 * 
		 * IN QUESTO CASO RENDIAMO LE VARIABILI DI PERSONA PRIVATE , COS� CHE SOLO ALL'INTERNO DELLA CLASSE SI POSSA SAPERE IL VALORE EFFETTIVO DI UNA CERTA VARIABILE.
		 * SUCCESSIVAMENTE AVREMO TRAMITE DUE FUNZIONI, CHIAMATE GETTER E SETTER, L'ACCESSO ALLE DUE VARIABILI, QUESTO MECCANISMO E' DETTO "PRINCIPIO DI INCAPSULAMENTO" NELL'AMBITO DEL 
		 * LINGUAGGIO ORIENTATO AD OGGETTI.
		 */
		
		Persona x = new Persona();
		
		x.setNome("Pippo");
		x.setEta(22);
		System.out.println(x.toString());
	}

}
