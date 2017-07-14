package initialization;

public class SuperMan {
	String superInstance = sayString("instance field declaration");
	{
		superInstance = sayString("instance initializer");
	}
	static String superStatic = sayString("static field declaration");
	static {
		superStatic = sayString("Set in static initializer");
	}
	public SuperMan() {
		super();
		sayString("SuperMan's constructor");
	}
	
	
	public static String sayString(String s) {
		System.out.println(s);
		return s;
	}
	
	
}
