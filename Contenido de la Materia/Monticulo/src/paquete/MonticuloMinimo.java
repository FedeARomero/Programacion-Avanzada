package paquete;

public class MonticuloMinimo extends Monticulo{

	public MonticuloMinimo(int tam) {
		super(tam);
	}
	
	public MonticuloMinimo() {
		super();
	}
	
	@Override
	public boolean poner(int n) {
		if( this.ultimo == this.vector.length ) return false;
		
		this.vector[this.ultimo] = n;
		
		for( int hijo = this.ultimo , padre = hijo / 2 ; 0 < padre && this.vector[padre] > this.vector[hijo] ; hijo = padre , padre = hijo / 2) {
			int aux = this.vector[padre];
			this.vector[padre] = this.vector[hijo];
			this.vector[hijo] = aux;
		}
		
		this.ultimo++;
		return true;
	}

	@Override
	public int sacar() {
		if( this.ultimo == 1 ) return -1;
		
		int raiz = this.vector[1]; 
		this.vector[1] = this.vector[--this.ultimo];
		
		int padre = 1;
		int hizq = padre * 2;
		int hder = padre * 2 + 1;
		
		while( padre < this.ultimo &&
			 (( hder < this.ultimo && this.vector[hder] < this.vector[padre] ) || 
			  ( hizq < this.ultimo && this.vector[hizq] < this.vector[padre] ) )){
			
			int hmenor = ( hder < this.ultimo && this.vector[hder] < this.vector[hizq] ) ? hder : hizq;
			
			int aux = this.vector[padre];
			this.vector[padre] = this.vector[hmenor];
			this.vector[hmenor] = aux;
			
			padre = hmenor;
			hizq = padre * 2;
			hder = padre * 2 + 1;
		}
		
		return raiz;
	}
	
	public static void main(String[] args) {
		
		MonticuloMinimo m = new MonticuloMinimo();
		int[] nums = {50,20,15,6,3,2,60,70,55};
		
		System.out.println("\n" + "AGREGAR" + "\n");
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Push: " + nums[i]);
			m.poner(nums[i]);
			m.mostrar();
		}
		
		System.out.println("\n" + "SACAR" + "\n");
		while(!m.estaVacia()) {
			m.mostrar();
			System.out.println("Pull: " + m.sacar());
		}
	}
}
