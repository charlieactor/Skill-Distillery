package lordofobjects;

public abstract class Enemies {
	private double health, attack;

	
	public Enemies(int health, int attack) {
		this.health = health;
		this.attack = attack;
	}

	public abstract double attack(double agility);
	
	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}
	
	
}
