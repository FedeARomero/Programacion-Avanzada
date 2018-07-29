package paquete;

public class Default implements Manejador{

	@Override
	public void setSiguiente(Manejador siguiente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int operacion(int a, int b, String op) {

		System.out.println("Operacion no definida");
		return 0;
	}

}
