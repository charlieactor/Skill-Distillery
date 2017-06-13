package lordofobjects;

public class Female extends MainCharacter {

	public Female(int health, int attack, String name, double agility) {
		super(health, attack, name, agility);
	}
@Override
	
	public double attack(int type) {
	double damage = 0;
	double probability;
		if (type == 1) {
			damage = .1 * this.attack;
			probability = 0.8;
		}
		else if (type == 2) {
			damage = .2 * this.attack;
			probability = 0.6;
		}
		else if (type == 3) {
			double odds = Math.random();
			if (odds >= 0.5) {
				System.out.println("You've blinded the manbeast permanently, he's very upset, but otherwise useless");
				damage = 100;
				return damage;
			}
		}
		else {
			String[] emotionalDamage = {"You smell like my left breast, dipped in durian-fruit-juice and set out to dry for several days!", 
										"You look like a shaved version of my right breast: really like a naked mole rat with no one to love.",
										"Your mother was a beautiful womanbeast, and your father was a beautiful manbeast....how did you get to be so hideous?",
										"Everybody just wants to be loved. Such a shame then, that nobody will ever love you." };
			
			int which = (int)(Math.random()*4);
			System.out.println("You yell, \"" + emotionalDamage[which] + "\"");
			double odds = Math.random();
			if (odds >= 0.5) {
				System.out.println("You've emotionally damaged the manbeast beyond repair, he is now weeping in a puddle of his own tears.");
				damage = 100;
				return damage;
			}
			else {
				System.out.println("The man beast has heard that insult many times before (I mean come on, look at him), and he laughs derisvely at your fruitless attempt to emotionally disarm him.");
				damage = 0;
				return damage;
			}
		}
		probability = Math.random();
		if (probability >= 0.75) {
			System.out.println("You've struck the manbeast and he squeals with displeasure!");
			return damage;
		}
		else {
			damage = 0;
			System.out.println("You've missed the manbeast! What is this, your first time fighting manbeasts?");
			return damage;
		}
	}
}

