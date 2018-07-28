package paquete;

public class GrafoRegular extends Grafo {
	
	private int grado;

	public GrafoRegular() {

	}

	public GrafoRegular(int nodos, int grado) throws Exception {
		super(nodos);
		
		if ( nodos < 1 ) throw new Exception("La cantidad (" + nodos + ") de nodos debe ser positiva");

		if ( grado >= nodos ) throw new Exception("El grado (" + grado + ") debe ser menor que la cantidad (" + nodos + ") de nodos");

		if ( nodos % 2 != 0 && grado % 2 != 0 ) throw new Exception("Si la cantidad (" + nodos + ") de nodos es impar el grado (" + grado + ") debe ser par");

		this.grado = grado;
		this.aristas = new Arista[(nodos * this.grado) / 2];
	}
	
	public GrafoRegular(int nodos, double porcentaje) throws Exception {
		super(nodos);
		
		if ( nodos < 1 ) throw new Exception("La cantidad (" + nodos + ") de nodos debe ser positiva");
		
		if( porcentaje < 0 || 1 < porcentaje ) throw new Exception("El porcentaje de adyacencia (" + porcentaje + ") debe ser 0 <= p <= 1");

		int grado = (int) Math.round(porcentaje*(nodos-1));
		
		this.grado = grado + ( nodos % 2 != 0 && grado % 2 != 0 ? 1 : 0);
		this.aristas = new Arista[(nodos * this.grado) / 2];
	}

	@Override
	public void generar() {
		this.generarDadoGrado(this.grado);
	}
	
	private void generarDadoGrado(int g) {
		if (g == 0)
			return;

		if (g == 1) {
			int mitad = this.nodos.length / 2;
			for (int origen = 0; origen < mitad; origen++) {
				int destino = origen + mitad;
				generarArista(origen, destino);
			}
		} else if( g % 2 == 0 ) {
			generarDadoGrado(g-2);
			int offset = g / 2;
			for (int origen = 0; origen < this.nodos.length; origen++) {
				int destino = (origen + offset) % this.nodos.length;
				generarArista(origen, destino);
			}
		} else {
			generarDadoGrado(1);
			generarDadoGrado(g-1);
		}
	}
	
	public void generarArista(int origen, int destino) {
		this.aristas[this.cantidadAristas++] = new Arista(this.nodos[origen], this.nodos[destino]);
		this.adycencia.setFC(this.nodos[origen].posicion(), this.nodos[destino].posicion(), 1);
	}
}
