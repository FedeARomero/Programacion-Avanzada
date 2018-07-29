package paquete;

public class CompetenciaUno {

	public static void main(String[] args) {
		
		int juegos = 500;

		Jugador uno = new JugadorDummy();
		Jugador dos = new JugadorFede();

		System.out.println(uno + " vs " + dos);
		System.out.println();
		int empates = 0, derrotas = 0, victorias = 0;
		for (int i = 0; i < juegos; i++) {
			Resultado resultado = uno.jugar().jugarCon(dos.jugar());

			if (resultado == Resultado.EMPATE) 
				empates++;
			else if (resultado == Resultado.GANADOR)
				victorias++;
			else if (resultado == Resultado.PERDEDOR)
				derrotas++;
		}

		System.out.println("Resultados de: " + uno);
		System.out.println("- Empates  : " + empates);
		System.out.println("- Victorias: " + victorias);
		System.out.println("- Derrotas : " + derrotas);
		System.out.println();
		
		System.out.println("Resultados de: " + dos);
		System.out.println("- Empates  : " + empates);
		System.out.println("- Victorias: " + derrotas);
		System.out.println("- Derrotas : " + victorias);
		System.out.println();
		
		if (derrotas > victorias)
			System.out.println(" Gano ** " + dos + " **");
		else if (victorias > derrotas)
			System.out.println(" Gano ** " + uno + " **");
		else
			System.out.println(" Empataron ");	
	}
}
