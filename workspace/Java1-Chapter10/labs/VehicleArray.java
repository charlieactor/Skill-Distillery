package labs;

public class VehicleArray {
	public static void main(String[] args) {
		Bicycle bike = new Bicycle(1000, 2, 21);
		Truck tacoma = new Truck(40000, 6, "Toyota", "Tacoma", 2012, 50);
		Automobile cx3 = new Automobile(24000, 4, "Mazda", "CX3", 2016);
		
		Vehicle[] vehicleArr = {bike, tacoma, cx3};
		
		for (Vehicle cars : vehicleArr) {
			System.out.println(cars);
		}
		
	}
}
