package lab6;

import java.util.*;

public class Movie extends DataObject {
	private String director;
	private int pgAge;
	
	public Movie( String title, String director, int pgAge, String itemNr, int price) {
		super(title, itemNr, price);
		this.setDirector(director);
		this.setPgAge(pgAge);
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getPgAge() {
		return pgAge;
	}
	public void setPgAge(int pgAge) {
		this.pgAge = pgAge;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


