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
	 * M�todo de tipo entero que devolver� el resultado de la suma de dos n�meros
	 * @return
	 */
	public int sumar() {
		int resultado;
		resultado = numero1 + numero2;
		return resultado;
	}
	
	
	/**
	 * M�todo de tipo entero que devolver� el resultado de la resta de dos n�meros
	 * @return
	 */
	public int restar() {
		int resultado;
		resultado = numero1 - numero2;
		return resultado;
	}
	
	/**
	 * M�todo de tipo entero que devolver� el resultado de la multilplicaci�n de dos n�meros
	 * @return
	 */
	public int multiplicar() {
		int resultado;
		resultado = numero1 * numero2;
		return resultado;
	}
	
	/**
	 * M�todo de tipo entero que devolver� el resultado de la divisi�n de dos n�meros
	 * @return
	 */
	public int dividir() {
		int resultado;
		resultado = numero1 / numero2;
		return resultado;
	}
	
	
}
