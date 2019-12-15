package lab6;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		Menu mainMenu = new Menu("HUVUDMENY");
		Menu varuLista = new Menu("VARULISTA");
		Menu laggTillVara = new Menu("LÄGG TILL NY VARA");
	
		String title = null, author = null, director = null;
		int price = 0, pages = 0, length = 0;
		
		
		//HUVUDMENY ****************************************************************'''
		mainMenu.add(new AbstractMenuItem("Avsluta") {
			public void execute() {
				System.out.println("Avslutar programmet");
				System.exit(0);
			}
		});
		
		mainMenu.add(new AbstractMenuItem("Varulista") {
			public void execute() {
				varuLista.execute();
			}
		});
			
		
		mainMenu.add(new AbstractMenuItem("Lägg till ny vara") {
			public void execute() {
				laggTillVara.execute();

			}
		});
		

		//VARULISTA ************************************************************************
		varuLista.add(new AbstractMenuItem("Tillbaka") {
			public void execute() {
				mainMenu.execute();
			}
		});
		
		varuLista.add(new AbstractMenuItem("Böcker") {
			public void execute() {
				Book.printBook();
				varuLista.execute();
			}
		});
		
		varuLista.add(new AbstractMenuItem("Filmer") {
			public void execute() {
				Movie.printMovie();
				varuLista.execute();
			}
		});
		

		//LÄGG TILL VARA ********************************************************************
		laggTillVara.add(new AbstractMenuItem("Tillbaka") {
			public void execute() {
				mainMenu.execute();
			}
		});

		
		laggTillVara.add(new AbstractMenuItem("Bok") {
			public void execute() {
				Book book = new Book(title, author, pages, price);
				
				System.out.println("Skriv in: Titel");
				String in = Scan.nextLine();
				book.setTitle(in);
				System.out.println("Skriv in: Författare");
				in = Scan.nextLine();
				book.setAuthor(in);
				try {
				System.out.println("Skriv in: Antal sidor");
				in = Scan.nextLine();
				book.setPages(Integer.parseInt(in));
				System.out.println("Skriv in: Pris");
				in = Scan.nextLine();
				book.setPrice(Integer.parseInt(in));
				Book.addBook(book);
				}
				catch (NumberFormatException e) {
					System.out.println("Felinmatning, börja om!");
				}
				
				laggTillVara.execute();
			}
		});
		
		
		laggTillVara.add(new AbstractMenuItem("Film") {
			public void execute() {
				Movie movie = new Movie(title, director, length, price);
				
				System.out.println("Skriv in: Titel");
				String in = Scan.nextLine();
				movie.setTitle(in);
				System.out.println("Skriv in: Regissör");
				in = Scan.nextLine();
				movie.setDirector(in);
				try {
				System.out.println("Skriv in: Längd");
				in = Scan.nextLine();
				movie.setLength(Integer.parseInt(in));
				System.out.println("Skriv in: Pris");
				in = Scan.nextLine();
				movie.setPrice(Integer.parseInt(in));
				Movie.addMovie(movie);
				}
				catch (NumberFormatException e) {
					System.out.println("Felinmatning, börja om!");
				}
				
				laggTillVara.execute();
			}
		});

		

		mainMenu.execute();
		
	}

}
