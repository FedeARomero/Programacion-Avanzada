package paquete;

public class Operacion {
	
	private Sumar suma;
	private Restar resta;
	private Multiplicar multiplicacion;
	private Dividir dividir;
	
	public Operacion() {
		
		suma = new Sumar();
		resta = new Restar();
		multiplicacion = new Multiplicar();
		dividir = new Dividir();
		
		suma.setSiguiente(resta);
		resta.setSiguiente(multiplicacion);
		multiplicacion.setSiguiente(dividir);
		dividir.setSiguiente(new Default());
	}
	
	public int calcular(int a, int b, String op) {
		return suma.operacion(a, b, op);
	}

}
