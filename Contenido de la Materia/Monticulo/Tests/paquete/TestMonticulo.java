package paquete;

import org.junit.Assert;
import org.junit.Test;

public class TestMonticulo {
	
	private int[] vector = {50,20,15,6,3,2,60,70,55};

	@Test
	public void testMonticuloMaximo() {
		Monticulo heap = new MonticuloMaximo(15);
		
		for (int i = 0; i < vector.length; i++)
			heap.poner(vector[i]);
		
		Assert.assertEquals(70, heap.sacar());
		Assert.assertEquals(60, heap.sacar());
		Assert.assertEquals(55, heap.sacar());
		Assert.assertEquals(50, heap.sacar());
		Assert.assertEquals(20, heap.sacar());
		Assert.assertEquals(15, heap.sacar());
		Assert.assertEquals( 6, heap.sacar());
		Assert.assertEquals( 3, heap.sacar());
		Assert.assertEquals( 2, heap.sacar());
	}

	@Test
	public void testMonticuloMinimo() {
		Monticulo heap = new MonticuloMinimo(15);
		
		for (int i = 0; i < vector.length; i++)
			heap.poner(vector[i]);
		
		Assert.assertEquals( 2, heap.sacar());
		Assert.assertEquals( 3, heap.sacar());
		Assert.assertEquals( 6, heap.sacar());
		Assert.assertEquals(15, heap.sacar());
		Assert.assertEquals(20, heap.sacar());
		Assert.assertEquals(50, heap.sacar());
		Assert.assertEquals(55, heap.sacar());
		Assert.assertEquals(60, heap.sacar());
		Assert.assertEquals(70, heap.sacar());
	}
	
	@Test
	public void testMonticuloVaio() {
		Monticulo heap;
		
		heap = new MonticuloMinimo();
		
		Assert.assertTrue(heap.estaVacia());
		
		heap = new MonticuloMaximo();
		
		Assert.assertTrue(heap.estaVacia());
	}
}
