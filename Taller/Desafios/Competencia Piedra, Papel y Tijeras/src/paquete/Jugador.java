package paquete;

/**
 * Los participantes del torneo de Piedra/Papel/Tijera (PPT) deberán realizar un bot
 * que implemente esta interfaz. Se explicará cada método en su correspondiente Javadoc.
 * ¡Que tengan una buena y feliz competencia!
 *
 */
public interface Jugador {

	public Forma jugar();
	/**
	 * Este es el primer método que se ejecutará.
	 * @return la forma que jugará. Devolver null en cualquier momento se penalizará con
	 * la pérdida automática de esa mano.
	 */
	
	public void resultado(Resultado resultado, Forma formaDelOtro);
	/**
	 * Este es el método de feedback. Gracias a éste el bot se enterará cómo le fue en la
	 * partida inmediatamente anterior. Ejemplo: si jugó PIEDRA, y el otro jugador jugó
	 * TIJERA, se le invocará al bot este método con los parámetros GANA, TIJERA.
	 * Se sugiere aprovechar este método para que el bot aprenda del rival.
	 * @param resultado cómo terminó la partida inmediata anterior
	 * @param formaDelOtro qué jugó el rival. PUEDE SER NULA
	 */
	
	public void olvidar();
	/**
	 * Este es el método que se invocará cuando cambie el rival. Queda bajo la
	 * responsabilidad de quien programe el bot si desea "borrarle la memoria", o
	 * mantener la información para algún fin.
	 * Se recuerda que distintos oponentes responden a distinta lógica, y salvo casos
	 * muy puntuales, no tiene sentido recordar la estrategia del rival anterior.
	 */
	
	public String toString();
	/**
	 * Con este método se mostrará en la pantalla el bot.
	 * @return El nombre del bot jugador
	 */
	
	public String[] integrantes();
	/**
	 * @return un array con los nombres completos e ids de
	 * los integrantes que desarrollaron el bot.
	 * Ejemplo: ["Lucas Videla (100)", "Federico Gasior (101)", "Julio Crispino (102)"]
	 */
}