package Lezione011_Ciclo_WHILE_DO_WHILE;

public class ApplicationMain {

	public static void main(String[] args) {
		/*
		 * 
		 * IL CICLO WHILE RIPETE IL CICLO FINCHE' UNA CERTA CONDIZIONE SIA VERIFICATA, MA ESSA NON VIENE RIPETUTA MAI 
		 * SE NON SI VERIFICA, MENTRE IL DO WHILE HA LO STESSO FUNZIONAMENTO MA ENTRA ALMENO UNA VOLTA NEL CICLO.
		 * 
		 */
		
		int n1 = 0;

		while(n1!=10){
			System.out.println(n1);
			n1++;
		}
		
		int n2 = 0;
		
		// NON ENTRO MAI QUI 
		while(n2==10){
			System.out.println(n1);
			n1++;
		}
		
		do {
			System.out.println("Entro solo una volta in questo do while perché la condizione non è verificata.");
		}while(n2==10);

	}

}
