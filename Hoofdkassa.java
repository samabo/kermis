package kermis;

import java.util.Scanner;

public class Hoofdkassa {

	static Scanner scanner = new Scanner(System.in);
	static String invoer;
	static boolean stoppen;

	public static void main(String[] args) {

		System.out.println("Welkom op de kermis!");
		Hoofdkassa kassa = new Hoofdkassa();

		while (stoppen == false) {
			kassa.keuze();
			kassa.nogIets();
		}
	}

	public void keuze() {

		System.out.println(
				"Wat wilt u doen? Voer in: \n1 : Botsauto's \n2 : de Spin\n3 : Het Spiegelpaleis\n4 : Het Spookhuis\n5 : de Hawaii"
						+ "\n6 : Het Ladderklimmen\n7 : Ik wil iets eten!\n8 : Laat me de cijfers maar zien");
		int keuze = scanner.nextInt();
		switch (keuze) {
		case 1:
			Botsauto botsauto = new Botsauto();
			botsauto.kopen();
			botsauto.draaien();
			break;
		case 2:
			Spin spin = new Spin();
			spin.kopen();
			spin.draaien();
			break;
		case 3:
			Spiegelpaleis spiegel = new Spiegelpaleis();
			spiegel.kopen();
			spiegel.draaien();
			break;
		case 4:
			Spookhuis spook = new Spookhuis();
			spook.kopen();
			spook.draaien();
			break;
		case 5:
			Hawaii hawaii = new Hawaii();
			hawaii.kopen();
			hawaii.draaien();
			break;
		case 6:
			Ladderklimmen ladder = new Ladderklimmen();
			ladder.kopen();
			ladder.draaien();
			break;
		case 7:
			eten();
			break;
		case 8:
			toonCijfers();
			break;
		default:
			System.out.println("Dit is geen geldige invoer. Probeer het opnieuw.");
			keuze();
		}

	}

	public void nogIets() {
		do {
			System.out.println("Wil je nog iets doen? Druk A voor iets anders of V om de kermis te verlaten.");
			invoer = scanner.next().toUpperCase();
		} while (!invoer.equals("A") && !invoer.equals("V")); // blijft de loop herhalen tot iemand A of V invoert.

		if (invoer.equals("A")) {
			System.out.println("Gezellig!");
		} else if (invoer.equals("V")) {
			System.out.println("\nJe verlaat de kermis. Bedankt voor je bezoek!");
			stoppen = true;
		}

	}

	public void eten() {
		System.out.println(
				"Wat wil je eten? Voer in: \n11 : de Oliebollenkraam \n22 : de Friettent \n33 : de Müeslikraam\n44 : de Shoarmatent");
		int keuze = scanner.nextInt();
		switch (keuze) {
		case 11:
			Oliebollenkraam olie = new Oliebollenkraam();
			olie.kopen();
			break;
		case 22:
			Friettent friet = new Friettent();
			friet.kopen();
			break;
		case 33:
			Müeslikraam muesli = new Müeslikraam();
			muesli.kopen();
			break;
		case 44:
			Shoarmatent shoarma = new Shoarmatent();
			shoarma.kopen();
			break;
		default:
			System.out.println("Dit is geen geldige invoer. Probeer het opnieuw.");
			eten();
			break;
		}
	}

