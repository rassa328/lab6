package lab6;

public class DataObject {

	 protected String title;
	 protected int price;
	
	public DataObject() {
	}
	
	public DataObject(String titel, int price) {
		super();
		this.setTitle(title);
		this.setPrice(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}