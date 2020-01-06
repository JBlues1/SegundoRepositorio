package triangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import triangulo.Triangulo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TrianguloTest {

	@Test
	public void test1_trianguloNoExiste() {
		Triangulo tne = new Triangulo(0, 20, 20);
		assertTrue(tne.obtenerTipoTriangulo() == 0);
		System.out.println("Triángulo no existe: 0, 20, 20");
	}
	
	@Test
	public void test2_trianguloEquilatero() {
		Triangulo teq = new Triangulo(20, 20, 20);
		assertTrue(teq.obtenerTipoTriangulo() == 1);
		System.out.println("Triángulo Equilátero: 20, 20, 20");
	}
	
	@Test
	public void test3_trianguloIsosceles() {
		Triangulo tis = new Triangulo(10, 20, 20);
		assertTrue(tis.obtenerTipoTriangulo() == 2);
		System.out.println("Triángulo Isósceles: 10, 20, 20");
	}
	
	@Test
	public void test4_trianguloEscaleno() {
		Triangulo tes = new Triangulo(10, 20, 25);
		assertTrue(tes.obtenerTipoTriangulo() == 3);
		System.out.println("Triángulo Escaleno: 10, 20, 25");
	}

}
