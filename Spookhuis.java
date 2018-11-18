package kermis;

import java.util.Scanner;

public class Spookhuis extends Attractie implements gevaarlijkVoorHartklachten {
	String naam = "het Spookhuis";
	static double prijsPerEenheid = 3.20;
	public static int klanten = 0;
	public static double omzet;
	static Scanner scanner = new Scanner(System.in);

	public void kopen() {
		System.out.println("Welkom bij " + naam + "! Hoeveel kaartjes á €" + prijsPerEenheid + " wil je kopen?");
		invoer = scanner.nextInt();
		double afrekenTotaal = invoer * prijsPerEenheid;
		omzet += invoer * prijsPerEenheid;
		klanten += invoer;

		if (invoer == 0)
			System.out.println(
					"Je hebt je blijkbaar bedacht. Je vrienden komen vanzelf weer naar buiten. Als het goed is...");
		else if (invoer == 1)
			System.out.println("U koopt " + invoer + " kaartje voor " + naam + ". Dat is dan €" + afrekenTotaal + ".");
		else
			System.out.println(
					"U koopt " + invoer + " kaartjes voor " + naam + ". Dat is in totaal €" + afrekenTotaal + ".");
	}

	public void draaien() {
		System.out.println(
				"\nBen je er klaar voor? \n ~~~~~~~~ 5 minuten later ~~~~~~~~\nEen lekker spannend ritje gegriezeld, dat was eng he?\n");
	}

	public static int getKlanten() {
		return klanten;
	}

	public static double getOmzet() {
		return omzet;
	}
}