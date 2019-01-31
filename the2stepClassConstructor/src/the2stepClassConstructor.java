/***
**  Driver Class for our project  **
								 ***/

public class the2stepClassConstructor {
	public static void main(String[] args) {
		//create a new runner ( and instantiate with default constructor)
		Runner r = new Runner();
		
		//create a new swimmer ( and instantiate with default constructor)
		Swimmer s = new Swimmer();
		
		//create a new swimmer ( and instantiate with explicit constructor)
		Swimmer s2 = new Swimmer(235971);
		
		System.out.println(r);
		System.out.println(s);
		System.out.println(s2);
	}
}

