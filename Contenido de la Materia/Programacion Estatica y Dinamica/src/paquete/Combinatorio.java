package paquete;

import java.math.BigInteger;

public abstract class Combinatorio {

	protected abstract BigInteger calcular(int n, int k);
	
	public abstract int cantidad();
	
	public BigInteger combinatorio(int n, int k) {
		if( n < 0 || k < 0 )
			throw new RuntimeException("Ninguno de los valores debe ser negativo");
		return calcular(n, k);
	}
	
	protected BigInteger sumar(BigInteger uno, BigInteger dos) {
		return uno.add(dos);
	}
	
	public void mostrar() {
		for (int i = 0; i < cantidad(); i++) {
			for (int j = 0; j < cantidad(); j++)
				System.out.print(String.format("| %6d ", calcular(i+j, j)));
			System.out.println("|");
		}
	}
}
