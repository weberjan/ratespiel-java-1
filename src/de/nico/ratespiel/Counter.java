package de.nico.ratespiel;

public class Counter {

	static int versuche = 1;

	static void plusEinVersuch() {
		versuche += 1;
	}

	static String wievieleVersuche() {
		return String.valueOf(versuche);
	}

	static void resetVersuche() {
		versuche = 1;
	}

}
