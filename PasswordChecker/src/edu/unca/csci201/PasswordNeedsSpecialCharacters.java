package edu.unca.csci201;

public class PasswordNeedsSpecialCharacters extends Exception {

	private static final long serialVersionUID = -4962776309341500259L;
	public PasswordNeedsSpecialCharacters() {
		System.out.println("Your password needs at least one special character ( !@#$%^&*()-_+= ). Try again...");
	}
}
