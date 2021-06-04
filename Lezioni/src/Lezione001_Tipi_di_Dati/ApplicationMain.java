package Lezione001_Tipi_di_Dati;

public class ApplicationMain {

	public static void main(String[] args) {

/*      I tipi primitivi in Java
 * 
 * 		I tipi primitivi in Java sono 8 e ciascuno di essi è pensato per 
 * 		rappresentare un certo tipo di informazione e utilizzando una quantità specifica di memoria.
 */
		short valoreNumericoShort = 1;
		byte valoreNumericoInByte = 1; 
		int valoreNumericoIntero = 1; 
		long valoreNumericoLong = 1L;
		float valoreNumericoFloat = 1.5F;
		double valoreNumericoADoppiaPrecisione = 1.25;
		boolean valoreBoolean = true;
		char valoreChar = 'r';
		
		/*  
		    Sono supportati anche alcune speciali rappresentazioni (dette escape sequences o sequenze di escape):
		\b	backspace (indietro)
		\t	tab
		\n	line feed (fine linea)
		\f	form feed (fine pagina / nuova pagina)
		\r	carriage return (ritorno carrello / a capo)
		\’	apice singolo
		\”	doppio apice
		\\	backslash (\)	
			
		 */
		
		
/*      Stringhe e numeri
		In Java, accanto agli 8 tipi primitivi sono da considerarsi tipi di dato speciali (detti comunemente Simple Data Objects) 
		anche i tipi String e Number (e derivati) che fungono in qualche modo da controparte dei dati primitivi dove ci sia l’esigenza 
		di utilizzare un oggetto invece che direttamente un tipo
*/
		String valoreStringa = "Ciao a tutti !";
		Number valoreNumber = 21;
/* 
 *      In Java per ogni tipo primitivo esiste un corrispondente 
 *      Simple Data Object o, come si suol dire, una Classe Wrapper.		
 */
		Short valoreNumericoShortW = 1;
		Byte valoreNumericoInByteW = 1; 
		Integer valoreNumericoInteroW = 1; 
		Long valoreNumericoLongW = 1L;
		Float valoreNumericoFloatW = 1.5F;
		Double valoreNumericoADoppiaPrecisioneW = 1.25;
		Boolean valoreBooleanW = true;
		Character valoreCharW = 'r';


		
		

	}

}
