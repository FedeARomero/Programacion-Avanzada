package paquete;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestOperaciones {

	private Operacion primera;
	private Operacion segunda;
	private Operacion tercera;
	private Operacion cuarta;
	private Operacion defecto;
	
	@Before
	public void inicio() {
		primera = new Sumar();
		segunda = new Restar();
		tercera = new Multiplicar();
		cuarta = new Dividir();
		defecto = new Default();
		
		primera.establecerSiguiente(segunda);
		segunda.establecerSiguiente(tercera);
		tercera.establecerSiguiente(cuarta);
		cuarta.establecerSiguiente(defecto);
	}
	
	@Test
	public void testSuma() {
		Assert.assertEquals(5, primera.calcular(new Pedido(2, 3, "sumar")));
	}

	@Test
	public void testResta() {
		Assert.assertEquals(5, segunda.calcular(new Pedido(10, 5, "restar")));
	}
	
	@Test
	public void testMultiplicar() {
		Assert.assertEquals(6, tercera.calcular(new Pedido(3, 2, "multiplicar")));
	}
	
	@Test
	public void testDividir() {
		Assert.assertEquals(6, cuarta.calcular(new Pedido(12, 2, "dividir")));
	}
}	
