package lordofobjects;

public class Level2 extends Enemies {

	public Level2(int health, int attack) {
		super(health, attack);
		// TODO Auto-generated constructor stub
	}

	@Override

	public double attack(double agility) {
		int damage = 6 + ((int) (Math.random() * 3));
		double probability = Math.random() * agility;
		if (probability <= 0.6) {
			System.out.println("You've been struck by the manbeast! The hideous, hideous manbeast!!");
			return damage;
		} else {
			damage = 0;
			System.out.println("The manbeast missed you! You laugh derisively at him!");
			return damage;
		}
	}

}
