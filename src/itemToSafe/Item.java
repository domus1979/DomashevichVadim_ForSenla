package itemToSafe;

public class Item {
	private String name; 
	private int weight;
	private int price;
	private int putNumber;
	
	public Item(String name, int weight, int price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.putNumber = 0;
	}

	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}

	public int getPrice() {
		return price;
	}

	public int getPutNumber() {
		return putNumber;
	}

	public void setPutNumber(int number) {
		this.putNumber = number;
	}
}
