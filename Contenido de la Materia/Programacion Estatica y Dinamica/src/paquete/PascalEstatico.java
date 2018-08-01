package paquete;

import java.math.BigInteger;

public class PascalEstatico extends Pascal{

	private BigInteger[][] vector;
	
	public PascalEstatico() {
		this(20);
	}

	public PascalEstatico(int n) {
		vector = new BigInteger[n + 1][];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = new BigInteger[i + 1];
			vector[i][0] = vector[i][i] = BigInteger.ONE;
		}

		for (int i = 2; i < vector.length; i++) {
			vector[i][1] = vector[i][i - 1] = BigInteger.valueOf(i);

			for (int j = 2; j <= i / 2; j++)
				vector[i][j] = vector[i][i - j] = sumar(vector[i - 1][j - 1], vector[i - 1][j]);
		} 
	}
	
	@Override
	protected BigInteger calcularCombinatorio(int n, int k) {
		return vector[n][k];
	}

	@Override
	protected BigInteger[] calcularCombinatorios(int n) {
		return vector[n];
	}
	
	@Override
	public int cantidad() {
		return vector.length;
	}

	public static void main(String[] args) {

		PascalEstatico pascal = new PascalEstatico(20);

		pascal.mostrar();
	}
}
