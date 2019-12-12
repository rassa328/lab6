package lab6;

import java.util.*;

public class Menu implements MenuItem{
	/**** Skapar en tom meny med den givna rubriken.*/
	private String title;
	private List<MenuItem> items;
	public Menu(String title) {
		this.title =  title;
		items = new ArrayList<>();
	}
	
	
	 /*** Lägger till ett menyval till menyn.*/
	public void add(MenuItem item) {
		//lägger till ett item i våran lista items
		items.add(item);
		
	}
	
	public void printList() {
		System.out.println(Arrays.toString(items.toArray()));
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
		
				
		for (MenuItem items : items) {
			System.out.println(index + " " + items.getTitle());
			index++;
		}
		
		System.out.println("Välj ett val 0-" + --index);
		Scanner Scan = new Scanner(System.in);
		int in = Scan.nextInt();
		
		items.get(in).execute();
		
		
		
		

	}

	




}
