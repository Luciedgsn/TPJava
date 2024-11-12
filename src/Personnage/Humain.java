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
	
	public String getNom() {
		return this.nom;
	}
	public int getArgent() {
		return this.argent;
	}
	public String getBoisson() {
		return this.boisson;
	}

	
	
	public void parler(String t) {
		System.out.println(this.nom + " - " + t);
	}
	
	public void bonjour() {
		parler("Bonjour, je m'apelle "+this.nom+ " et ma boisson préférée est "+this.boisson);
	}


	public void boire(String b) {
		parler("Hmmm un bon verre de "+ b + " GLOUPS !");
	}
	
	public void gagnerA(int S) {
		this.argent += S;
	}
	
	public void perdreA(int S) {
		this.argent -= S;
	}
	
}
