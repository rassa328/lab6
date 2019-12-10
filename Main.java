package lab6;

public class Main {

	public static void main(String[] args) {
		Menu testMenu = new Menu("En liten testmeny");
		testMenu.add(new AbstractMenuItem("test") {

			@Override
			public void execute() {
				// TODO Auto-generated method stub
				
			}
			
		});
		testMenu.add(new AbstractMenuItem("skriv ut hej") {
			@Override
			public void execute() {
				System.out.println("hej");
				testMenu.execute();
			}
			
		});
		testMenu.execute(); //wow cirkulär meny
	}

}
