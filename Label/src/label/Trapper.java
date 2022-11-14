package label;

// Class
public class Trapper {
	// Attributes
	String name;
	float cash;
	float streetCredibility;
	
	// Costructors
	public Trapper(String name, float streetCredibility) {
		this.name = name;
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

}
