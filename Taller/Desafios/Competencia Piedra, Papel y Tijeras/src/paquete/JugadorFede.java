package paquete;

import java.util.Random;

public class JugadorFede implements Jugador{

	@Override
	public Forma jugar() {
		Forma[] opciones = { Forma.PIEDRA, Forma.PAPEL, Forma.TIJERA };
		return opciones[new Random().nextInt(3)];
	}

	@Override
	public void resultado(Resultado resultado, Forma formaDelOtro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Fede";
	}

	@Override
	public void olvidar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] integrantes() {
		// TODO Auto-generated method stub
		return null;
	}

}
