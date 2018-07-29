package paquete;

public class JugadorDummy implements Jugador {
	@Override
	public Forma jugar() {
		return Forma.PIEDRA;
	}

	@Override
	public void resultado(Resultado resultado, Forma formaDelOtro) {
		// La buena piedra nunca me fallará
	}

	@Override
	public String toString() {
		return "La Buena Piedra";
	}

	@Override
	public void olvidar() {
	}

	@Override
	public String[] integrantes() {
		return new String[] { "Bart Simpson" };
	}
}
