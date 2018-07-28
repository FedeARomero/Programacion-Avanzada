package paquete;

public class GrafoNPartito extends Grafo{
	
	private int grupos;
	
	public GrafoNPartito() {
		
	}
	
	public GrafoNPartito(int nodos, int grupos) throws Exception {
		super(nodos);
		
		if ( nodos < 1 ) throw new Exception("La cantidad (" + nodos + ") de nodos debe ser positiva");
		
		if ( grupos < 1 ) throw new Exception("La cantidad (" + grupos + ") de grupos debe ser positiva");
		
		if ( nodos < grupos ) throw new Exception("La cantidad (" + grupos + ") de grupos no debe ser mayor que la cantidad (" + nodos + ") de nodos");
		
		this.aristas = new Arista[(nodos * nodos - nodos) / 2];
		this.grupos = grupos;
	}

	@Override
	public void generar() {
		this.generarDadoNodoGrupos();
	}

	private void generarDadoNodoGrupos() {
		Nodo[][] grupos = new Nodo[this.grupos][];
		
		int cantidad = this.nodos.length / this.grupos;
		int resto = this.nodos.length % this.grupos;
		int nodo = 0;
		for (int i = 0; i < grupos.length; i++) {
			grupos[i] = new Nodo[cantidad +  (i < this.grupos - resto ? 0 : 1)];
			for (int j = 0; j < grupos[i].length; j++) 
				grupos[i][j] = this.nodos[nodo++];
		}
		
		for (int grupoOrigen = 0; grupoOrigen < grupos.length; grupoOrigen++) 
			for (int grupoDestino = grupoOrigen + 1; grupoDestino < grupos.length; grupoDestino++) 
				for (int nodoOrigen = 0; nodoOrigen < grupos[grupoOrigen].length; nodoOrigen++) 
					for (int nodoDestino = 0; nodoDestino < grupos[grupoDestino].length; nodoDestino++) {
						this.aristas[this.cantidadAristas++] = new Arista(grupos[grupoOrigen][nodoOrigen], grupos[grupoDestino][nodoDestino]);
						this.adycencia.setFC(grupos[grupoOrigen][nodoOrigen].posicion(), grupos[grupoDestino][nodoDestino].posicion(), 1);
					}
	}
}
