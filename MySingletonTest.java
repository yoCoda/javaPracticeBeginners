import java.io.*;

class MySingleton {
	private static MySingleton t;
	private static boolean objCreated = false;
	private MySingleton() {
		// no instanciation.
		System.out.printf("\n\tConstructor called: objCreated=%b\n", objCreated);
	}
	public static synchronized MySingleton create(){
		if (objCreated) { 
			System.out.printf("\nObject already exists: objCreated=%b\n", objCreated);
			return t;
		} else {
			System.out.printf("\nObject does not exist, CREATING...: objCreated=%b\n", objCreated);
			t = new MySingleton(); 
			objCreated=true;
			System.out.printf("\nObject does not exist, ...CREATED: objCreated=%b\n", objCreated);
			return t;
		}
	}
	public static MySingleton get() { return create(); }
}

public class MySingletonTest {
	public static void main(String[] arg) {
		MySingleton y = MySingleton.create();; 
		MySingleton z = MySingleton.create();; 
		y.create();
		z.create();
		y.get();
		z.get();
		//x = new MySingleton();
		
	}
}
