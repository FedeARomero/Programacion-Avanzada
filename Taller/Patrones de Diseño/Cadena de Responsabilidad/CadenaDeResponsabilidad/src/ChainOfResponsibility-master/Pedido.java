public class Pedido {

	private int numero1;
	private int numero2;

	private String tipoDeCalculo;

	public Pedido(int n1, int n2, String tipo) {
		numero1 = n1;
		numero2 = n2;
		tipoDeCalculo = tipo;
	}

	public int getNumero1() {
		return numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public String getTipoDeCalculo() {
		return tipoDeCalculo;
	}

}
