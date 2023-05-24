package N3E1;

public class Generica {
	
	public static <T extends Telefon> void telefonar (T telefon) {
		telefon.trucar();
		//telefon.ferFotos();
	}
	
	public static <T extends Smartphone> void smartphonejar (T telefon) {
		telefon.trucar();
		telefon.ferFotos();
	}
}
