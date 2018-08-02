package paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Analisis {

	private int[] vector;
	
	public void analisisDeOrdenamiento(String salida, int[] cantidades) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter(salida));
		
		System.out.println("Inicio burbujeo");
		out.println(cabecera("burbujeo", cantidades));
		out.println(analisisBurbujeo("ascendente", cantidades));
		out.println(analisisBurbujeo("descendente", cantidades));
		out.println(analisisBurbujeo("random", cantidades));
		
		System.out.println("Inicio insercion");
		out.println(cabecera("insercion", cantidades));
		out.println(analisisInsercion("ascendente", cantidades));
		out.println(analisisInsercion("descendente", cantidades));
		out.println(analisisInsercion("random", cantidades));
		
		System.out.println("Inicio seleccion");
		out.println(cabecera("seleccion", cantidades));
		out.println(analisisSeleccion("ascendente", cantidades));
		out.println(analisisSeleccion("descendente", cantidades));
		out.println(analisisSeleccion("random", cantidades));
		
		out.close();
	}
	
	public String cabecera(String algoritmo, int[] cantidades) {
		String header = algoritmo + "\n" + "archivos";
		
		for (int i = 0; i < cantidades.length; i++)
			header = header.concat(";" + cantidades[i]);
		
		return header;
	}
	
	public String analisisBurbujeo(String orden, int[] cantidades) throws FileNotFoundException {
		String tiempos = orden;
		
		for (int i = 0; i < cantidades.length; i++) {
			cargarDeArchivo(orden + " " + cantidades[i] + ".in");
			System.out.println(orden + " " + cantidades[i] + ".in");
			tiempos = tiempos.concat(";" + burbujeo());
		}
		
		return tiempos;
	}
	
	public String analisisInsercion(String orden, int[] cantidades) throws FileNotFoundException {
		String tiempos = orden;
		
		for (int i = 0; i < cantidades.length; i++) {
			cargarDeArchivo(orden + " " + cantidades[i] + ".in");
			System.out.println(orden + " " + cantidades[i] + ".in");
			tiempos = tiempos.concat(";" + insercion());
		}
		
		return tiempos;
	}
	
	public String analisisSeleccion(String orden, int[] cantidades) throws FileNotFoundException {
		String tiempos = orden;
		
		for (int i = 0; i < cantidades.length; i++) {
			cargarDeArchivo(orden + " " + cantidades[i] + ".in");
			System.out.println(orden + " " + cantidades[i] + ".in");
			tiempos = tiempos.concat(";" + seleccion());
		}
		
		return tiempos;
	}

	public void cargarDeArchivo(String entrada) throws FileNotFoundException {
		Scanner in = new Scanner(new File(entrada));
		vector = new int[in.nextInt()];

		for (int i = 0; i < vector.length; i++)
			vector[i] = in.nextInt();
		in.close();
	}

	public long burbujeo() {
		long inicio = System.currentTimeMillis();
		int k = 0;
		boolean intercambio;
		do {
			intercambio = false;
			k++;

			for (int i = 0; i < vector.length-k; i++)
				if (vector[i] > vector[i + 1]) {
					int aux = vector[i];
					vector[i] = vector[i + 1];
					vector[i + 1] = aux;
					intercambio = true;
				}
		} while (intercambio);
		return System.currentTimeMillis() - inicio;
	}

	public long insercion() {
		long inicio = System.currentTimeMillis();
		for (int i = 1; i < vector.length; i++) {
			int j, extraido = vector[i];

			for (j = i - 1; -1 < j && extraido < vector[j]; j--)
				vector[j + 1] = vector[j];

			vector[j + 1] = extraido;
		}
		return System.currentTimeMillis() - inicio;
	}

	public long seleccion() {
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < vector.length - 1; i++) {
			int posmin = i, aux;
			
			for (int j = i + 1; j < vector.length; j++)
				if ( vector[j] < vector[posmin] )
					posmin = j;
			
			aux = vector[i];
			vector[i] = vector[posmin];
			vector[posmin] = aux;
		}
		return System.currentTimeMillis() - inicio;
	}

	public void verVector() {
		System.out.println(Arrays.toString(vector));
	}

	public static void main(String[] args) {
		
		int[] cant = { 1000, 10000, 25000, 50000, 75000, 100000 };
				
		Analisis analisis = new Analisis();
		try {
			analisis.analisisDeOrdenamiento("analisis.csv", cant);
		} catch (IOException evento) {
			evento.printStackTrace();
		}

	}
}
