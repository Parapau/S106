package N1E2;

public class Main {
	public static void main (String args[]) {
		Persona persona = new Persona ("Kiril", "Ferrer", 21);
		String estrin = "i soc tonto";
		boolean bulo = true;
		
		GenericMethods.metode(persona, estrin, bulo);
		System.out.println();
		GenericMethods.metode(bulo, persona, estrin);
		System.out.println();
		GenericMethods.metode(estrin, bulo, persona);
	}
}
