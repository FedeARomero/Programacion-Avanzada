package tierra_media;

public abstract class Personaje {
	
	protected int salud = 100;

	public abstract void atacar(Personaje p);

	public abstract void descansar();

	public abstract void esAtacado(int danio);

	public int salud() {
		return this.salud;
	}

}