	public void toonCijfers() {
		System.out.println(
				"\nWat wil je zien? Voer in : \nKA = Aantal klanten van de attracties\nOA =  Omzet van de attracties");
		System.out.println("KV = Aantal klanten van de voedselkraampjes \nOV =  Omzet van de voedselkraampjes");
		System.out.println("K = Aantal klanten van de hele kermis \nO =  Omzet van de hele kermis");
		String keuze = scanner.next();
		keuze = keuze.toUpperCase();
		switch (keuze) {
		case "KA":
			System.out.println();
			System.out.println(Botsauto.getKlanten() + " = Bezoekerstotaal Botsauto's");
			System.out.println(Spin.getKlanten() + " = Bezoekerstotaal Spin");
			System.out.println(Spiegelpaleis.getKlanten() + " = Bezoekerstotaal Spiegelpaleis");
			System.out.println(Spookhuis.getKlanten() + " = Bezoekerstotaal Spookhuis");
			System.out.println(Hawaii.getKlanten() + " = Bezoekerstotaal Hawaii");
			System.out.println(Ladderklimmen.getKlanten() + " = Bezoekerstotaal Ladderklimmen");
			System.out.println("=====================================");
			System.out.println((Botsauto.getKlanten() + Spin.getKlanten() + Spiegelpaleis.getKlanten()
					+ Spookhuis.getKlanten() + Hawaii.getKlanten() + Ladderklimmen.getKlanten())
					+ " = Bezoekerstotaal van de attracties.");
			break;
		case "OA":
			System.out.println();
			System.out.println();
			System.out.println("€ " + Botsauto.getOmzet() + "\t = Omzet Botsauto's");
			System.out.println("€ " + Spin.getOmzet() + "\t = Omzet Spin");
			System.out.println("€ " + Spiegelpaleis.getOmzet() + "\t = Omzet Spiegelpaleis");
			System.out.println("€ " + Spookhuis.getOmzet() + "Omzet Spookhuis");
			System.out.println("€ " + Hawaii.getOmzet() + "\t = Omzet Hawaii");
			System.out.println("€ " + Ladderklimmen.getOmzet() + "\t = Omzet Ladderklimmen");
			System.out.println("=====================================");
			System.out
					.println("€ "
							+ (Botsauto.getOmzet() + Spin.getOmzet() + Spiegelpaleis.getOmzet() + Spookhuis.getOmzet()
									+ Hawaii.getOmzet() + Ladderklimmen.getOmzet())
							+ "\t = Totale omzet van de attracties.");
			break;
		case "KV":
			System.out.println();
			System.out.println(Oliebollenkraam.getKlanten() + " klanten bij de Oliebollenkraam");
			System.out.println(Friettent.getKlanten() + " klanten bij de Friettent");
			System.out.println(Müeslikraam.getKlanten() + " klanten bij de Müeslikraam");
			System.out.println(Shoarmatent.getKlanten() + " klanten bij de Shoarmatent");
			System.out.println("=====================================");
			System.out.println((Oliebollenkraam.getKlanten() + Friettent.getKlanten() + Müeslikraam.getKlanten()
					+ Shoarmatent.getKlanten()) + " = klanten bij de voedselkraampjes: ");
			break;
		case "OV":
			System.out.println();
			System.out.println(Oliebollenkraam.getOmzet() + " = omzet van de Oliebollenkraam");
			System.out.println(Friettent.getOmzet() + "  = omzet van  de Friettent");
			System.out.println(Müeslikraam.getOmzet() + "  = omzet van de Müeslikraam");
			System.out.println(Shoarmatent.getOmzet() + "  = omzet van de Shoarmatent");
			System.out.println("=====================================");
			System.out.println((Oliebollenkraam.getOmzet() + Friettent.getOmzet() + Müeslikraam.getOmzet()
					+ Shoarmatent.getOmzet()) + " = Totale omzet van de voedselkraampjes.");
			break;
		case "K":
			System.out.println();
			System.out.println(
					(Botsauto.getKlanten() + Spin.getKlanten() + Spiegelpaleis.getKlanten() + Spookhuis.getKlanten()
							+ Hawaii.getKlanten() + Ladderklimmen.getKlanten()) + " = klanten van de attracties.");
			System.out.println((Oliebollenkraam.getKlanten() + Friettent.getKlanten() + Müeslikraam.getKlanten()
					+ Shoarmatent.getKlanten()) + " = klanten bij de voedselkraampjes: ");
			System.out.println("=====================================");
			System.out.println((Oliebollenkraam.getKlanten() + Friettent.getKlanten() + Müeslikraam.getKlanten()
					+ Shoarmatent.getKlanten() + Botsauto.getKlanten() + Spin.getKlanten() + Spiegelpaleis.getKlanten()
					+ Spookhuis.getKlanten() + Hawaii.getKlanten() + Ladderklimmen.getKlanten())
					+ " = Totale aantal klanten van de hele Kermis");
			break;
		case "O":
			System.out.println();
			System.out
					.println("€ "
							+ (Botsauto.getOmzet() + Spin.getOmzet() + Spiegelpaleis.getOmzet() + Spookhuis.getOmzet()
									+ Hawaii.getOmzet() + Ladderklimmen.getOmzet())
							+ "\t = Totale omzet van de attracties");
			System.out.println((Oliebollenkraam.getOmzet() + Friettent.getOmzet() + Müeslikraam.getOmzet()
					+ Shoarmatent.getOmzet()) + " = Totale omzet van de voedselkraampjes.");
			System.out.println("=====================================");
			System.out
					.println(Botsauto.getOmzet() + Spin.getOmzet() + Spiegelpaleis.getOmzet() + Spookhuis.getOmzet()
							+ Hawaii.getOmzet() + Ladderklimmen.getOmzet() + (Oliebollenkraam.getOmzet()
									+ Friettent.getOmzet() + Müeslikraam.getOmzet() + Shoarmatent.getOmzet())
							+ " = Totale omzet van de hele Kermis.");
			break;

		default:
			System.out.println();
			System.out.println("Dit is geen geldige invoer. Probeer het opnieuw.");
			toonCijfers();
		}

	}

}
