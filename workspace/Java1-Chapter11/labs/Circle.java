package labs;

public class Circle extends Shape {
	double radius;
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println(this.color + " circle");
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}



}
