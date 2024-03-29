package personnages;

public class Humain {
	// attribut
	private String nom;
	private String boissonFavorite;
	private int argent;

	// méthode
	public String getNom() {
		return nom;
	}

	public String getBoissonFavorite() {
		return boissonFavorite;
	}

	public int getArgent() {
		return argent;
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + "<< " + texte + " >>");
	}

	public void direBonjour() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bonjour je m'appelle ");
		builder.append(nom);
		builder.append(" et j'aime boire du ");
		builder.append(boissonFavorite);
		parler(builder.toString());
	}

	public void boire() {
		parler("Mmmmmh un bon verre de " + boissonFavorite + "! GLOUPS!");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			perteArgent(prix);
			parler("J'ai " + argent + " sous en poche.Je vais pouvoir m'offrir " + bien + " à " + prix + " sous!");
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix
					+ " sous.");
		}
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perteArgent(int perte) {
		argent -= perte;
	}

	// constructeur
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		direBonjour();
	}

}
