package paquete;

public class Default implements Operacion{

	@Override
	public void establecerSiguiente(Operacion siguiente) {
		throw new RuntimeException("No se puede agregar otro comportamiento");
		
	}

	@Override
	public int calcular(Pedido pedido) {
		throw new RuntimeException(pedido.operacion() + " no es una operacion valida");
	}

	@Override
	public String toString() {
		return "Default";
	}

}
