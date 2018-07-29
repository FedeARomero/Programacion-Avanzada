package paquete;

/**
 * Los participantes del torneo de Piedra/Papel/Tijera (PPT) deber�n realizar un bot
 * que implemente esta interfaz. Se explicar� cada m�todo en su correspondiente Javadoc.
 * �Que tengan una buena y feliz competencia!
 *
 */
public interface Jugador {

	public Forma jugar();
	/**
	 * Este es el primer m�todo que se ejecutar�.
	 * @return la forma que jugar�. Devolver null en cualquier momento se penalizar� con
	 * la p�rdida autom�tica de esa mano.
	 */
	
	public void resultado(Resultado resultado, Forma formaDelOtro);
	/**
	 * Este es el m�todo de feedback. Gracias a �ste el bot se enterar� c�mo le fue en la
	 * partida inmediatamente anterior. Ejemplo: si jug� PIEDRA, y el otro jugador jug�
	 * TIJERA, se le invocar� al bot este m�todo con los par�metros GANA, TIJERA.
	 * Se sugiere aprovechar este m�todo para que el bot aprenda del rival.
	 * @param resultado c�mo termin� la partida inmediata anterior
	 * @param formaDelOtro qu� jug� el rival. PUEDE SER NULA
	 */
	
	public void olvidar();
	/**
	 * Este es el m�todo que se invocar� cuando cambie el rival. Queda bajo la
	 * responsabilidad de quien programe el bot si desea "borrarle la memoria", o
	 * mantener la informaci�n para alg�n fin.
	 * Se recuerda que distintos oponentes responden a distinta l�gica, y salvo casos
	 * muy puntuales, no tiene sentido recordar la estrategia del rival anterior.
	 */
	
	public String toString();
	/**
	 * Con este m�todo se mostrar� en la pantalla el bot.
	 * @return El nombre del bot jugador
	 */
	
	public String[] integrantes();
	/**
	 * @return un array con los nombres completos e ids de
	 * los integrantes que desarrollaron el bot.
	 * Ejemplo: ["Lucas Videla (100)", "Federico Gasior (101)", "Julio Crispino (102)"]
	 */
}