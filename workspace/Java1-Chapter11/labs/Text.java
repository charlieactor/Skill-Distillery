package labs;

public class Text implements Drawable {
	String value;
	
	Text(String value) {
		this.value = value;
	}

	@Override
	public void draw() {
		System.out.println(value);
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
