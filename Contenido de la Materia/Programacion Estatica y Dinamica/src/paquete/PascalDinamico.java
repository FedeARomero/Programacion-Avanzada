package paquete;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

public class PascalDinamico extends Pascal{
	
	private Map<Integer, BigInteger[]> pascal;
	
	public PascalDinamico() {
		pascal = new TreeMap<Integer, BigInteger[]>();
		BigInteger[] vector =  { BigInteger.ONE };
		pascal.put(0, vector);
	}
	
	public PascalDinamico(int numeros) {
		this();
		calcularCombinatorios(numeros);
	}
	
	@Override
	protected BigInteger calcularCombinatorio(int n, int k) {
		BigInteger[] vector = pascal.containsKey(n) ? pascal.get(n) : calcularCombinatorios(n);
		
		return vector[k];
	}
	
	@Override
	protected BigInteger[] calcularCombinatorios(int n) {
		if( pascal.containsKey(n) )
			return pascal.get(n);
		
		BigInteger[] vector = pascal.containsKey(n-1) ? pascal.get(n-1) : calcularCombinatorios(n-1);
		BigInteger[] vecpas = new BigInteger[n+1];
		
		vecpas[0] = vecpas[n  ] = BigInteger.ONE;
		vecpas[1] = vecpas[n-1] = BigInteger.valueOf(n);
		
		for (int i = 2; i <= n/2; i++)
			vecpas[i] = vecpas[n-i] = sumar(vector[i-1], vector[i]);
		
		pascal.put(n, vecpas);
		
		return vecpas;
	}
	
	@Override
	public int cantidad() {
		return pascal.size();
	}

	public static void main(String[] args) {

		PascalDinamico pascal = new PascalDinamico(20);
		
		pascal.mostrar();
		
	}
}
