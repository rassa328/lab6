package lab6;

import java.util.*;

public class Book extends DataObject{
	protected String author;
	protected int pages;

	public static List<Book> books  = new ArrayList<>();
	
	public Book (String title, String author, int pages, int price) {
		super();
		this.setAuthor(author);
		this.setPrice(price);
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public static void addBook(Book b) {
		books.add(b);
	}
	
	public static void printBook() {
		if(!books.isEmpty()) {
			System.out.println("Böcker i din varukorg:");
		for(DataObject book : books) {
			System.out.println(book);
			}
		}
		else
			System.out.println("\nInga böcker i din varukorg!\n");
	}

	public String toString() {
		return "Titel: " + title + "\nFörfattare: " + author + "\nAntal sidor: " + pages + "\nPris: " + price + "kr\n";
	}
	
}