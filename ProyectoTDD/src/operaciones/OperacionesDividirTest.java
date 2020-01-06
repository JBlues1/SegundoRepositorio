package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import operaciones.Operaciones;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class OperacionesDividirTest {
	
	@Test
	public void test0_dividirNumerosEnteros() {
		Operaciones operaciones = new Operaciones(20, 2);
		int esperado = 10;
		assertEquals(esperado, operaciones.dividir());
		System.out.println("El resultado de la división es: " + operaciones.dividir());
	}
	
}
