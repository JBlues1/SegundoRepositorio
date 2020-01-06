package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import operaciones.Operaciones;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class OperacionesMultiplicarTest {

	@Test
	public void test0_multiplicarNumerosEnteros() {
		Operaciones operaciones = new Operaciones(20, 20);
		int esperado = 400;
		assertEquals(esperado, operaciones.multiplicar());
		System.out.println("El resultado de la multiplicación es: " + operaciones.multiplicar());
	}

	@Test
	public void test1_multiplicarNumeroNegativo() {
		Operaciones operaciones = new Operaciones(-20, 20);
		int esperado = -400;
		assertEquals(esperado, operaciones.multiplicar());
		System.out.println("El resultado de la multiplicación es: " + operaciones.multiplicar());
	}
	
	@Test
	public void test2_multilplicarNumerosNegativos() {
		Operaciones operaciones = new Operaciones(-20, -20);
		int esperado = 400;
		assertEquals(esperado, operaciones.multiplicar());
		System.out.println("El resultado de la multiplicación es: " + operaciones.multiplicar());
	}
}
