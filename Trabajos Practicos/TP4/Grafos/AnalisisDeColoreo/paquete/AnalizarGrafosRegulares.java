package paquete;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class AnalizarGrafosRegulares {

	private int ejecuciones;
	private int[] coloresAleatorio;
	private GrafoDeArchivo grafo;
	
	public AnalizarGrafosRegulares(String entrada, int cantEjecuciones) throws FileNotFoundException {

		this.ejecuciones = cantEjecuciones;
		this.grafo = new GrafoDeArchivo(entrada);
		int nodos = grafo.cantidadNodos();
		
		this.coloresAleatorio = new int[nodos];
		
		Arrays.fill(coloresAleatorio, 0);
	}
	
	public void analizar(String salida) throws IOException {
		PrintWriter archivoCSV = new PrintWriter(new FileWriter(salida));

		for (int i = 0; i < ejecuciones; i++) {
			this.coloresAleatorio[this.grafo.coloreoAleatorio()-1]++;
			
			if( (i+1) % 100 == 0 )
				System.out.println("Ejecucion " + (i+1));
		}
		System.out.println("Fin de las ejecuciones.");
		
		int minimo = -1, maximo = -1;
		
		for (int i = 0; i < grafo.cantidadNodos() && minimo == -1; i++) 
			if( this.coloresAleatorio[i] != 0 )
				minimo = i;
		
		for (int i = grafo.cantidadNodos()-1; -1 < i && maximo == -1; i--) 
			if( this.coloresAleatorio[i] != 0 )
				maximo = i;
		
		archivoCSV.println("Cantidad;Aleatorio");
		for (int i = minimo; i < maximo+1; i++)
			archivoCSV.println(String.format("%d;%d", i+1, this.coloresAleatorio[i]));
		
		archivoCSV.close();
	}

	public static void main(String[] args) throws IOException {
		
		String[] regulares = {
				"grafos\\regular50",
				"grafos\\regular75"
		};
		
		for (int i = 0; i < regulares.length; i++) {
			System.out.println();
			System.out.println(regulares[i]);
			AnalizarGrafosRegulares analisis = new AnalizarGrafosRegulares(regulares[i] + ".in",1000);
			long tini = System.currentTimeMillis();
			analisis.analizar(regulares[i] + ".csv");
			long tiempo = System.currentTimeMillis() - tini;
			System.out.println("Tiempo: " + ((tiempo/1000.0)/60.0) + " min.");
		}
	}

}
