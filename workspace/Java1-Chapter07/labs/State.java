package labs;

public class State {
	private String name, abbrev, capital, bird;
	private Integer population;

	public void display(){
		System.out.println("State name: " + name + "\nState abbreviation: "
							+ abbrev + "\nState Capital: " + capital + 
							"\nState bird: " + bird +  "\nState Population: " + population);
	}

	public State(String name, String abbrev, String capital) {
		setName(name);
		setAbbrev(abbrev);
		setCapital(capital);
	}
	
	public State(String name, String abbrev, String capital, int population) {
		setName(name);
		setAbbrev(abbrev);
		setCapital(capital);
		setPopulation(population);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(100);
		sb.append("State name: ");
		sb.append(name);
		sb.append("\nAbbreviation: ");
		sb.append(abbrev);
		sb.append("\nCapital: ");
		sb.append(capital);
		sb.append("\nPopulation: ");
		sb.append(population);
		sb.append("\nBird: ");
		sb.append(bird);
		String printout = sb.toString();
		return printout;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.equals(null) && !name.equals("")) {
			this.name = name;
		}
		else {
			System.out.println("Invalid input, please try again");
		}
	}

	public String getAbbrev() {
		return abbrev;
	}

	public void setAbbrev(String abbrev) {
		if (!abbrev.equals(null) && !abbrev.equals("")) {
			this.abbrev = abbrev;
		}
		else {
			System.out.println("Invalid input, please try again");
		}
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		if (!capital.equals(null) && !capital.equals("")) {
			this.capital = capital;
		}
		else {
			System.out.println("Invalid input, please try again");
		}
	}

	public String getBird() {
		return bird;
	}

	public void setBird(String bird) {
		if (!bird.equals(null) && !bird.equals("")) {
			this.bird = bird;
		}
		else {
			System.out.println("Invalid input, please try again");
		}
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		if (population >= 0) {
			this.population = population;
		}
		else {
			System.out.println("Invalid input, please try again");
		}
	}

}
