package lab6;

import java.util.*;

public class Book extends DataObject{

	private String author;

	private List<Book> books;
	books = new ArrayList<>();
	
	public Book (String title, String author, String itemNr, int price) {
		super(title, itemNr, price);
		this.setAuthor(author);
		
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

	
	
	
}
