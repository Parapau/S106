package N2E2;

import java.util.List;

public class GenericMethods {
	
	public static <T> void metode (List<T> llista){
		for (int i = 0; i < llista.size(); i++) {
			System.out.println(llista.get(i));
		}
	}
	
}
