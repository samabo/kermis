package kermis;

import java.util.Scanner;

public class Ladderklimmen extends Attractie {
	String naam = "het Ladderklimmen";
	static double prijsPerEenheid = 5;
	public static int klanten = 0;
	public static double omzet = klanten * prijsPerEenheid;
	static Scanner scanner = new Scanner(System.in);

	public void kopen() {
		System.out.println("Welkom bij " + naam + "! Hoeveel kaartjes á €" + prijsPerEenheid + " wil je kopen?");
		invoer = scanner.nextInt();
		double afrekenTotaal = invoer * prijsPerEenheid;
		omzet += afrekenTotaal;
		klanten += invoer;

		if (invoer == 0)
			System.out.println("Je hebt je blijkbaar bedacht. Alleen kijken is ook leuk!");
		else if (invoer == 1)
			System.out.println("U koopt " + invoer + " kaartje voor " + naam + ". Dat is dan €" + afrekenTotaal + ".");
		else
			System.out.println(
					"U koopt " + invoer + " kaartjes voor " + naam + ". Dat is in totaal €" + afrekenTotaal + ".");
	}

	public void draaien() {
		System.out.println(
				"Het kost wat, maar dan heb je ook wat. \n~~~~~~~~ 5 minuten later ~~~~~~~~ \nGelukt! Je hebt een grote pluchen bal gewonnen!\n");
	}

	public static int getKlanten() {
		return klanten;
	}

	public static double getOmzet() {
		return omzet;
	}
}