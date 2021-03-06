package zoo;

public class Animal {
	private String name, gender;
	private int weight;

	Animal(String name, int weight, String gender) {
		setName(name);
		setWeight(weight);
		setGender(gender);
	}
	Animal(String name, int weight) {
		this(name, weight, "female");
	}

	 void makeNoise() {
		if (name.equalsIgnoreCase("Lion")) {
			System.out.println(gender + " " + name + ": RAWR I'M A LION!");
		}
		else if (name.equalsIgnoreCase("Giraffe")) {
			System.out.println(gender + " " + name + ": WHAT NOISE DO GIRAFFES MAKE?!");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
