package N3E1;

public class Smartphone implements Telefon{
	int numero;
	
	
	public Smartphone(int numero) {
		super();
		this.numero = numero;
	}

	public void trucar() {
		System.out.println("Estic trucant, RING RING");
	}
	
	public void ferFotos() {
		System.out.println("*click*");
	}
}
