package TP1Samourai;

public class Humain {

	private String nom;
	private int argent;
	private String boisson;
	
	public Humain (String n, int a, String b) {
		this.nom = n;
		this.argent = a;
		this.boisson = b;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String parler(String texte) {
		String s;
		s = this.nom + " - " + texte;
		return s;
	}
	
	public void bonjour() {
		System.out.println(parler("Bonjour ! Je m'apelle "+this.nom+" et ma boisson préférée est "+this.boisson+"."));
	}
	
}
