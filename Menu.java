package lab6;

public class Menu implements MenuItem{
	/**** Skapar en tom meny med den givna rubriken.*/
	private String title;
	public Menu(String title) {
		this.title =  title;
	}
	
	
	 /*** Lägger till ett menyval till menyn.*/
	public void add(MenuItem item) {
		//måste lägga till item till nån slags lista...
	}
	
	
	public String getTitle() {
		return title;
	}
	
	  /* Exekverar menyn enligt loopen definierad i punkterna (1) till (4).* (1) Skriver ut menyns rubrik med stora bokstäverunderstruket med* ’=’. 
	  * Därefter följer en numrerad lista över alla menyelement i
	  * * denna meny, numrerade från 0.
	  * * (2) Användaren får sedan välja ett av alternativen genom att ange
	  * * talet framför menyvalet. Vad händer om man inte anger ett giltigt
	  * * tal? Användarens menyval exekveras.
	  * * (3) Om menyval 0 valts så returnerar metoden. 0 motsvarar
	  * * alltså alltid av avsluta/tillbaka/återgå.* (4) gå till (1)
	  * */   
	
	public void execute() {
		int index = 0;
		//list.get(index).execute();
	}
}
