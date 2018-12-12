package edu.unca.csci201;

public class PlacateITDepartment {

	static void passwordCheck(String password) throws PasswordTooShort, PasswordNeedsCapitals, PasswordNeedsNumbers, PasswordNeedsSpecialCharacters {
		
		boolean passwordHasCapitals = false;
		int passwordNumbers = 0;
		boolean passwordHasSpecialCharacters = false;
		
		for (int i = 0; i < password.length(); i++) {
			
			char ch = password.charAt(i);
			
			if (Character.isUpperCase(ch)) {
				passwordHasCapitals = true;
				//System.out.print("UCtest");
			}
			if (Character.isDigit(ch)) {
				passwordNumbers ++;
				//System.out.print("Ntest");
			}
			if (Character.isDigit(ch) == false && Character.isLetter(ch)== false){
				passwordHasSpecialCharacters = true;
				//System.out.print("SCtest");
			}
		}
		
		if (password.length() < 10) {
			throw new PasswordTooShort();
		}
		if (passwordHasCapitals == false) {
			throw new PasswordNeedsCapitals();
		}
		if (passwordNumbers < 2) {
			throw new PasswordNeedsNumbers();
		}
		if (passwordHasSpecialCharacters == false) {
			throw new PasswordNeedsSpecialCharacters();
		}
		
	}
}
