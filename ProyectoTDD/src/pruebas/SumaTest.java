package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
	public void sumaPositivo() {
		System.out.println("Sumando números positivos...");
		Suma suma = new Suma(2, 3);
		assertTrue(suma.sumar() == 5);
	}
	
	@Test
	public void sumaNegativo() {
		System.out.println("Sumando números negativos...");
		Suma suma = new Suma(-2, -3);
		assertTrue(suma.sumar() == -5);
	}
	
	@Test
	public void sumaNegativoYPositivo() {
		System.out.println("Sumando número negativo y positivo...");
		Suma suma = new Suma(-2, 3);
		assertTrue(suma.sumar() == 1);
	}

}
