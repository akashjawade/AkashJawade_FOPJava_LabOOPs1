package com.credentialgeneration.service;

import java.util.Random;

public class CredentialService {
	
	
	private static final String DOMAIN_NAME = ".techminds.com";
	private static final String DELIMITTER = "";

	private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMBERS = "1234567890";
	private static final String SPECIAL_CHARS = "!@#$%^&*()_-";
	
	
	
	//-----------------Generate Password--------------------------------------------//
	 
		public static String generatePassword() {

			String pass = UPPER_CASE + LOWER_CASE + NUMBERS + SPECIAL_CHARS;
			Random random = new Random();

			char[] password = new char[8];
			for (int i = 0; i < 8; i++) {
				password[i] = pass.charAt(random.nextInt(pass.length()));
			}
				return String.valueOf(password);
		}
		
	//------------Generation of Email Address--------------------------------------//
		
		public static String generateEmailAddress(String firstName, String lastName, String department) {
			String emailAddress = firstName.toLowerCase() + DELIMITTER + lastName.toLowerCase() + "@" + department + DOMAIN_NAME;
			return emailAddress;
		}
		
	//-------Display the Credentials of the Employee-----------------------------------------------------------------------------//

	public void showCredentials(String firstName,String email,String generatedPwd) {
		
		System.out.println("Dear "+firstName+" your generated credentials are as follows: ");
		System.out.println("Email    ---> "+email);
		System.out.println("Password --->"+ generatedPwd);
		
	}

}
