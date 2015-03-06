package de.alteWeberei.ratespiel;

/*
 * @author Nico Alt
 */

class Counter {

	private static int attempts = 1;

	protected static void plusOne() {
		attempts += 1;
	}

	protected static String howMany() {
		return String.valueOf(attempts);
	}

	protected static void reset() {
		attempts = 1;
	}
}