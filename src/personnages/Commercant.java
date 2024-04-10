package personnages;

public class Commercant extends Humain {

	// méthode
	public void recevoirArgent(int don) {
		gagnerArgent(don);
		parler(don + " sous! Je te remercie généreux donateur!");
	}

	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Ce monde est trop injuste!");
		int temp = getArgent();
		perteArgent(getArgent());
		return temp;
	}

	// constructeur
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
		direBonjour();
	}

}
