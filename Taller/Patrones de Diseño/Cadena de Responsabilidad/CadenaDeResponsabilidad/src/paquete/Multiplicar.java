package paquete;

public class Multiplicar implements Manejador{
	
	private Manejador siguiente;
	private String operacion;
	
	public Multiplicar() {
		this.operacion = "Multiplicar";
	}

	@Override
	public void setSiguiente(Manejador siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public int operacion(int a, int b, String op) {
		
		if( op.equalsIgnoreCase(operacion) )
			return a * b;
		else
			return siguiente.operacion(a, b, op);
	}

}
