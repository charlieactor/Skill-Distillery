package lordofobjects;

public class Level3 extends Enemies {

	public Level3(int health, int attack) {
		super(health, attack);
		// TODO Auto-generated constructor stub
	}

	@Override

	public double attack(double agility) {
		int damage = 9 + ((int) (Math.random() * 2));
		double probability = Math.random() * agility;
		if (probability <= 0.75) {
			System.out.println("You've been struck by the manbeast! The hideous, hideous manbeast!!");
			return damage;
			
		} else {
			damage = 0;
			System.out.println("The manbeast missed you! You laugh derisively at him!");
			return damage;
		}
	}
}
