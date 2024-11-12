package Personnage;

public class Humain {
	
	private String nom; 
	private int argent;
	private String boisson;
	
	
	public Humain(String n, int a, String b) {
		this.nom= n;
		this.argent = a;
		this.boisson = b;
		}
	
	public void parler(String t) {
		System.out.println(this.nom + " - " + t);
	}
	
	public void bonjour() {
		parler("Bonjour, je m'apelle "+this.nom+ " et ma boisson préférée est "+this.boisson);
	}
}
