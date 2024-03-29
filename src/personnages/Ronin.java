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

	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= adversaire.getReputation()) {
			honneur += 1;
			parler("Je t'ai eu petit yakuza!");
			gagnerArgent(adversaire.perdre());

		} else {
			honneur -= 1;
			int sousPerdu = getArgent();
			adversaire.gagner(sousPerdu);
			perteArgent(sousPerdu);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup");

		}
	}

	// constructeur
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

}
