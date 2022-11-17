package label;

public class Start {

	public static void main(String[] args) {
		
		Trapper t1 = new Trapper("Bello Figo", 200000, 400000000);	// I used the second constructor of the class Trapper
		
		t1.printInfo();
		
		Album a1 = new Album("Pasta con tonno", 15.5f);
		
		a1.setNumSold(50);
		a1.setNumSold(-20);
		
		a1.printInfo();
		
		// I will get a dumb album object
		Album a2 = t1.getAlbum();
		a2.printInfo();
		
		t1.setAlbum(a1);
		a2 = t1.getAlbum();
		a2.printInfo();
		
		a1.setNumSold(100);
		
		a2.printInfo();
		
		if(a1 == a2) {
			System.out.println("a1 and a2 point to the same object");
		} else {
			System.out.println("a1 and a2 point to different objects");
		}
	}
	
}