package labs;

public class ShapeTester {

	public static void main(String[] args) {
		Drawable[] drawableArr = new Drawable[3];

		drawableArr[0] = new Rectangle(Color.GREEN, 4, 6);
		drawableArr[1] = new Text("Some text");
		drawableArr[2] = new Circle(Color.ORANGE, 3);

		for (Drawable shape : drawableArr) {
			shape.draw();
		}
	}
}
