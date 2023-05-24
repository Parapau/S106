package N1E1;

public class Main {

	public static void main (String args[]) {
		
		Coses cosa1 = new Coses(), cosa2 = new Coses(), cosa3 = new Coses();
		
		NoGenericMethods generics = new NoGenericMethods(cosa3, cosa1, cosa2);
	
		System.out.println(generics.getObject1());
		
		System.out.println(generics.getObject3());
	
		System.out.println(generics.getObject2());
	
	
	
	}
	
	
	
	
	
	
	
}
