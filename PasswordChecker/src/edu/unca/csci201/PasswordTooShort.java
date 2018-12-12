package edu.unca.csci201;

public class PasswordTooShort extends Exception {
	
	private static final long serialVersionUID = 3965341787120548230L;

	public PasswordTooShort() {
		System.out.println("Your password is too short. It needs to be at least 10 characters long. Try again...");
	}

}
