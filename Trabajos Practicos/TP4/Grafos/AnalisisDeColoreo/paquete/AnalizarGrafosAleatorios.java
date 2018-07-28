package paquete;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class AnalizarGrafosAleatorios {

	private int ejecuciones;
	private int[] coloresAleatorio;
	private int[] coloresMatula;
	private int[] coloresWelshPowell;
	private GrafoDeArchivo grafo;
	
	public AnalizarGrafosAleatorios(String entrada, int cantEjecuciones) throws FileNotFoundException {

		this.ejecuciones = cantEjecuciones;
		this.grafo = new GrafoDeArchivo(entrada);
		int nodos = grafo.cantidadNodos();
		
		this.coloresMatula = new int[nodos];
		this.coloresAleatorio = new int[nodos];
		this.coloresWelshPowell = new int[nodos];
		
		Arrays.fill(coloresMatula, 0);
		Arrays.fill(coloresAleatorio, 0);
		Arrays.fill(coloresWelshPowell, 0);
	
	}
	
	public void analizar(String salida) throws IOException {
		PrintWriter archivoCSV = new PrintWriter(new FileWriter(salida));

		for (int i = 0; i < ejecuciones; i++) {
			this.coloresMatula[this.grafo.coloreoMatula()-1]++;
			this.coloresAleatorio[this.grafo.coloreoAleatorio()-1]++;
			this.coloresWelshPowell[this.grafo.coloreoWelshPowell()-1]++;
			
			if( (i+1) % 10 == 0 )
				System.out.println("Ejecucion " + (i+1));
			
		}
		System.out.println("Fin de las ejecuciones.");
		
		int minimo = -1, maximo = -1;
		
		for (int i = 0; i < grafo.cantidadNodos() && minimo == -1; i++) 
			if( this.coloresMatula[i] != 0 || this.coloresAleatorio[i] != 0 || this.coloresWelshPowell[i] != 0 )
				minimo = i;
		
		for (int i = grafo.cantidadNodos()-1; -1 < i && maximo == -1; i--) 
			if( this.coloresMatula[i] != 0 || this.coloresAleatorio[i] != 0 || this.coloresWelshPowell[i] != 0 )
				maximo = i;
		
		archivoCSV.println("Cantidad;Matula;Aleatorio;WelshPowell");
		for (int i = minimo; i < maximo+1; i++)
			archivoCSV.println(String.format("%d;%d;%d;%d", i+1,this.coloresMatula[i],this.coloresAleatorio[i],this.coloresWelshPowell[i]));
		
		archivoCSV.close();
	}

	public static void main(String[] args) throws IOException {
		
		String[] aleatorios = {
				"grafos\\aleatorio40",
				"grafos\\aleatorio60",
				"grafos\\aleatorio90",
		};
		
		for (int i = 0; i < aleatorios.length; i++) {
			System.out.println(aleatorios[i]);
			AnalizarGrafosAleatorios analisis = new AnalizarGrafosAleatorios(aleatorios[i] + ".in",10000);
			analisis.analizar(aleatorios[i] + ".csv");
			System.out.println();
		}
	}
}
