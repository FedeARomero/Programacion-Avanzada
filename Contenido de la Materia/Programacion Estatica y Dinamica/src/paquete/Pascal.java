package paquete;

import java.math.BigInteger;
import java.util.Arrays;

public abstract class Pascal {

	protected abstract BigInteger calcularCombinatorio(int n, int k);
	
	protected abstract BigInteger[] calcularCombinatorios(int n);
	
	public abstract int cantidad();
	
	public BigInteger combinatorio(int n, int k) {
		if( n < 0 || k < 0 )
			throw new RuntimeException("Ninguno de los valores debe ser negativo");
		return calcularCombinatorio(n, k);
	}
	
	public BigInteger[] combinatorios(int n) {
		if( n < 0)
			throw new RuntimeException("No se calculan los combinatorios de numeros negativos");
		return calcularCombinatorios(n);
	}
	
	protected BigInteger sumar(BigInteger uno, BigInteger dos) {
		return uno.add(dos); 
	}
	
	public void mostrar() {
		for (int i = 0; i < cantidad(); i++)
			System.out.println(String.format("%2d: ", i) + Arrays.toString(calcularCombinatorios(i)));
	}
}
