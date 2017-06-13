package labs;

public class AddressTest {
	public static void main(String[] args) {
		StringBuilder zip = new StringBuilder();
		Address add1 = new Address(2431, "Ogden St", "Denver", "CO", zip);
		int houseNum = -2;
		zip.append("80205");
		
		System.out.println(add1);
		System.out.println();
		System.out.println(houseNum);
		System.out.println(zip);
		
		add1.setHouseNumber(houseNum);
		add1.setZipcode(zip);
		
		System.out.println();
		System.out.println(houseNum);
		System.out.println(zip);
		
	}
}
