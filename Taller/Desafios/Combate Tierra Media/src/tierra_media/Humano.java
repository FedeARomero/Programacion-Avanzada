package tierra_media;

public class Humano extends Personaje{
	
	/**
	 * El humano ataca (10 pts) cada vez con menos fuerza (-1 x ataques dados), a menos que descanse (recupera la fuerza inicial).
	 * Al recibir ataques pierde un poco de fuerza (-1 por ataque recibido).
	 */
	
	private int fuerza = 10;
	
	@Override
	public void atacar(Personaje enemigo) {
		enemigo.esAtacado(fuerza);
		fuerza = Math.max(0, fuerza - 1);
	}

	@Override
	public void descansar() {
		fuerza = 10;
	}

	@Override
	public void esAtacado(int danio) {
		this.salud = Math.max(this.salud - danio, 0);
		fuerza = Math.max(0, fuerza - 1);
	}
}
