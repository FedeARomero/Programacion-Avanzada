import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import paquete.Operacion;

public class TestCadena {
	
	private Operacion operacion;

	@Before
	public void incio() {
		operacion = new Operacion();
	}
	
	@Test
	public void testSuma() {
		Assert.assertEquals(5, operacion.calcular(2, 3, "sumar"));
	}

	@Test
	public void testResta() {
		Assert.assertEquals(4, operacion.calcular(7, 3, "restar"));
	}
	
	@Test
	public void testMultiplicar() {
		Assert.assertEquals(24, operacion.calcular(6, 4, "multiplicar"));
	}
	
	@Test
	public void testDividir() {
		Assert.assertEquals(5, operacion.calcular(25, 5, "dividir"));
	}
}
