package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
	public void sumaPositivo() {
		System.out.println("Sumando n�meros positivos...");
		Suma suma = new Suma(2, 3);
		assertTrue(suma.sumar() == 5);
	}
	
	@Test
	public void sumaNegativo() {
		System.out.println("Sumando n�meros negativos...");
		Suma suma = new Suma(-2, -3);
		assertTrue(suma.sumar() == -5);
	}
	
	@Test
	public void sumaNegativoYPositivo() {
		System.out.println("Sumando n�mero negativo y positivo...");
		Suma suma = new Suma(-2, 3);
		assertTrue(suma.sumar() == 1);
	}

}
