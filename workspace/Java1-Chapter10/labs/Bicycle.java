package labs;

public class Bicycle extends Vehicle {
	int gears;

	public Bicycle(int price, int wheels, int gears) {
		super(price, wheels);
		if (wheels != 2) {
			System.out.println("Your bike must have at least 2 wheels");
			super.setNumWheels(2);
		}
		this.gears = gears;
	}
	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}
	@Override
	public String toString() {
		return super.toString() + "Bicycle [gears=" + gears + "]";
	}

	
	
}
