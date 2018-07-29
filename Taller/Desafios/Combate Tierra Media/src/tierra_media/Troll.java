package tierra_media;

public class Troll extends Personaje {
	
	/**
	 * El troll ataca (30pts) con muchísima fuerza, pero 2 de cada 3 veces pifia el golpe.
	 * Si descansa, se vuelve de piedra y no puede atacar más.
	 * Los golpes no le hacen daño.
	 */
	
	private int golpesDados = 0;
	private boolean seVolvioPiedra = false;

	@Override
	public void atacar(Personaje enemigo) {
		if ( !seVolvioPiedra && (++golpesDados % 3) == 0 )
			enemigo.esAtacado(30);
	}

	@Override
	public void descansar() {
		seVolvioPiedra = true;
	}

	@Override
	public void esAtacado(int danio) {

	}
}
