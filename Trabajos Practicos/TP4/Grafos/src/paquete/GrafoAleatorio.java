package paquete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GrafoAleatorio extends Grafo{
	
	private double probabilidadArista;
	private boolean dadoPorcentaje;
	
	public GrafoAleatorio() {

	}
	
	public GrafoAleatorio(double probabilidad, int nodos) throws Exception {
		super(nodos);
		
		if( nodos < 1 ) throw new Exception("La cantidad (" + nodos + ") de nodos debe ser positiva");
		
		if( probabilidad < 0 || 1 < probabilidad ) 	throw new Exception("La probabilidad (" + probabilidad + ") debe ser 0 <= p <= 1");
		
		this.probabilidadArista = probabilidad;
		this.aristas = new Arista[(nodos*nodos-nodos)/2];
		this.dadoPorcentaje = false;
	}

	public GrafoAleatorio(int nodos, double porcentaje) throws Exception{
		super(nodos);
		
		if( nodos < 1 ) throw new Exception("La cantidad (" + nodos + ") de nodos debe ser positiva");
		
		if( porcentaje < 0 || 1 < porcentaje ) throw new Exception("El porcentaje de adyacencia (" + porcentaje + ") debe ser 0 <= p <= 1");
		
		int cantAristas = (int) Math.round(porcentaje * ( (nodos * nodos - nodos) / 2) );
		this.aristas = new Arista[cantAristas];
		this.dadoPorcentaje = true;
	}

	@Override
	public void generar() {
		if( this.dadoPorcentaje)
			this.generarAristasAleatorias();
		else
			this.generarDadaProbabilidad();
	}
	
	private void generarDadaProbabilidad() {
		Random rand = new Random();
		
		for (int i = 0; i < nodos.length; i++)
		for (int j = i + 1; j < nodos.length; j++)
			if( rand.nextDouble() <= this.probabilidadArista ) {
				this.aristas[this.cantidadAristas++] = new Arista(this.nodos[i], this.nodos[j], 1);
				this.adycencia.setFC(i, j, 1);
			}
	}
	
	private void generarAristasAleatorias() {
		ArrayList<Arista> aristasTotales = new ArrayList<>();
		
		for (int i = 0; i < nodos.length; i++) 
			for (int j = i+1; j < nodos.length; j++) 
				aristasTotales.add(new Arista(this.nodos[i], this.nodos[j]));
			
		Collections.shuffle(aristasTotales);
		
		for (int i = 0; i < this.aristas.length; i++) {
			this.aristas[i] = aristasTotales.get(i);
			this.adycencia.setFC(this.aristas[i].origen().posicion(), this.aristas[i].destino().posicion(), 1);
		}
		this.cantidadAristas = this.aristas.length;
		aristasTotales.clear();
	}
}
