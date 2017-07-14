package initialization;

public class Me extends SuperMan {
	static String staticField = sayString("my static Field declaration");
	String instanceString = sayString("my instance declaration");
	
	static {
		staticField = sayString("my static initializer");
	}
	{
		instanceString = sayString("my instance initializer");
	}
	public Me() {
		super();
		sayString("my constructor");
	}
	
}
