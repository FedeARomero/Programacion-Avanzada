package paquete;

import java.util.Arrays;

public class MatrizSimetrica {
	
	private Integer[] vector;
	private int nodos;
	
	public MatrizSimetrica(int cantidadNodos) {
		this.nodos = cantidadNodos;
		int tamanio = (cantidadNodos * cantidadNodos - cantidadNodos) / 2;
		vector = new Integer[tamanio];
	}

	public void setFC(int fila, int columna, int valor) {
		if( fila == columna )
			return;
		
		int indice;
		
		if( fila > columna ) {
			indice = fila; fila = columna; columna = indice;
		}
		
		indice = fila * this.nodos + columna - (fila * fila + 3 * fila + 2) / 2;
		this.vector[indice] = valor;
	}
	
	public Integer getFC(int fila, int columna) {
		if( fila == columna )
			return null;
		
		if( fila > columna )
			return getFC(columna, fila);
		
		int indice = fila * this.nodos + columna - (fila * fila + 3 * fila + 2) / 2;
		return this.vector[indice];
	}
	
	public void verMatrizSimetrica() {
		System.out.println("Matriz simetrica");
		for (int i = 0; i < this.nodos; i++) {
			for (int j = 0; j < this.nodos; j++)
				System.out.print(String.format("%-2s ", getFC(i, j) == null ? "-" : String.valueOf(getFC(i, j))));
			System.out.println();
		}
	}
	
	public Integer gradoMaximo() {
		int maximo = 0;
		
		for (int i = 0; i < this.nodos; i++) {
			int grado = 0;
			for (int j = 0; j < this.nodos; j++)
				if( getFC(i, j) != null )
					grado++;
			maximo = Math.max(maximo, grado);
		}
		
		return maximo;
	}
	
	public Integer gradoMinimo() {
		int minimo = this.nodos-1;
		
		for (int i = 0; i < this.nodos; i++) {
			int grado = 0;
			for (int j = 0; j < this.nodos; j++)
				if( getFC(i, j) != null )
					grado++;
			minimo = Math.min(minimo, grado);
		}
		
		return minimo;
	}
	
	public int gradoNodo(int nodo) {
		int grado = 0;
		
		for (int i = 0; i < this.nodos; i++)
			if( getFC(nodo, i) != null )
				grado++;
		
		return grado;
	}
	
	@Override
	public String toString() {
		return "MatrizSimetrica " + Arrays.toString(vector);
	}

	
}
