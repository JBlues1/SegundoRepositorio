package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YearUtilitiesTest {

	@Test
	public void test1() {
		assertTrue(YearUtilities.isLeap(4));
	}
	
	@Test
	public void test2() {
		assertFalse(YearUtilities.isLeap(6));
	}
	
	@Test
	public void test3() {
		assertFalse(YearUtilities.isLeap(100));
	}
	
	@Test
	public void test4() {
		assertTrue(YearUtilities.isLeap(400));
	}
}
