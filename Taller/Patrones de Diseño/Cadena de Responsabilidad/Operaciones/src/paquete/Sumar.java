package paquete;

public class Sumar implements Operacion{
	
	private Operacion siguiente;

	@Override
	public void establecerSiguiente(Operacion siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public int calcular(Pedido pedido) {

		if(pedido.operacion() == "sumar")
			return pedido.valorUno() + pedido.valorDos();
		else
			return siguiente.calcular(pedido);
	}

	@Override
	public String toString() {
		return "Sumar";
	}

}
