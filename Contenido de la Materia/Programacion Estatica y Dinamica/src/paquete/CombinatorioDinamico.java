package paquete;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CombinatorioDinamico extends Combinatorio {

	private Map<Integer, ArrayList<BigInteger>> combiantorio;

	public CombinatorioDinamico() {
		combiantorio = new TreeMap<Integer, ArrayList<BigInteger>>();
		ArrayList<BigInteger> lista = new ArrayList<BigInteger>();
		lista.add(BigInteger.ONE);
		combiantorio.put(0, lista);
	}
	
	public CombinatorioDinamico(int numeros) {
		this();
		calcular(2*numeros, numeros);
	}

	@Override
	protected BigInteger calcular(int n, int k) {
		if (n / 2 < k)
			return calcular(n, n - k);

		if (!combiantorio.containsKey(n - k)) {
			ArrayList<BigInteger> lista = new ArrayList<BigInteger>();
			lista.add(BigInteger.ONE);
			lista.add(BigInteger.valueOf(n-k+1));
			combiantorio.put(n-k, lista);
		}
		
		ArrayList<BigInteger> lista = combiantorio.get(n - k);
		
		if( lista.size() - 1 < k ) {
			BigInteger uno, dos;
			uno = calcular(n-1, k-1);
			dos = (n == 2 * k) ? calcular(n-1, k-1) : calcular(n-1, k);
			lista.add(sumar(uno, dos));
		}
		
		return lista.get(k);
	}

	@Override
	public int cantidad() {
		return combiantorio.values().toArray().length;
	}
	
	public void verListas() {
		for (Integer n : combiantorio.keySet()) {
			ArrayList<BigInteger> lista = combiantorio.get(n);
			System.out.println(String.format("%3d: ", n) + lista);
		}
	}

	public static void main(String[] args) {

		CombinatorioDinamico c = new CombinatorioDinamico();
		c.mostrar();
		
		System.out.println(c.calcular(20,10));
		c.mostrar();
	}
}
