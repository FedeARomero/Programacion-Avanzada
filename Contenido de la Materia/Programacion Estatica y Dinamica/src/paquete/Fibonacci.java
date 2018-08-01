package paquete;

import java.math.BigInteger;

public abstract class Fibonacci {
	
	protected abstract BigInteger calcularFibonacci(int n);
	
	public abstract int cantidad();
	
	public BigInteger fibonacci(int n) {
		if( n < 0 )
			throw new RuntimeException("No se calcula el fibonacci de valores negativos");
		return calcularFibonacci(n);
	}
	
	protected BigInteger sumar(BigInteger uno, BigInteger dos) {
		return uno.add(dos);
	}
	
	public void mostrar() {
		for (int n = 0; n < cantidad(); n++)
			System.out.println(String.format("f(%3d) = %d", n, calcularFibonacci(n)));
	}
}
