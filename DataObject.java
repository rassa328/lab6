package lab6;

import java.util.*;


public class DataObject {

	 String title;
	 String itemNr;
	 int price;
	
	public DataObject() {
		
	}
	
	public DataObject(String titel, String itemNr, int price) {
		this.setTitle(title);
		this.setItemNr(itemNr);
		this.setPrice(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getItemNr() {
		return itemNr;
	}

	public void setItemNr(String itemNr) {
		this.itemNr = itemNr;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	


	
}
