package lab6;

public class Main {

	public static void main(String[] args) {
		Menu testMenu = new Menu("En liten testmeny");
		testMenu.add(new AbstractMenuItem("test") {

			public void execute() {
				// TODO Auto-generated method stub
				
			}
			
		});
		mainMenu.add(new AbstractMenuItem("Avsluta") {
			public void execute() {
				System.out.println("Avslutar programmet");
				System.exit(0);
			}
		});

		mainMenu.add(new AbstractMenuItem("Visa varulista") {
			public void execute() {
				Menu.printlist();
			}
		});

		mainMenu.add(new AbstractMenuItem("Lägg till ny vara") {
			public void execute() {

			}
		});

		subMenu.add(new AbstractMenuItem("Tillbaka") {
			public void execute() {

			}
		});

		subMenu.add(new AbstractMenuItem("Filmer") {
			public void execute() {

			}
		});

		subMenu.add(new AbstractMenuItem("Böcker") {
			public void execute() {

			}
		});





		testMenu.execute(); //wow cirkulär meny
	}

}
