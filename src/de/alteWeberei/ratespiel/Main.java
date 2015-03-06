package de.alteWeberei.ratespiel;

/*
 * @author Nico Alt
 */

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String s = "j";
		while (s.equals("j")) {
			Counter.reset();
			int i = Integer
					.parseInt(JOptionPane
							.showInputDialog("Welcome to the \"Ratespiel\". Please enter a number:"));
			int z = (int) (Math.random() * 100);
			while (z != i) {
				Counter.plusOne();
				if (z < i)
					i = Integer
							.parseInt(JOptionPane
									.showInputDialog("Your number is smaller than the given number. Please enter another one:"));

				if (z > i)
					i = Integer
							.parseInt(JOptionPane
									.showInputDialog("Your number is larger than the given number. Please enter another one:"));
			}
			if (!Counter.howMany().equals("1"))
				s = JOptionPane.showInputDialog("Right! (" + Counter.howMany() + " attempts" + ")\nAgain? (j/n)");
			else
				s = JOptionPane.showInputDialog("Right! (" + Counter.howMany() + " attempt" + ")\nAgain? (j/n)");
		}
	}
}