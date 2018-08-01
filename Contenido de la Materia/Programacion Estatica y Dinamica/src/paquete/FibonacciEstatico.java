package paquete;

import java.math.BigInteger;

public class FibonacciEstatico extends Fibonacci{

	private BigInteger[] vector;
	
	public FibonacciEstatico() {
		this(100);
	}

	public FibonacciEstatico(int numeros) {
		vector = new BigInteger[numeros+1];
		vector[0] = BigInteger.ZERO;
		vector[1] = BigInteger.ONE;
		for (int n = 2; n < vector.length; n++)
			vector[n] = sumar(vector[n - 1], vector[n - 2]);
	}

	@Override
	protected BigInteger calcularFibonacci(int n) {
		return vector[n];
	}
	
	public int cantidad() {
		return vector.length;
	}

	public static void main(String[] args) {
		
		FibonacciEstatico f = new FibonacciEstatico(35);
		
		System.out.println("Tengo calculado " + f.cantidad() + " numeros de fibonacci");
		f.mostrar();
	}
}
