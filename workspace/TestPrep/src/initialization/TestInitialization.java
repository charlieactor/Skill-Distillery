package initialization;

public class TestInitialization {

	public static void main(String[] args) {
		System.out.println("Starting main()");
		String s = SuperMan.superStatic;
		
		SuperMan clark = new SuperMan();
		System.out.println();
		System.out.println();
		
		Me me = new Me();
		
		System.out.println("End of main()");
	}

}
