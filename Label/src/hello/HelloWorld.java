package hello;

public class HelloWorld {
	private int i;
	private String mimmo = "ciao";
	
	public static void main(String[] args) {
		
		System.out.println("Hello world");
	}
	
	public void modificaLaVariabile(int nuovoValore) {
		this.i= nuovoValore;
	}

	public String getMimmo() {
		return mimmo;
	}

	public void setMimmo(String mimmo) {
		this.mimmo = mimmo;
	}

}
