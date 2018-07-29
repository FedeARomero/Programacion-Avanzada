package tierra_media;

public class Enano extends Personaje{
	
	/**
 	 * El enano ataca (10pts) cada vez con más fuerza (2 x ataques dados).
 	 * Recibe ataques normalmente.
 	 * Si descansa, recupera hasta el 25% de su salud inicial.
 	 */
	
	private int ataquesDados = 0;

	@Override
	public void atacar(Personaje enemigo) {
		enemigo.esAtacado(10 + 2 * ataquesDados);
		ataquesDados++;
	}

	@Override
	public void descansar() {
		this.salud = (int) (this.salud * 1.25);
	}

	@Override
	public void esAtacado(int danio) {
		this.salud = Math.max(this.salud - danio, 0);
	}
}
