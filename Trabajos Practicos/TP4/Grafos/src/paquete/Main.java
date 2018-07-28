package paquete;

public class Main {

	public static void main(String[] args) throws Exception {
		
		GrafoAleatorio grafo = new GrafoAleatorio(10, 0.6);
		grafo.generar();
//		grafo.mostrarNodos();
//		grafo.mostrarAristas();
//		grafo.coloreoAleatorio();
		System.out.println("Matula");
		for (int i = 0; i < 5; i++) {
			System.out.println();
			grafo.coloreoMatula();
		}
		
		System.out.println("WelshPowell");
		for (int i = 0; i < 5; i++) {
			System.out.println();
			grafo.coloreoWelshPowell();
		}
//		grafo.coloreoWelshPowell();

//		try {
//			GrafoRegular grafoUno = new GrafoRegular(8, 3);
//			grafoUno.generar();
//			grafoUno.mostrarNodos();
//			grafoUno.mostrarAristas();
//			grafoUno.mostrarAdyacencia();
////			grafoUno.grabar("grafos\\grafo.in");
//		} catch (Exception evento) {
//			System.out.println(evento.getMessage());
//			evento.printStackTrace();
//		}
//		
//		try {
//			GrafoRegular grafoDos = new GrafoRegular(8, 0.57);
//			grafoDos.generar();
////			grafoDos.mostrarNodos();
////			grafoDos.mostrarAristas();
//			grafoDos.mostrarAdyacencia();
//		} catch (Exception evento) {
//			System.out.println(evento.getMessage());
//			evento.printStackTrace();
//		}
		
//		try {
//			GrafoNPartito grafoTres = new GrafoNPartito(8,4);
//			grafoTres.generar();
//			grafoTres.mostrarNodos();
//			grafoTres.mostrarAristas();
//			grafoTres.mostrarAdyacencia();
//			grafoTres.coloreoWelshPowell();
//			System.out.println();
//			grafoTres.coloreoAleatorio();
//			System.out.println();
//			grafoTres.coloreoMatula();
//		} catch (Exception evento) {
//			System.out.println(evento.getMessage());
//			evento.printStackTrace();
//		}
		
//		try {
//			GrafoAleatorio grafoCuatro = new GrafoAleatorio(15,0.6);
//			grafoCuatro.generar();
//			System.out.println();
////			grafoCuatro.mostrarNodos();
//			grafoCuatro.mostrarAristas();
////			grafoCuatro.mostrarAdyacencia();
////			grafoCuatro.cargarGrados();
//			grafoCuatro.coloreoWelshPowell();
//			System.out.println();
//			grafoCuatro.coloreoAleatorio();
//			System.out.println();
//			grafoCuatro.coloreoMatula();
//		} catch (Exception evento) {
//			System.out.println(evento.getMessage());
//			evento.printStackTrace();
//		}
	}
}
