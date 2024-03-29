package personnages;

public class Yakuza extends Humain {
	// attribut
	String clan;
	int reputation = 0;

	// méthode
	public void extorquerCommercant(Commercant victime) {
		parler("Tiens,tiens, ne serait-ce pas un faible marchand qui passe par là?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse!");
		int sousEscroque = victime.seFaireExtorquer();
		gagnerArgent(sousEscroque);
		reputation += 1;
		parler("J'ai piquer les " + sousEscroque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hihi!");
	}

	// constructeur
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

}
