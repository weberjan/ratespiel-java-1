package de.nico.ratespiel;

/*
 * @author Nico Alt
 * 06.03.2015
 */

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String s = "j";
		while (s.equals("j")) {
			Counter.resetVersuche();
			int i = Integer
					.parseInt(JOptionPane
							.showInputDialog("Willkommen zum Ratespiel. Geben Sie eine Zahl ein:"));
			int z = (int) (Math.random() * 100);
			while (z != i) {
				Counter.plusEinVersuch();
				if (z < i)
					i = Integer
							.parseInt(JOptionPane
									.showInputDialog("Deine Zahl ist kleiner als die zufällige Zahl. Bitte geben Sie eine neue Zahl ein:"));

				if (z > i)
					i = Integer
							.parseInt(JOptionPane
									.showInputDialog("Deine Zahl ist größer als die zufällige Zahl. Bitte geben Sie eine neue Zahl ein:"));
			}
			String v;
			if (!Counter.wievieleVersuche().equals("1"))
				v = Counter.wievieleVersuche() + " Versuche";
			else
				v = Counter.wievieleVersuche() + " Versuch";				
			s = JOptionPane.showInputDialog("Richtig! (" + v + ") Nochmal? (j/n)");
		}
	}
}