package personnages;

public class Humain {
	// attribut
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected Humain[] connaissances = new Humain[30];
	private int maxConnaissances = 30;
	protected int nbConnaissances = 0;

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

	public int getNbConnaissances() {
		return nbConnaissances;
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

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}

	private void memoriser(Humain humain) {
		if (nbConnaissances == maxConnaissances) {
			for (int i = 0; i < connaissances.length - 1; i++) {
				connaissances[i] = connaissances[i + 1];
			}
			connaissances[maxConnaissances - 1] = humain;
		} else {
			connaissances[nbConnaissances] = humain;
			nbConnaissances += 1;
		}
	}

	public void listerConnaissances() {
		StringBuilder builder = new StringBuilder("(" + getNom() + ") -");
		builder.append("Je connnais beaucoup de monde dont:");
		for (int i = 0; i < nbConnaissances; i++) {
			if (i != 0) {
				builder.append(", ");
			}
			builder.append(connaissances[i].getNom());

		}
		System.out.println(builder + ".");
	}

	// constructeur
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		direBonjour();
	}

}
