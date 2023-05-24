package N1E1;

public class Coses {
	private String nomDeLaCosa;
	private int numeroDeCoses;
	private static int numerosDeCoses2;
	public Coses() {
		super();
		this.nomDeLaCosa = "a" + numeroDeCoses;
		this.numeroDeCoses = 3 * numerosDeCoses2;
		mesNumeros();
	}
	public String getNomDeLaCosa() {
		return nomDeLaCosa;
	}
	public int getNumeroDeCoses() {
		return numeroDeCoses;
	}
	public void setNomDeLaCosa(String nomDeLaCosa) {
		this.nomDeLaCosa = nomDeLaCosa;
	}
	public void setNumeroDeCoses(int numeroDeCoses) {
		this.numeroDeCoses = numeroDeCoses;
	}
	public static void mesNumeros() {
		numerosDeCoses2++;
	}
	
	@Override
	public String toString() {
		return nomDeLaCosa + numeroDeCoses;
	}
	
}
