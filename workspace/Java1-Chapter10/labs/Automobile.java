package labs;

public class Automobile extends Vehicle {
	private String make, model;
	private int year;
	
	Automobile(int price, int wheels, String make, String model, int year) {
		super(price, wheels);
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public double calculateRegistrationFee() {
		double fee = this.getPurchasePrice() * .01;
		if (this.getYear() < java.time.Year.now().getValue() - 50){
			fee = fee - (this.getPurchasePrice() * 0.005);
		}
		else {
			double yearLess = ((java.time.Year.now().getValue() - this.getYear()) + 1);
			fee = fee - (yearLess * .001 * this.getPurchasePrice());
		}
		fee = Math.round(fee * 100) / 100;
		return fee;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return super.toString() + "make=" + this.getMake() + ", model=" + this.getModel() + ", year=" + this.getYear(); 
	}
	
}
