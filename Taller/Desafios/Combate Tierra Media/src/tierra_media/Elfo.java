package tierra_media;

public class Elfo extends Personaje{
	
	/**
	 * El elfo ataca (5pts) con más fuerza cada vez que recibe ataques (+2 ^ ataques recibidos).
	 * Si descansa, se calma y se cura completamente, pero sus ataques se debilitan nuevamente.
	 */
	
	private int ataquesRecibidos = 0;
	
	@Override
	public void atacar(Personaje enemigo) {
		int ataque = 5 + plusDeFuerza();
		enemigo.esAtacado(ataque);
	}
	
	private int plusDeFuerza() {
		int[] plus = { 0, 2, 4, 8, 16, 32, 64, 128};
		return plus[ Math.min(ataquesRecibidos, 7) ];
	}

	@Override
	public void descansar() {
		this.salud = 100;
		ataquesRecibidos = 0;
	}

	@Override
	public void esAtacado(int danio) {
		this.salud = Math.max(this.salud - danio, 0);
		ataquesRecibidos++;
	}
}
