public class TestCadena {

	public static void main(String[] args) {

		// Creo las operaciones con las cuales voy a trabajar
		Operacion operacion = new Sumar();
		Operacion resta = new Restar();
		Operacion multiplicar = new Multiplicar();
		Operacion sumaYMultiplicacion = new SumaYMultiplicacion();
		Operacion defaultOperation = new Default();

		// Creo la cadena. Suma lo llamamos como operacion, porque va a ser la primera de la cadena
		// y a la que haya que invocar cada vez que necesitemos preguntar por una operación
		operacion.establecerSiguiente(resta);
		resta.establecerSiguiente(multiplicar);
		multiplicar.establecerSiguiente(sumaYMultiplicacion);
		sumaYMultiplicacion.establecerSiguiente(defaultOperation);

		// Cada calcular retorna el valor numerico. En caso de nada, llegara a default y ejecutará
		// la misma
		operacion.calcular(new Pedido(2, 4, "sumar"));
		System.out.println("--------------");
		operacion.calcular(new Pedido(2, 4, "restar"));
		System.out.println("--------------");
		operacion.calcular(new Pedido(2, 4, "multiplicar"));
		System.out.println("--------------");
		operacion.calcular(new Pedido(2, 4, "sym"));
		System.out.println("--------------");
		operacion.calcular(new Pedido(2, 4, "nada"));
	}
}
