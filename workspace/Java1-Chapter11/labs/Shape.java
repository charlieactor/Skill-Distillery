package labs;

public abstract class Shape implements Drawable {
		Color color;
		
		Shape(Color color) {
			this.color = color;
		}
		
		Shape() {

		}
		
		public abstract double getArea();
		
		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}
		


}
