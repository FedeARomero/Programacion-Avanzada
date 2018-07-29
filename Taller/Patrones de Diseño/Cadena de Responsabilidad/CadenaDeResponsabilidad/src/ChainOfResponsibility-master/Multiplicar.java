public class Multiplicar implements Operacion {

	private Operacion siguiente;


	public void establecerSiguiente(Operacion siguiente) {
		this.siguiente = siguiente;
	}

	public int calcular(Pedido pedido) {

		if (pedido.getTipoDeCalculo() == "multiplicar") {
			System.out.print(pedido.getNumero1() + " * " + pedido.getNumero2());
			System.out.print(" = " + (pedido.getNumero1() * pedido.getNumero2()) + "\n");

			return pedido.getNumero1() * pedido.getNumero2();
		} else {
			System.out.println("No puedo atenderlo, pasando al " + siguiente);
			return siguiente.calcular(pedido);
		}

	}

	@Override
	public String toString() {
		return "Multiplicar";
	}

}
