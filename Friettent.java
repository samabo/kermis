package kermis;

import java.util.Scanner;

public class Friettent extends Voedselkraam implements gevaarlijkVoorHartklachten{
	String naam = "De Friettent";
	String product = "friet";
	double prijsPerEenheid = 3.45;
	public static double omzet;
	public static int klanten = 0;
	static Scanner scanner = new Scanner(System.in);

	public void kopen() {
		System.out.println("Welkom bij " + naam + "! Hoeveel porties á €" + prijsPerEenheid + " wil je kopen?");
		invoer = scanner.nextInt();
		double afrekenTotaal = invoer * prijsPerEenheid;
		omzet += invoer * prijsPerEenheid;
		klanten += invoer;

		if (invoer == 0)
			System.out.println(
					"Je hebt je blijkbaar bedacht. Tot de volgende keer!");
		else if (invoer == 1)
			System.out.println("U koopt " + invoer + " portie " + product + ". Dat is dan €" + afrekenTotaal
					+ ".\nEet smakelijk!\n");
		else
			System.out.println("U koopt " + invoer + " porties " + product + ". Dat is in totaal €" + afrekenTotaal
					+ ".\nEet smakelijk!\n");
	}

	public static int getKlanten() {
		return klanten;
	}

	public static double getOmzet() {
		return omzet;
	}
}
