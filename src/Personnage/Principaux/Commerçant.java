package Personnage.Principaux;

import Personnage.Humain;

public class Commerçant extends Humain {

    public Commerçant(String n, int a) {
        super(n, a, "thé");
    }
    
    public int seFaireExtorquer() {
    	int A = getArgent();
    	parler("Le monde est vraiment trop injuste...");
    	return A;
    }
    
    public void recevoir(int S) {
    	gagnerA(S);
    	parler("Merci beaucoup, je ne serais jamais assez reconnaissant !");
    }
    
    
}