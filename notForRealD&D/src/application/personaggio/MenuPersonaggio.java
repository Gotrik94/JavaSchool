package application.personaggio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MenuPersonaggio implements Runnable {
	
	private static Scanner tastiera = new Scanner(System.in);
	
	private static boolean start = true;
	private static int sceltaMenuPersonaggio;
	private final static String urlPath = "src\\fileGioco\\personaggio"; 
	
	
	public void run() {
		
		System.out.println("Benvenuto nel Menu Personaggio!");
		System.out.println("Cosa vuoi fare ? "
				+ "\n1)Creazione del personaggio"
				+ "\n2)Elimina Personaggio");
		
		do {
			
			int sceltaMenuPersonaggio = 0;
			boolean sceltaMenuBoolean = true;
			do {
				try {
					sceltaMenuPersonaggio = tastiera.nextInt();
					if(sceltaMenuPersonaggio<4 && sceltaMenuPersonaggio>0 ) {
						sceltaMenuBoolean = false;
					}else {
						System.out.println("Numero errato! ");
					}

				} catch (Exception e) {
					e.getMessage();
					System.out.println("Numero errato!");
				}
			}while(sceltaMenuBoolean);
			
			switch (sceltaMenuPersonaggio) {
			case 1:
				
				File f = new File(urlPath+"\\personaggio.txt");
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				start = false;
				
				break;

			default:
				break;
			}
			
		}while(start);


	}

}
