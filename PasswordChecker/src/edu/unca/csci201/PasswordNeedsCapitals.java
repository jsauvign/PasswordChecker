package edu.unca.csci201;

public class PasswordNeedsCapitals extends Exception {

	private static final long serialVersionUID = 2649907402354448071L;
	public PasswordNeedsCapitals() {
		System.out.println("Your password at least one capital letter. Try again...");
	}
}
