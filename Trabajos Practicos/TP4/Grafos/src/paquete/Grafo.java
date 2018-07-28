package paquete;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public abstract class Grafo {
	
	protected MatrizSimetrica adycencia;
	protected Nodo[] nodos;
	protected Arista[] aristas;
	protected int cantidadAristas;
	private int[] colorDelNodo;
	
	public Grafo() {

	}
	
	public Grafo(int cantidadNodos) {
		this.adycencia = new MatrizSimetrica(cantidadNodos);
		this.nodos = new Nodo[cantidadNodos];
		this.cantidadAristas = 0;
		
		cargarNodos();
	}
	
	/** Metodo que debara implementar cada tipo de Grafo (aleatorio, regular, n-partiro) **/
	public abstract void generar();

	public void grabar(String archivo) throws IOException {
		PrintWriter salida = new PrintWriter(new FileWriter(archivo));
		float porcentajeAdyacencia = (float)(2*this.cantidadAristas) / (this.nodos.length * this.nodos.length - this.nodos.length);
		
		salida.print(this.nodos.length + " " + this.cantidadAristas + " ");
		salida.print(String.format("%.2f ", porcentajeAdyacencia)); 
		salida.print(this.adycencia.gradoMaximo() + " " + this.adycencia.gradoMinimo());
		salida.println();
		
		for (int i = 0; i < aristas.length; i++)
			salida.println(aristas[i].origen().valor() + " " + aristas[i].destino().valor());
		
		salida.close();
	}

	private void cargarNodos() {
		ArrayList<Integer> numero = new ArrayList<>();
		
		for (int i = 1; i <= this.nodos.length; i++)
			numero.add(i);
		
		Collections.shuffle(numero);
		
		for (int i = 0; i < this.nodos.length; i++)
			nodos[i] = new Nodo(numero.get(i));
	}
	
	private void cargarGrados() {
		for (int i = 0; i < nodos.length; i++)
			this.nodos[i].setGrado(this.adycencia.gradoNodo(i));
	}
	
	public int coloreoWelshPowell() {
		cargarGrados();
		
		TreeMap<Integer, ArrayList<Nodo>> listaNodos = new TreeMap<Integer,ArrayList<Nodo>>(Collections.reverseOrder());

		return cargarCola(listaNodos);
	}
	
	public int coloreoMatula() {
		cargarGrados();
		
		TreeMap<Integer, ArrayList<Nodo>> listaNodos = new TreeMap<Integer,ArrayList<Nodo>>();
		
		return cargarCola(listaNodos);
	}
	
	private int cargarCola(TreeMap<Integer, ArrayList<Nodo>> listaNodos) {
		
		for (int i = 0; i < nodos.length; i++) {
			Integer grado = this.nodos[i].getGrado();
			
			if( listaNodos.containsKey(grado) == false )
				listaNodos.put(grado, new ArrayList<Nodo>());
			
			listaNodos.get(grado).add(this.nodos[i]);
		}
		
		Queue<Nodo> colaNodos = new LinkedList<>();
		for (Integer grado : listaNodos.keySet()) {
			ArrayList<Nodo> lista = listaNodos.get(grado);
			Collections.shuffle(lista);
			for (Nodo nodo : lista) 
				colaNodos.add(nodo);
		}
		
		return colorearGrafo(colaNodos);
	}
	
	public int coloreoAleatorio() {
		ArrayList<Nodo> nodosDesordenados = new ArrayList<>();
		
		for (int i = 0; i < nodos.length; i++)
			nodosDesordenados.add(this.nodos[i]);
		
		Collections.shuffle(nodosDesordenados);
		
		Queue<Nodo> monticuloAleaotrio = new LinkedList<>();
		for (Nodo nodo : nodosDesordenados)
			monticuloAleaotrio.add(nodo);
		
		return colorearGrafo(monticuloAleaotrio);
	}
	
	private int colorearGrafo(Queue<Nodo> cola) {
		boolean[] estaColoreado = new boolean[this.nodos.length];
		this.colorDelNodo = new int[this.nodos.length];
		int cantidadColores = 0;
		
		while (!cola.isEmpty()) {
			Nodo siguiente = cola.poll();
			int color = 1;
			int nodo = siguiente.posicion();
			boolean puedoColorear;
			do {
				puedoColorear = true;
				for (int i = 0; i < nodos.length && puedoColorear; i++)
				if( this.adycencia.getFC(nodo, i) != null && estaColoreado[i] == true && this.colorDelNodo[i] == color ) {
					puedoColorear = false;
					color++;
				}
				
			} while (puedoColorear == false);
			
			this.colorDelNodo[nodo] = color;
			estaColoreado[nodo] = true;
			cantidadColores = Math.max(cantidadColores, color);
		}
		
		return cantidadColores;
	}
	
	public void grabarColoreoAleatorio(String archivo) throws IOException {
		grabarColoreo(archivo, coloreoAleatorio());
	}
	
	public void grabarColoreoWelshPowell(String archivo) throws IOException {
		grabarColoreo(archivo, coloreoWelshPowell());
	}
	
	public void grabarColoreoMatula(String archivo) throws IOException {
		grabarColoreo(archivo, coloreoMatula());
	}
	
	private void grabarColoreo(String archivo, int cantidadColores) throws IOException {
		PrintWriter salida = new PrintWriter(new FileWriter(archivo));
		float porcentajeAdyacencia = (float)(2*this.cantidadAristas) / (this.nodos.length * this.nodos.length - this.nodos.length);
		
		salida.print(this.nodos.length + " " + cantidadColores +  " " + this.cantidadAristas + " ");
		salida.print(String.format("%.2f ", porcentajeAdyacencia));
		salida.print(this.adycencia.gradoMaximo() + " " + this.adycencia.gradoMinimo());
		salida.println();
		
		for (int i = 0; i < nodos.length; i++)
			salida.println(this.nodos[i].valor() + " " + colorDelNodo[this.nodos[i].posicion()]);
		
		salida.close();
	}
	
	public int cantidadNodos() {
		return this.nodos.length;
	}
	
	public void mostrarNodos() {
		System.out.println("Nodos:");
		for (int i = 0; i < this.nodos.length; i++)
			System.out.println(nodos[i]);
	}
	
	public void mostrarAristas() {
		System.out.println("Aristas:");
		for (int i = 0; i < this.cantidadAristas; i++)
			System.out.println(aristas[i]);
	}
	
	public void mostrarAdyacencia() {
		this.adycencia.verMatrizSimetrica();
	}
}
