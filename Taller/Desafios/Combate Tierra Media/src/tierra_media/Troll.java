package tierra_media;

public class Troll extends Personaje {
	
	/**
	 * El troll ataca (30pts) con much�sima fuerza, pero 2 de cada 3 veces pifia el golpe.
	 * Si descansa, se vuelve de piedra y no puede atacar m�s.
	 * Los golpes no le hacen da�o.
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
