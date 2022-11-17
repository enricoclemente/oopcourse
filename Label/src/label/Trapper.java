package label;

// Class
public class Trapper {
	// Attributes
	private String name;
	private float cash;
	private float streetCredibility;
	private Album album;
	
	// Constructors
	public Trapper(String name, float streetCredibility) {
		this.name = name;
		this.streetCredibility = streetCredibility;
		this.cash = 0;
	}
	
	// This an overloading of the constructor
	public Trapper(String name, float cash, float streetCredibility) {
		this.name = name;
		this.cash = cash;
		this.streetCredibility = streetCredibility;
	}
	
	// Getter for the attribute cash
	public float getCash() {
		return this.cash;
	}
	
	// Setter for the attribute cash
	public void setCash(float cash) {
		this.cash = cash;
	}
	
	// Getter for the attribute streetCredibility
	public float getStreetCredibility() {
		return this.streetCredibility;
	}
	
	// Setter for the attribute streetCredibility
	public void setStreetCredibility(float streetCredibility) {
		this.streetCredibility = streetCredibility;
	}
	
	// Getter for the attribute album
	public Album getAlbum() {
		if(this.album != null) {
			return this.album;
		} else {
			System.out.println("You are trying to get an album that dosen't exist! I will create an empty one for you");
			return new Album("", 0);
		}
	}
	
	// Setter for the attribute album
	public void setAlbum(Album album) {
		if(album != null) {
			this.album = album;
		} else {
			System.out.println("Error! You are trying to set a null value as album!");
		}
	}
	
	public void printInfo() {
		System.out.println("Hi, my name is " + name + 
						", I have " + cash + " € in my bank account and my street credibility is " 
						+ streetCredibility);
	}

}
