package pruebas;

import java.util.regex.Pattern;

public class PasswordValidator {
	private static final int MIN_PWD_LENGTH= 7;
	private static final int MAX_PWD_LENGTH = 10;
	
	public static boolean isValid(String password) {
		return (password.length()>=MIN_PWD_LENGTH 
				&& password.length()<=MAX_PWD_LENGTH) 
				&& Pattern.matches(".*\\p{Digit}.*",password)
				&& password.toLowerCase()!=password;
	}
}
