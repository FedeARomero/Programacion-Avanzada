package paquete;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

public class FibonacciDinamico extends Fibonacci{
	
	private Map<Integer, BigInteger> vector = new TreeMap<Integer, BigInteger>();
	
	public FibonacciDinamico() {
		vector.put(0, BigInteger.ZERO);
		vector.put(1, BigInteger.ONE);
	}
	
	public FibonacciDinamico(int numeros) {
		this();
		calcularFibonacci(numeros);
	}
	
	@Override
	protected BigInteger calcularFibonacci(int n) {
		if( !vector.containsKey(n) ) 
			vector.put(n, sumar(calcularFibonacci(n-1), calcularFibonacci(n-2)));
		
		return vector.get(n);
	}

	@Override
	public int cantidad() {
		return vector.size();
	}

	public static void main(String[] args) {

		FibonacciDinamico f = new FibonacciDinamico(35);
		
		System.out.println("Tengo calculado " + f.cantidad() + " numeros de fibonacci");
		f.mostrar();
	}
}
