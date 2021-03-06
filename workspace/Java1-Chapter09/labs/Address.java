package labs;

public class Address {
	int houseNumber;
	String street, city, state;
	StringBuilder zipcode;
	
	public Address(int number, String street, String city, String state, StringBuilder zipcode) {
		setHouseNumber(number);
		setStreet(street);
		setCity(city);
		setState(state);
		setZipcode(zipcode);
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		if (houseNumber < 1) {
			houseNumber = 1;
		}
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public StringBuilder getZipcode() {
		return zipcode;
	}

	public void setZipcode(StringBuilder zipcode) {
		if (zipcode.length() == 5) {
			zipcode.append("-0000");
		}
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}
	
	
}
