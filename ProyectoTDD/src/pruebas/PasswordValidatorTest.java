package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

	@Test
	public void testValidLength() {
		assertEquals(true, PasswordValidator.isValid("Abcd123"));
	}
	
	@Test
	public void testNoDigit() {
		assertEquals(false, PasswordValidator.isValid("Abcdefg"));
	}
	
	@Test
	public void testNotUpperCase() {
		assertEquals(false, PasswordValidator.isValid("abcdef1"));
	}

}
