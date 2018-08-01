package paquete;

import java.math.BigInteger;

public class FactorialEstatico extends Factorial{

	private BigInteger[] vector;
	
	public FactorialEstatico() {
		this(100);
	}

	public FactorialEstatico(int numeros) {
		vector = new BigInteger[numeros + 1];
		vector[0] = BigInteger.ONE;
		
		for (int n = 1; n < vector.length; n++)
			vector[n] = multiplicar(n, vector[n - 1]);
	}

	@Override
	protected BigInteger calcularFactorial(int n) {
		return vector[n];
	}

	@Override
	public int cantidad() {
		return vector.length;
	}

	public static void main(String[] args) {
		FactorialEstatico f = new FactorialEstatico(20);

		f.mostrar();
	}
}
