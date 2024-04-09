package personnages;

public class Yakuza extends Humain {
	// attribut
	String clan;
	int reputation = 4;

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

	public int perdre() {
		reputation -= 1;
		int sousPerdu = getArgent();
		perteArgent(getArgent());
		parler("J'ai perdu mon duel et mes " + sousPerdu + " sous,snif...J'ai déhsonoré le clan " + clan + ".");
		return sousPerdu;
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation += 1;
		parler("Ce ronin pensait vraiment vaincre " + getNom() + " du clan " + clan + "? Je l'ai dépouillé de ses "
				+ gain + " sous.");
	}

	@Override
	public void direBonjour() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bonjour je m'appelle ");
		builder.append(getNom());
		builder.append(" et j'aime boire du ");
		builder.append(getBoissonFavorite());
		parler(builder.toString());
		parler("Mon clan est celui de " + clan);

	}

	public int getReputation() {
		return reputation;
	}

	// constructeur
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

}
