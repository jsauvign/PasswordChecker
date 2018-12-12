package edu.unca.csci201;
import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		boolean x = true;
		do {
		System.out.println("Please enter a password: ");
		String password = input.nextLine();
		try {
			PlacateITDepartment.passwordCheck(password);
			System.out.print("Congrats! This is a good password!");
			x = false;
		} 
		catch (PasswordTooShort|PasswordNeedsCapitals|PasswordNeedsNumbers|PasswordNeedsSpecialCharacters a) {
		} 
		}while(x);
	}
	

}
