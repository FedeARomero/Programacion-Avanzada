package paquete;

public interface Manejador {
	
	public void setSiguiente(Manejador siguiente);
	public int operacion(int a, int b, String op);
}
