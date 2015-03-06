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
			int i = Integer
					.parseInt(JOptionPane
							.showInputDialog("Willkommen zum Ratespiel. Geben Sie eine Zahl ein:"));
			int z = (int) (Math.random() * 100);
			while (z != i) {
				if (z < i)
					i = Integer
							.parseInt(JOptionPane
									.showInputDialog("Deine Zahl ist kleiner als die zufällige Zahl. Bitte geben Sie eine neue Zahl ein:"));

				if (z > i)
					i = Integer
							.parseInt(JOptionPane
									.showInputDialog("Deine Zahl ist größer als die zufällige Zahl. Bitte geben Sie eine neue Zahl ein:"));
			}
			s = JOptionPane.showInputDialog("Richtig! Nochmal? (j/n)");
		}
	}
}