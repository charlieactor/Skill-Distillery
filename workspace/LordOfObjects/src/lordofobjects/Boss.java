package lordofobjects;

public class Boss extends Enemies {

	public Boss(int health, int attack) {
		super(health, attack);
		// TODO Auto-generated constructor stub
	}

	@Override

	public double attack(double agility) {
		int damage = 10 + ((int) (Math.random() * 5));
		double probability = Math.random() * agility;
		System.out.println("You've been struck by the manbeast! The hideous, hideous manbeast!!");
		if (probability <= 0.81) {
			return damage;
		} else {
			damage = 0;
			System.out.println("The manbeast missed you! You laugh derisively at him!");
			return damage;
		}
	}
}
