package labs;

public class Truck extends Automobile{
	private int bedSize;
	
	Truck(int price, int wheels, String make, String model, int year, int bedSize) {
		super(price, wheels, make, model, year);
		this.bedSize = bedSize;
	}
	@Override
	public double calculateRegistrationFee() {
		if (this.getNumWheels() > 4){
			return super.calculateRegistrationFee();
		}
		else {
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
			
	}
	public int getBedSize() {
		return bedSize;
	}

	public void setBedSize(int bedSize) {
		this.bedSize = bedSize;
	}

	@Override
	public String toString() {
		return super.toString() + "Truck bedSize=" + this.getBedSize(); 
	}
	
}
