package paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProbadorDeColoreo {
	
	private Scanner in;
	private Scanner out;

	public boolean verificarColoreo(String entrada, String salida) throws FileNotFoundException {
		in = new Scanner(new File(entrada));
		out = new Scanner(new File(salida));

		String[] linea = out.nextLine().split(" ");
		int cantidadNodos = Integer.parseInt(linea[0]);
		int[] coloreo = new int[cantidadNodos];
		boolean[] fueColoreado = new boolean[cantidadNodos];

		int nodosColoreados = 0;
		
		while (out.hasNextInt()) {
			int nodo = out.nextInt()-1;
			int color = out.nextInt();

			if (fueColoreado[nodo] == false) {
				fueColoreado[nodo] = true;
				coloreo[nodo] = color;
				nodosColoreados++;
			} else {
				System.out.println("Nodo coloreado mas de una vez");

				closeScanners();
				return false;
			}
		}

		if (nodosColoreados !=  cantidadNodos) {
			System.out.println("No fueron coloreados todos los nodos");
			
			closeScanners();
			return false;
		}

		linea = in.nextLine().split(" ");
		int cantidadAristas = Integer.parseInt(linea[1]);
		boolean coloreoCorrecto = true;
		
		for (int i = 0; i < cantidadAristas && coloreoCorrecto; i++) {
			int origen = in.nextInt()-1;
			int destino = in.nextInt()-1;
			
			if( coloreo[origen] == coloreo[destino] )
				coloreoCorrecto = false;
		}
		
		if(coloreoCorrecto == false)
			System.out.println("Dos nodos adyacentes tienen el mismo color");
		
		closeScanners();
		return coloreoCorrecto;
	}
	
	private void closeScanners() {
		this.in.close();
		this.out.close();
	}

}
