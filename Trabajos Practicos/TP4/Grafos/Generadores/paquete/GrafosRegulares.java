package paquete;

public class GrafosRegulares {

	public static void main(String[] args) throws Exception {
		
		GrafoRegular grafoUno = new GrafoRegular(5, 2);
		grafoUno.generar();
		grafoUno.mostrarNodos();
		grafoUno.mostrarAristas();
		grafoUno.mostrarAdyacencia();
		
		GrafoRegular grafoDos = new GrafoRegular(6, 2);
		grafoDos.generar();
		grafoDos.mostrarNodos();
		grafoDos.mostrarAristas();
		grafoDos.mostrarAdyacencia();
	}

}
