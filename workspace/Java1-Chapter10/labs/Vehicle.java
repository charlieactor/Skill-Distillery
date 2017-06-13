package labs;

public class Vehicle {
	private int purchasePrice, numWheels;
	

	Vehicle(int price, int wheels) {
		this.purchasePrice = price;
		this.numWheels = wheels;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getNumWheels() {
		return numWheels;
	}
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	@Override
	public String toString() {
		return "Vehicle [purchasePrice=" + purchasePrice + ", numWheels=" + numWheels + "]";
	}
	

}
