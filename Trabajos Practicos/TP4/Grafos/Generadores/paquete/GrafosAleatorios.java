package paquete;

public class GrafosAleatorios {

	public static void main(String[] args) throws Exception {
		
		GrafoAleatorio grafoUno = new GrafoAleatorio(6, 0.6);
		grafoUno.generar();
		grafoUno.mostrarNodos();
		grafoUno.mostrarAristas();
		grafoUno.mostrarAdyacencia();
		
		GrafoAleatorio grafoDos = new GrafoAleatorio(4, 0.5);
		grafoDos.generar();
		grafoDos.mostrarNodos();
		grafoDos.mostrarAristas();
		grafoDos.mostrarAdyacencia();
	}
}
