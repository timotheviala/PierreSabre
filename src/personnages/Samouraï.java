package personnages;

public class Samouraï extends Ronin {

	// attribut
	private String seigneur;

	// constructeur
	public Samouraï(String seigneur, String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.seigneur = seigneur;
		parler("Je suis fier de servir le seigneur " + seigneur);
	}

	// methode

	@Override
	public void direBonjour() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bonjour je m'appelle ");
		builder.append(getNom());
		builder.append(" et j'aime boire du ");
		builder.append(getBoissonFavorite());
		parler(builder.toString());
	}

	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson? Tiens je vais prendre du " + boisson);
	}

}
