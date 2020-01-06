package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import operaciones.Operaciones;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class OperacionesRestaTest {

	@Test
	public void test0_restarNumerosEnteros() {
		Operaciones operaciones = new Operaciones(20, 5);
		int esperado = 15;
		assertEquals(esperado, operaciones.restar());
		System.out.println("El resultado de la resta es: " + operaciones.restar());
	}

	@Test
	public void test1_restarNumeroNegativo() {
		Operaciones operaciones = new Operaciones(-5, 5);
		int esperado = -10;
		assertEquals(esperado, operaciones.restar());
		System.out.println("El resultado de la resta es: " + operaciones.restar());
	}
	
	@Test
	public void test2_restarNumeroMayorNegativo() {
		Operaciones operaciones = new Operaciones(5, -20);
		int esperado = 25;
		assertEquals(esperado, operaciones.restar());
		System.out.println("El resultado de la resta es: " + operaciones.restar());
	}
}
