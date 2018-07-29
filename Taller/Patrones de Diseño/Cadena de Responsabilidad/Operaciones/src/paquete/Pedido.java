package paquete;

public class Pedido {
	
	private int uno;
	private int dos;
	private String operacion;
	
	public Pedido(int uno, int dos, String operacion) {
		this.uno = uno;
		this.dos = dos;
		this.operacion = operacion;
	}
	
	public int valorUno() {
		return this.uno;
	}
	
	public int valorDos() {
		return this.dos;
	}
	
	public String operacion() {
		return this.operacion;
	}

}
