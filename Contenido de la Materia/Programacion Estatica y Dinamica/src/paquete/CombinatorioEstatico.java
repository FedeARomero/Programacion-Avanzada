package paquete;

import java.math.BigInteger;
import java.util.Arrays;

public class CombinatorioEstatico extends Combinatorio{

	private BigInteger[][] matriz;
	
	public CombinatorioEstatico() {
		this(10);
	}
	
	public CombinatorioEstatico(int numeros) {
		this.matriz = new BigInteger[numeros+1][];
		matriz[0] = new BigInteger[1];
		matriz[0][0] = BigInteger.ONE;
		
		for (int i = 1; i < matriz.length; i++) {
			matriz[i] = new BigInteger[i+1];
			matriz[i][0] = BigInteger.ONE;
			for (int j = 1; j < matriz[i].length-1; j++)
				matriz[i][j] = matriz[i][j-1].add(matriz[i-1][j]);
			
			matriz[i][i] = matriz[i][i-1].add(matriz[i][i-1]);
		}
	}
	
	@Override
	protected BigInteger calcular(int n, int k) {
		if( n/2 < k )
			return calcular(n, n-k);
		return matriz[n-k][k];
	}
	
	@Override	
	public int cantidad() {
		return matriz.length;
	}
	
	public void verVectores() {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}

	public static void main(String[] args) {
		
		CombinatorioEstatico c = new CombinatorioEstatico();

		System.out.println(c.calcular(20,10));
		c.mostrar();
	}
}
