package N2E2;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import N1E2.GenericMethods;

public class Main {
	public static <T> void main (String args[]) {
		Persona persona = new Persona ("Kiril", "Ferrer", 21);
		String estrin = "i soc tonto";
		List<T> llista = new LinkedList<T>();
		
		llista = new LinkedList(Arrays.asList(persona, estrin));
		
		System.out.println(llista);
		
	}
}
