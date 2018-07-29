package paquete;

public class Restar implements Operacion{
	
	private Operacion siguiente;

	@Override
	public void establecerSiguiente(Operacion siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public int calcular(Pedido pedido) {

		if( pedido.operacion() == "restar" )
			return pedido.valorUno() - pedido.valorDos();
		else
			return siguiente.calcular(pedido);
	}

	@Override
	public String toString() {
		return "Restar";
	}

}
