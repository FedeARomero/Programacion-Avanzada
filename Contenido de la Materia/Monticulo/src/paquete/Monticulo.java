package paquete;

public abstract class Monticulo {
	
	protected int[] vector;
	protected int ultimo;
	
	public Monticulo(int tamanio) {
		vector = new int[tamanio];
		ultimo = 1;
	}
	
	public Monticulo() {
		this(25);
	}
	
	public abstract boolean poner(int n);

	public abstract int sacar();
	
	public boolean estaVacia() {
		return this.ultimo == 1;
	}
	
	public void mostrar() {
		System.out.print("Vector: ");
		for (int i = 1; i < this.ultimo; i++)
			System.out.print(this.vector[i] + ",");
		System.out.println();
	}
	
}
