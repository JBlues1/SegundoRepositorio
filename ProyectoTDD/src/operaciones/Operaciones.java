package operaciones;

public class Operaciones {
//	Atributos privados
	private int numero1;
	private int numero2;
	
//	Constructor usando sus campos
	public Operaciones(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	/**
	 * Método de tipo entero que devolverá el resultado de la suma de dos números
	 * @return
	 */
	public int sumar() {
		int resultado;
		resultado = numero1 + numero2;
		return resultado;
	}
	
	
	/**
	 * Método de tipo entero que devolverá el resultado de la resta de dos números
	 * @return
	 */
	public int restar() {
		int resultado;
		resultado = numero1 - numero2;
		return resultado;
	}
	
	/**
	 * Método de tipo entero que devolverá el resultado de la multilplicación de dos números
	 * @return
	 */
	public int multiplicar() {
		int resultado;
		resultado = numero1 * numero2;
		return resultado;
	}
	
	/**
	 * Método de tipo entero que devolverá el resultado de la división de dos números
	 * @return
	 */
	public int dividir() {
		int resultado;
		resultado = numero1 / numero2;
		return resultado;
	}
	
	
}
