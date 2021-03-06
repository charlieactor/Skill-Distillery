package lordofobjects;

public abstract class MainCharacter {
	private double health;
	protected double attack;
	private String name;
	private double agility;
	
	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getAttack() {
		return attack;
	}

	public double getAgility() {
		return agility;
	}

	public void setAgility(double agility) {
		this.agility = agility;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double attack(int type);

	public MainCharacter(int health, double attack, String name, double agility) {
		super();
		this.health = health;
		this.attack = attack;
		this.name = name;
		this.agility = agility;
	}
}
