package tierra_media;

public class Goblin extends Personaje {
	
	/**
	 * El goblin ataca (3pts) débilmente, pero es muy dificil de golpear (1 de cada 10 veces lo golpean).
	 * Si descansa, se cura completamente.
	 */
	
	private int ataquesRecibidos = 0;
			
	@Override
	public void atacar(Personaje enemigo) {
		enemigo.esAtacado(3);
	}

	@Override
	public void descansar() {
		this.salud = 100;
	}

	@Override
	public void esAtacado(int danio) {
		if( (++ataquesRecibidos % 10) == 0)
			this.salud = Math.max(this.salud - danio, 0);
	}
}
