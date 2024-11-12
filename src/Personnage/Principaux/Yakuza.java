package Personnage.Principaux;

import Personnage.Humain;

public class Yakuza extends Humain{
	
	private String clan;
	private int réputation;
	
	public Yakuza(String n, int s, String b, String c) {
		super(n,s,b);
		this.clan = c;
		this.réputation = 0;
	}
	
	public void extorquer(Commerçant c) {
		int v = c.seFaireExtorquer();
		gagnerA(v);
		this.réputation += 1;
		parler("Je viens d'extorquer "+v+" galons à "+ c.getNom());
	}
	
	public void gagner() {
		this.réputation += 1;
		parler("J'ai gagné mon combat !");
	}
	
	public int perdre() {
		int v = getArgent();
		perdreA(v);
		this.réputation -= 1;
		parler("J'ai perdu mon combat.");
		return v;
	}
}
