package lab6;

import java.util.*;

public class Menu implements MenuItem{
	private String title;
	private List<MenuItem> items;
	public Menu(String title) {
		this.title =  title;
		items = new ArrayList<>();
	}
	
	
	public void add(MenuItem item) {
		items.add(item);
	}
	
	public String getTitle() {
		return title;
	}
	
	public void execute() {
		try {int index = 0;
		
		//skriver ut meny titel
		System.out.println(title);		
		
		for (MenuItem items : items) {
			System.out.println(index + ". " + items.getTitle());
			index++;
		}
		
		System.out.println("Ange 0-" + --index + ":");
		Scanner Scan = new Scanner(System.in);
		int in = Scan.nextInt();
		items.get(in).execute();
	}
		catch (IndexOutOfBoundsException | InputMismatchException  e) {
			System.out.println("Felinmatning!");
			execute();
	}
		
	}
}
