package label;

public class Album {
	// Attributes 
	private String name;
	private float price;
	private int numSold;
	
	// Constructor
	public Album(String name, float price) {
		this.name = name;
		this.price = price;
		this.numSold = 0;	// we know that when we create an album, there will no copies sold
	}
	
	// Setter for the attribute numSold
	public void setNumSold(int numSold) {
		// I don't want to set numSold if the argument passed is < 1
		if(numSold < 1) {
			System.out.println("Error! The number of the copies sold must be a number greater than 0!");
		} else {
			this.numSold = numSold;
		}
	}
	
	// Getter for the attribute numSold
	public float getNumSold() {
		return this.numSold;
	}
	
	/*
	 *  Calculate the earnings of the album by a certain rule
	 */
	public float calculateEarnings() {
		/*
		 * in this case I can avoid using "this" because is obvious that
		 * we are referring to price and numSold attributes of the class
		 */
		return price * numSold * 0.8f;
	}
	
	public void printInfo() {
		System.out.println("The album " + name + " has been sold " + numSold + 
			" times at " + price + " €. My earnings are " + calculateEarnings() + " €");
	}
}
