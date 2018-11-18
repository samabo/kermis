package kermis;

import java.util.Scanner;

abstract public class Attractie {
	String naam;
	static double prijsPerEenheid;
	public static int klanten;
	public static double omzet = klanten * prijsPerEenheid;
	static Scanner scanner = new Scanner(System.in);
	int invoer;

	public void kopen() {

	}

}
