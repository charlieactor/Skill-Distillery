package labs;

public class RegistrationTest {

	public static void main(String[] args) {
		Automobile car = new Automobile(24000, 4, "Mazda", "CX3", 2016);
		Truck tacoma = new Truck(30000, 4, "Toyota", "Tacoma", 2015, 40);
		Truck monster = new Truck(30000, 6, "Monster", "Big Ass Truck", 2015, 40);
		Automobile subaru = new Automobile(25000, 4, "Subaru", "Outback", 2009);
		Automobile motorcycle = new Automobile(1000, 4, "Honda", "Moto", 2010);
		
		Automobile[] carArr = {car, tacoma, monster, subaru, motorcycle};
		
		for (Automobile cars : carArr ) {
			System.out.println(cars.calculateRegistrationFee());
		}
		
	}

}
