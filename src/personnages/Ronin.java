package personnages;

public class Ronin extends Humain {
	// attribut
	int honneur = 1;

	// méthode
	public void donner(Commercant beneficiaire) {
		int sousDon = (getArgent() / 10);
		parler(beneficiaire.getNom() + " prend ces " + sousDon + " sous.");
		beneficiaire.recevoirArgent(sousDon);
	}

	// constructeur
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

}
