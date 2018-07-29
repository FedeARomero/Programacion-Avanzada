package tierra_media;

public class Orco extends Personaje{
	
	/**
	 * El orco ataca (15pts) con mucha fuerza.
	 * Los golpes no le hacen mucho efecto a su salud (1/4 del daño).
	 * No le sirve de nada descansar.
	 */

	@Override
	public void atacar(Personaje enemigo) {
		enemigo.esAtacado(15);
	}

	@Override
	public void descansar() {

	}

	@Override
	public void esAtacado(int danio) {
		this.salud = Math.max(this.salud - ((int) danio / 4), 0);
	}
}
