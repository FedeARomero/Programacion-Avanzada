package soldado;

public class Soldado {

	private Estado estado;
	private int balazos;
	private int sangre;
	private String dialogo;

	public Soldado() {
		this.estado = new EstadoSaludable();
		this.balazos = 0;
		this.sangre = 5000;
	}

	public String recibioDisparo() {
		this.estado = this.estado.recibirDisparo();
		return dialogo;	//"El soldado recibio un disparo";
	}

	public String recibioCuracion() {
		this.estado = this.estado.recibirCuracion();
		return dialogo;	//"El soldado recibio una curacion";
	}

	public String toString() {
		return "Soldado [ Estado = " + this.estado + ", Balazos = " + this.balazos + ", Sangre = " + this.sangre + " ]";
	}

	
	public class EstadoSaludable implements Estado {

		/**
		 * Si esta en estado saludable y recibe un disparo, grita,
		 * decrementa en 100cm3 el total de sangre, 
		 * agrega un agujero de bala y pasa a estado herido.
		 */
		public Estado recibirDisparo() {
			dialogo = "Soldado:- AAAH";
			balazos++;
			sangre = Math.max(0, sangre - 100);
			return new EstadoHerido();
		}

		/**
		 * Si esta en estado saludable y recibe curacion,
		 * dice "gracias, pero estoy saludable"
		 * y queda en el mismo estado.
		 */
		public Estado recibirCuracion() {
			dialogo = "Soldado:- Gracias, pero estoy saludable";
			return this;
		}

		public String toString() {
			return "Saludable";
		}
	}

	public class EstadoHerido implements Estado {

		/**
		 * Si esta en estado herido y recibe un disparo, grita mas fuerte,
		 * pierde sangre mas rapidamente,
		 * agrega un agujero de bala 
		 * y queda en el mismo estado
		 * a menos que pierda toda la sangre donde pasa a estado muerto.
		 */
		public Estado recibirDisparo() {
			dialogo = "Soldado:- AAAAAAHHH";
			balazos++;
			sangre = Math.max(0, sangre - 100*balazos);
			return sangre > 0 ? this : new EstadoMuerto();
		}

		/**
		 * Si esta en estado herido y recibe curacion dice "gracias",
		 * decrementa un agujero de bala
		 * y pasa a estado saludable.
		 */
		public Estado recibirCuracion() {
			dialogo = "Soldado:- Gracias";
			balazos--;
			return new EstadoSaludable();
		}

		public String toString() {
			return "Herido";
		}
	}

	public class EstadoMuerto implements Estado {

		/**
		 * Si esta muerto y recibe un disparo,
		 * agrega un agujero de bala
		 * y queda en el mismo estado.
		 */
		public Estado recibirDisparo() {
			dialogo = "Soldado:-...";
			balazos++;
			return this;
		}

		/**
		 * Si esta muerto y recibe curacion grita "he revivido!",
		 * recuperoa toda su sangre, cierra todos los aguejeros de bala
		 * y pasa a estado saludable.
		 */
		public Estado recibirCuracion() {
			dialogo = "Soldado:- He revivido!";
			sangre = 5000;
			balazos = 0;
			return new EstadoSaludable();
		}

		public String toString() {
			return "Muerto";
		}
	}
}
