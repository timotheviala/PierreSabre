package personnages;

import java.util.Random;

public class Traitre extends Samouraï {
	// attribut
	private int traitrise = 0;
	private Random generateur = new Random();

	// constructeur
	public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
	}

	// méthode
	public void ranconner(Commercant commercant) {
		int argentRanconner = 0;
		if (traitrise < 3) {
			argentRanconner = commercant.getArgent() * 2 / 10;
			commercant.perteArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			traitrise++;
			parler("Si tu veux ma protection contre les yakuzas,il va falloir payer! Donne moi " + argentRanconner
					+ " sous ou gare à toi!");
			commercant.parler("Tout de suite grand " + getNom());
		} else {
			parler("Mince je ne peux ranconner personne sinon un samouraï risque de me démasquer!");
		}

	}

	@Override
	public void direBonjour() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bonjour je m'appelle ");
		builder.append(getNom());
		builder.append(" et j'aime boire du ");
		builder.append(getBoissonFavorite());
		parler(builder.toString());
		parler("Mais je suis un traitre et mon niveau de traitrise est " + traitrise + ". Chut!");
	}

	public void faireLeGentil() {
		if (getNbConnaissances() < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne! Snif.");
		} else {
			int indiceAmi = generateur.nextInt(getNbConnaissances());
			Humain ami = connaissances[indiceAmi];

		}
	}

}
