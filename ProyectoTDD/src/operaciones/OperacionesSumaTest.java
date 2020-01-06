package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Operaciones;

class OperacionesSumaTest {

	@Test
	public void test0_sumarNumerosEnteros() {
		Operaciones operaciones = new Operaciones(2, 2);
		int esperado = 4;
		assertEquals(esperado, operaciones.sumar());
		System.out.println("El resultado de la suma es: " + operaciones.sumar());
	}
	
	@Test
	public void test1_sumarNumeroMayorNegativo() {
		Operaciones operaciones = new Operaciones(-5, 4);
		int esperado = -1;
		assertEquals(esperado, operaciones.sumar());
		System.out.println("El resultado de la suma es: " + operaciones.sumar());
	}
	
	@Test
	public void test2_sumarNumeroMayorPostivo() {
		Operaciones operaciones = new Operaciones(-5, 6);
		int esperado = 1;
		assertEquals(esperado, operaciones.sumar());
		System.out.println("El resultado de la suma es: " + operaciones.sumar());
	}
	
	@Test
	public void test3_sumarNumerosNegativos() {
		Operaciones operaciones = new Operaciones(-5, -5);
		int esperado = -10;
		assertEquals(esperado, operaciones.sumar());
		System.out.println("El resultado de la suma es: " + operaciones.sumar());
	}

}
