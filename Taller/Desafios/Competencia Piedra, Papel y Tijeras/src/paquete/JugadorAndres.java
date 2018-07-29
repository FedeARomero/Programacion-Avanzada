package paquete;

import java.util.Random;

public class JugadorAndres implements Jugador{
	
	private Resultado miResultado = Resultado.EMPATE;
	private Forma miForma;

	/**
	 * empate  : random
	 * victoria: mantengo
	 * derrota : cambio al del otro
	 */
	
	@Override
	public Forma jugar() {
		Forma[] opciones = { Forma.PIEDRA, Forma.PAPEL, Forma.TIJERA };
		
		if( miResultado.equals(Resultado.EMPATE) )
			miForma = opciones[new Random().nextInt(3)];
		
		return miForma;
	}

	@Override
	public void resultado(Resultado resultado, Forma formaDelOtro) {
		miResultado = resultado;
		
		if( resultado.equals(Resultado.PERDEDOR) )
			miForma = formaDelOtro;
	}
	
	@Override
	public String toString() {
		return "Andres";
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
