package application;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

import application.personaggio.MenuPersonaggio;

public class ApplicationMain {

	private static boolean start = true;
	private static Scanner tastiera = new Scanner(System.in);

	public static void main(String[] args) throws IOException, InterruptedException {

		do {

			System.out.println("Ciao ! Benvenuto in questo giochino, questo è il menù di avvio. ");
			System.out.println("Prego selezionare il comando desiderato... ");

			System.out.println("1) Menu Personaggio"
					+ "\n2) Addestramento"
					+ "\n3) Campagna"
					+ "\n4) Exit ");

			int sceltaMenu = 0;
			boolean sceltaMenuBoolean = true;
			do {
				try {
					sceltaMenu = tastiera.nextInt();
					if(sceltaMenu<=4 && sceltaMenu>0 ) {
						sceltaMenuBoolean = false;
					}else {
						System.out.println("Numero errato! ");
					}

				} catch (Exception e) {
					e.getMessage();
					System.out.println("Numero errato!");
				}
			}while(sceltaMenuBoolean);


			switch (sceltaMenu) {
			case 1:
				
				System.out.println("Hai selezionato Menu Personaggio");
				MenuPersonaggio mp = new MenuPersonaggio();
				Thread thread = new Thread(mp);
				thread.run();
				thread.stop();

				break;

			case 2:
				
				System.out.println();

				break;

			case 3:
				
				System.out.println();

				break;

			case 4:

				System.out.println("OK grazie per aver giocato !");
				start = false;

				break;

			default:
				break;
			}


		}while(start);

	}

}
