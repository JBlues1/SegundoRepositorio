package triangulo;

public class Triangulo {
//	Atributos privados
	private int ladoA;
	private int ladoB;
	private int ladoC;
	
//	Constructor usando sus campos
	public Triangulo(int ladoA, int ladoB, int ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
//	Método booleano para validar el triángulo.
	public boolean validarTriangulo() {
		if ((ladoA < (ladoB + ladoC)) && ladoA > Math.abs(ladoB - ladoC)) {
			if ((ladoB < (ladoA + ladoC)) && ladoB > Math.abs(ladoA - ladoC)) {
				if ((ladoC < (ladoA + ladoB)) && ladoC > Math.abs(ladoA - ladoB)) {
					return true;
				}
			}
		}
		return false;
	}
	
//	Método de tipo entero para obtener el tipo de triángulo
	public int obtenerTipoTriangulo() {
		if (!validarTriangulo()) {
			return 0;
		} else if (ladoA == ladoB && ladoB == ladoC) {
			return 1;
		} else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
			return 2;
		} else if (ladoA != ladoB || ladoB != ladoC || ladoC != ladoA) {
			return 3;
		} else
			return 0;
	}
}
