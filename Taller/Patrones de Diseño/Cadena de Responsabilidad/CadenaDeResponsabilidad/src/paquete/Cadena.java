package paquete;

public class Cadena {

	public static void main(String[] args) {

		Operacion o = new Operacion();
		
		System.out.println("Resultado " + o.calcular( 2, 3, "sumar"));
		System.out.println("Resultado " + o.calcular( 7, 3, "restar"));
		System.out.println("Resultado " + o.calcular( 6, 4, "multiplicar"));
		System.out.println("Resultado " + o.calcular( 25, 5, "dividir"));
	}

}
