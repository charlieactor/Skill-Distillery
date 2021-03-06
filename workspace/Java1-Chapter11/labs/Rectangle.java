package labs;

public class Rectangle extends Shape {
	double height, width;

	public Rectangle(Color color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
	}
	
	@Override
	public void draw() {
		System.out.println(this.color + " rectangle");
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Rectangle() {
	}

	@Override
	public double getArea() {
		return height * width;
	}

}
