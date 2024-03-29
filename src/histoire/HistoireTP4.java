package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "Kombucha", 54);
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		Commercant marco = new Commercant("Marco", 10);
		marco.seFaireExtorquer();
		marco.recevoirArgent(15);
		marco.boire();
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.extorquerCommercant(marco);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.donner(marco);
	}

}
