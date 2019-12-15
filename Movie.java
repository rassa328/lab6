package lab6;

import java.util.*;

public class Movie extends DataObject {
	private String director;
	private int length;
	
	public static List<Movie> movies  = new ArrayList<>();
	
	public Movie( String title, String director, int pgAge,  int price) {
		super();
		this.setDirector(director);
		this.setLength(pgAge);
		
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getLength() {
		return length;
		
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public static void addMovie(Movie m) {
		movies.add(m);
	}
	
	
	public static void printMovie() {
		if(!movies.isEmpty()) {
			System.out.println("Filmer i din varukorg:");
		for(DataObject movie : movies) {
			System.out.println(movie);
			}
		}
		else
			System.out.println("\nInga filmer i din varukorg!\n");
	}
	
	public String toString() {
		return "Titel: " + title + "\nRegissör: " + director + "\nLängd: " + length + "\nPris: " + price + "kr\n";
	}
	
}