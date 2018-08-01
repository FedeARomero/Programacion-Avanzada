package paquete;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

public class FactorialDinamico extends Factorial{
	
	private Map<Integer, BigInteger> factoriales;

	public FactorialDinamico() {
		factoriales = new TreeMap<Integer, BigInteger>();
		factoriales.put( 0, BigInteger.valueOf(1) );
	}
	
	public FactorialDinamico(int numeros) {
		this();
		calcularFactorial(numeros);
	}
	
	@Override
	protected BigInteger calcularFactorial(int n) {
		if( !factoriales.containsKey(n) ) 
			factoriales.put( n, multiplicar(n, calcularFactorial(n-1)));
		
		return factoriales.get(n);
	}
	
	@Override
	public int cantidad() {
		return factoriales.size();
	}
	
	public static void main(String[] args) {
		FactorialDinamico f = new FactorialDinamico(20);

		f.mostrar();
	}
}
