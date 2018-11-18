package kermis;

import java.util.Scanner;

public class Botsauto extends Attractie implements gevaarlijkVoorHartklachten{
	String naam = "de Botsauto's";
	static double prijsPerEenheid = 2.5;
	public static int klanten = 0;
	public static double omzet = klanten * prijsPerEenheid;
	static Scanner scanner = new Scanner(System.in);

	public void kopen() {
		System.out.println("Welkom bij " + naam + "! Hoeveel kaartjes á €" + prijsPerEenheid + " wil je kopen?");
		invoer = scanner.nextInt();
		double afrekenTotaal = invoer * prijsPerEenheid;
		omzet += invoer * prijsPerEenheid;
		klanten += invoer;

		if (invoer == 0)
			System.out.println(
					"Je hebt je blijkbaar bedacht. Alleen kijken is ook leuk!");
		else if (invoer == 1)
			System.out.println(
					"U koopt " + invoer + " kaartje voor " + naam + ". Dat is dan €" + afrekenTotaal + ".");
		else
			System.out.println(
					"U koopt " + invoer + " kaartjes voor " + naam + ". Dat is in totaal €" + afrekenTotaal + ".");
	}

	public void draaien() {
		System.out.println(
				"\nHEEEEEERE WE GOOOO!!!! \n~~~~~~~~ 5 minuten later ~~~~~~~~\nOei, dat was bijna een bloedneus!\n");

	}

	public static int getKlanten() {
		return klanten;
	}

	public static double getOmzet() {
		return omzet;
	}

}
