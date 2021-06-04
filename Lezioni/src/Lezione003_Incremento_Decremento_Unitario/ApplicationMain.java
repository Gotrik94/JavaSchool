package Lezione003_Incremento_Decremento_Unitario;

public class ApplicationMain {

	public static void main(String[] args) {

		int x = 5;
		
		// INCREMENTO
		
		x++; // valgo 6
		
		//DECREMENTO
		
		x--; // valgo 5
		
		/* 
		 * SI PUO' DICHIARARE ANCHE PRIMA O DOPO LA VARIABILE
		 * COSA CAMBIA ? NEL CASO DI UNA ASSEGNAZIONE SE L'INCREMENTO/DECREMENTO
		 * E' PRIMA DELLA VARIABILE QUESTA PRIMA INCREMENTA/DECREMENTA E POI ASSEGNA
		 * ALTRIMENTI PRIMA ASSEGNA POI INCREMENTA/DECREMENTA.
		 * 
		 */
		 
		int y ;
		
		y = x ; // y vale 5
		
		y = x++; // y vale 5 x vale 6
		
		y = ++x; // entrambi valgono 5
		
		

	}
}
