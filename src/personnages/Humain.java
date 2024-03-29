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
		parler("Bonjour je m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
	}

	public void boire(String boisson) {
		parler("Mmmmmh un bon verre de " + boisson + "! GLOUPS!");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			argent -= prix;
			parler("J'ai " + argent + " sous en poche.Je vais pouvoir m'offrir une " + bien + " à " + prix + " sous!");
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à "
					+ prix + " sous.");
		}
	}

	private void gagnerArgent(int gain) {
		argent += gain;
	}

	private void perteArgent(int perte) {
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
