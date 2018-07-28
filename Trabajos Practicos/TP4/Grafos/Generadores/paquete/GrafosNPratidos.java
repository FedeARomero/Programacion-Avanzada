package paquete;

public class GrafosNPratidos {

	public static void main(String[] args) throws Exception {

		GrafoNPartito grafoUno = new GrafoNPartito(6, 3);
		grafoUno.generar();
		grafoUno.mostrarNodos();
		grafoUno.mostrarAristas();
		grafoUno.mostrarAdyacencia();
		
		GrafoNPartito grafoDos = new GrafoNPartito(6, 3);
		grafoDos.generar();
		grafoDos.mostrarNodos();
		grafoDos.mostrarAristas();
		grafoDos.mostrarAdyacencia();
	}

}
