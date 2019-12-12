package lab6;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<DataObject> varor = new ArrayList<>();
		Menu mainMenu = new Menu("Huvudmenyn");
		Menu laggTillVara = new Menu("Submeny, Lägg till vara");
//		mainMenu.add(laggTillVara);  ???

		mainMenu.add(new AbstractMenuItem("Avsluta") {
			public void execute() {
				System.out.println("Avslutar programmet");
				System.exit(0);
			}
		});
		
		mainMenu.add(new AbstractMenuItem("Visa varulista") {
			public void execute() {
				for(DataObject vara : varor) {
					System.out.println(vara.toString());
				}
//				Menu.printList();
			}
		});
			
		
		mainMenu.add(new AbstractMenuItem("Lägg till ny vara") {
			public void execute() {
				laggTillVara.execute();

			}
		});
		



		laggTillVara.add(new AbstractMenuItem("Tillbaka") {
			public void execute() {
				mainMenu.execute();
			}
		});

		laggTillVara.add(new AbstractMenuItem("Filmer") {
			public void execute() {

			}
		});

		laggTillVara.add(new AbstractMenuItem("Böcker") {
			public void execute() {
				//SKRIV in all info om bok
				
				
				
				
				
				laggTillVara.execute();

			}
		});

		mainMenu.execute();
		
	}

}
