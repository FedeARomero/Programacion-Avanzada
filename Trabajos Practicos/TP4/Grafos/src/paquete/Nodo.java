package paquete;

import java.util.Comparator;

public class Nodo implements Comparator<Nodo>{

	private int posicion;
	private int valor;
	private int grado;
	
	public Nodo() {
	}
	
	public Nodo(int posicion, int valor) {
		this.posicion = posicion;
		this.valor = valor;
	}
	
	public Nodo(int valor) {
		this(valor-1,valor);
	}
	
	public int valor() {
		return this.valor;
	}
	
	public int posicion() {
		return this.posicion;
	}
	
	public void setGrado(int g) {
		this.grado = g;
	}
	
	public int getGrado() {
		return this.grado;
	}
	
	public void datos() {
		System.out.println(posicion + ".Nodo [" + valor + "] grado:" + grado);
	}

	@Override
	public String toString() {
		return "Nodo [" + valor + "]";
	}
	
	@Override
	public boolean equals(Object otro) {
		if (this == otro) return true;
		if (otro == null) return false;
		if (getClass() != otro.getClass()) return false;
		
		Nodo nodo = (Nodo) otro;
		
		if (this.posicion != nodo.posicion) return false;
		if (this.valor != nodo.valor) return false;
		
		return true;
	}

	@Override
	public int compare(Nodo uno, Nodo dos) {
		return uno.grado - dos.grado;
	}
	
	public class ComparadorValor implements Comparable<Nodo>, Comparator<Nodo>{
		
		public ComparadorValor() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public int compareTo(Nodo otro) {
			return valor - otro.valor;
		}

		@Override
		public int compare(Nodo uno, Nodo dos) {
			return uno.valor - dos.valor;
		}
	}
	
	public class ComparadorGrado implements Comparable<Nodo>, Comparator<Nodo>{
		
		public ComparadorGrado() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public int compareTo(Nodo otro) {
			return grado - otro.grado;
		}
		
		@Override
		public int compare(Nodo uno, Nodo dos) {
			return uno.grado - dos.grado;
		}
	}
}
