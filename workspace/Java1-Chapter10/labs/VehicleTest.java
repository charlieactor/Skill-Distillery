package labs;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle car = new Vehicle(24000, 4);
		Automobile auto = new Automobile(24000, 4, "Mazda", "CX3", 2017);
		Truck tacoma = new Truck(24000, 6, "Toyota", "Tacoma", 2017, 40);
		Bicycle bike = new Bicycle(1000, 3, 21);
		
		System.out.println(car);
		System.out.println(auto);
		System.out.println(tacoma);
		displayAuto(tacoma);
		System.out.println(auto.calculateRegistrationFee());
		System.out.println(tacoma.calculateRegistrationFee());
		System.out.println(tacoma.toString());
		System.out.println(car.toString());
		System.out.println(bike);
		
	}
	
	
	public static void displayAuto(Automobile auto) {
		System.out.println(auto.getNumWheels());
		System.out.println(auto.getYear());
		if (auto instanceof Truck) {
		System.out.println(((Truck)auto).getBedSize());
		}
	}

}
