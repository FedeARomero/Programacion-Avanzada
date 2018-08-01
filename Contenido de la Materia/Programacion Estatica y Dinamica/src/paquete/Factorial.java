package paquete;

import java.math.BigInteger;

public abstract class Factorial {
	
	protected abstract BigInteger calcularFactorial(int n);
	
	public abstract int cantidad();
	
	public BigInteger factorial(int n) {
		if( n < 0 )
			throw new RuntimeException("No se calcula el factorial de numeros negativos");
		return calcularFactorial(n);
	}

	protected BigInteger multiplicar(int i, BigInteger dos) {
		return dos.multiply(BigInteger.valueOf(i));
	}

	public void mostrar() {
		for (int n = 0; n < cantidad(); n++)
			System.out.println(String.format("%3d! = %d", n, calcularFactorial(n)));
	}
}

