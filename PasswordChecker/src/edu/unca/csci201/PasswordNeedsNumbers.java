package edu.unca.csci201;

public class PasswordNeedsNumbers extends Exception {

	private static final long serialVersionUID = 7716101856462927824L;
	public PasswordNeedsNumbers() {
		System.out.println("Your password needs at least 2 numbers. Try again...");
	}
}
