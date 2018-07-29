public class SumaYMultiplicacion implements Operacion {

	private Operacion siguiente;


	public void establecerSiguiente(Operacion siguiente) {
		this.siguiente = siguiente;
	}

	public int calcular(Pedido pedido) {
		
		if (pedido.getTipoDeCalculo() == "sym") {
			Sumar s = new Sumar();
			Multiplicar m = new Multiplicar();

			return s.calcular(new Pedido(pedido.getNumero1(), pedido.getNumero2(), "sumar")) + 
					m.calcular(new Pedido(pedido.getNumero1(), pedido.getNumero2(), "multiplicar"))
			+ siguiente.calcular(pedido);
		} else {
			System.out.println("No puedo atenderlo, pasando al " + siguiente);
			return siguiente.calcular(pedido);
		}
		
	}

	@Override
	public String toString() {
		return "Sumar y Multiplicar";
	}

}
