package Lezione009_OperazioniCondizionali_SWITCH;

public class ApplicationMain {

	public static void main(String[] args) {
		
		// LO SWITCH MOLTO SEMPLICEMENTE CONTROLLA UNA CERTA VARIABILE E A SECONDA DEL SUO CONTENUTO LO SWITCH CAMBIERA' IL RISULTATO
		
		String Stagione = "Autunno";
		
		switch (Stagione) {
		case "Estate":
			System.out.println("Fa caldo!");
			
			break;
			
		case "Autunno":
			System.out.println("Si sta bene ...");
			
			break;
			
		case "Inverno":
			System.out.println("Fa freddo!");
			
			break;
			
		case "Primavera":
			System.out.println("Gia' sento caldo ...");
			
			break;

		default:
			System.out.println("Non ho capito!");
			break;
		}
		
		

	}

}
