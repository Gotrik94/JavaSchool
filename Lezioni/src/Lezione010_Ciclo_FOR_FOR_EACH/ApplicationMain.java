package Lezione010_Ciclo_FOR_FOR_EACH;

public class ApplicationMain {

	public static void main(String[] args) {
		/*
		 * IL CICLO FOR E' UNO STRUMENTO UTILIZZATO PER RIPETERE UNA CERTA AZIONE X VOLTE 
		 * A SECONDA DELLA LOGICA DI INCREMENTO ALL'INTERNO DEL CICLO.
		 */
		
		// QUESTO CICLO RIPETE 5 VOLTE LA STAMPA
		for(int x=0;x<5;x++) {
			System.out.println("Ripetizione n°"+(x+1));
		}
		
		
		// IL CICLO FOR EACH RIPETE PER OGNI ELEMENTO DI UNA DATA COLLEZIONE UNA CERTA AZIONE, IN QUESTO CASO STAMPERO' IN ORDINE I CARATTERI DELLA STRINGA Z 
		String z = "ciao";
		
		for(char c : z.toCharArray()) {
			System.out.println(c);
		}

	}

}
