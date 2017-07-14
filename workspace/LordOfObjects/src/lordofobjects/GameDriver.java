package lordofobjects;

import java.util.Scanner;

public class GameDriver {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to ManBEAST. Would you like to be male or female?");
		String gender = kb.next();
		System.out.println();
		System.out.print("Please enter your character name: ");
		String name = kb.next();
		MainCharacter player = null;
		if (gender.equalsIgnoreCase("male")) {
			player = new Male(100, 120, name, 0.8);
		} else {
			player = new Female(100, 80, name, 1.2);
		}
		System.out.println();
		System.out.println(
				"You awaken in a dank, dark, dungeon, wearing nothing but an immaculate sombrero. The putrid scent "
						+ "of rotten flesh fills your nostrils.\nYou're very hungry and haven't"
						+ " eaten in days, so part of you finds this tantalizing. But mostly disgusted.\n"
						+ "Yes, yes. Definitely disgusted. Anyway...");
		System.out.println();
		System.out.println("OH SHIT a hideous manbeast is running at you singing your least "
				+ "favorite song. \nYou hate that song so damn much, it's time to kill this son of a bitch.");
		System.out.println();
		System.out.println("YOU MUST DO BATTLE WITH YOUR BARE HANDS!!!!!!");
		System.out.println();

		Level1 enemy1 = new Level1(20, 20);

		System.out.println("3");
		System.out.println("2");
		System.out.println("1");
		System.out.println("FIGHT");
		System.out.println();

		do {

			System.out.println("1) Punch");
			System.out.println("2) Kick");
			System.out.println("3) Throw sand in manbeasts eyes");
			System.out.println("4) Emotionally disarm the manbeast");
			int entry = kb.nextInt();
			if (player.getHealth() > 0) {
				double playerDamage = player.attack(entry);
				enemy1.setHealth(enemy1.getHealth() - playerDamage);
			} else {
				System.out.println("You are dead, get over yourself.");
				return;
			}
			if (enemy1.getHealth() > 0) {
				double enemyDamage = enemy1.attack(player.getAgility());
				player.setHealth(player.getHealth() - enemyDamage);
			}
			System.out.println(player.getName() + "'s remaining health: " + player.getHealth());
			System.out.println("Manbeast's remaining health: " + enemy1.getHealth());
			System.out.println();

		} while (player.getHealth() > 0 && enemy1.getHealth() > 0);

		System.out.println(
				"You've defeated the manbeast. As you sit there, panting and sweating, you wonder what your life has become.");
		System.out.println(
				"I mean really, you awoke in a stupor in a manbeasts cave, and then defeated him in a most undignified fashion. You've got to evaluate your life choices, man.");
		System.out.println(
				"You see a piece of a key wrapped in a note appear as the manbeast dissipates into thin air like the piece of shit he always was and was always going to be.");
		System.out.println(
				"You can't help but reminisce to all the old RPG games you used to play in your youth, with someone...but you can't remember who....who WAS that?!");
		System.out.println();
		System.out.println("You pick up the piece of the key and the note, with strangely familiar handwriting...");
		System.out.println();
		System.out.println("Hello, " + player.getName() + "....the cat's in the cradle with the silver spoon....");
		System.out.println();
		System.out.println(
				"As you sit there wondering who the fuck would write such mediocre messages, you notice little translucent hearts floating up all around you");
		player.setHealth(100);
		System.out.println("Oh hell yeah, you're all sorts of healed now for some reason.");
		System.out.println();
		System.out.println(
				"Now that you've got your wits about you, you notice that you're standing at a crossroads (oooooh metaphors) between three doors.");
		System.out.println(
				"One looks strangely familiar, it is very red, and has a welcoming allure, partially due to the fact that it has your last name written on it in caligraphy.");
		System.out.println(
				"You try the friendly looking door, but find it locked. Being the smart person you are, you deduce that the keypiece you've found will likely open this welcoming door.");
		System.out.println(
				"The two remaining doors are nondescript, and frankly, quite drab in your opinion. However, given your options, you know you must go through one.");
		System.out.println();
		System.out.println("Which door would you like to go through?");
		System.out.println("1) Non-descript, fairly drab door number 1");
		System.out.println("2) Non-descript, fairly drab door number 2");
		kb.nextInt();
		System.out.println();
		System.out.println(
				"You enter the non-descript, obnoxiously drab door, and see a red kite atop a rock pile, ensconced in light.");
		System.out.println(
				"You walk up to the kite, remembering....remembering summer days...summer days with a figure you can't quite place...");
		System.out.println(
				"Suddenly, another manbeast appears, pointing out how silly you were to be reminiscing in such a dangerous place.");
		System.out.println("He looks you in the eyes, makes a gargling sound, and utters some nonsense abou opra NOT being a national treasure.");
		System.out.println("Oh, HELL no.");
		System.out.println();
		

		System.out.println("3");
		System.out.println("2");
		System.out.println("1");
		System.out.println("FIGHT");
		System.out.println();

		Enemies[] enemyArr = new Enemies[3];
		Level1 lev1 = new Level1(20, 20);
		Level2 lev2 = new Level2(30, 30);
		Level3 lev3 = new Level3(40, 40);

		enemyArr[0] = lev1;
		enemyArr[1] = lev2;
		enemyArr[2] = lev3;

		int i = (int) (Math.random() * 2);

		do {

			System.out.println("1) Punch");
			System.out.println("2) Kick");
			System.out.println("3) Throw sand in manbeasts eyes");
			System.out.println("4) Emotionally disarm the manbeast");
			int entry = kb.nextInt();
			if (player.getHealth() > 0) {
				double playerDamage = player.attack(entry);
				enemyArr[i].setHealth(enemyArr[i].getHealth() - playerDamage);
			} else {
				System.out.println("You are dead, get over yourself.");
				return;
			}
			if (enemyArr[i].getHealth() > 0) {
				double enemyDamage = enemyArr[i].attack(player.getAgility());
				player.setHealth(player.getHealth() - enemyDamage);
			}
			System.out.println(player.getName() + "'s remaining health: " + player.getHealth());
			System.out.println("Manbeast's remaining health: " + enemyArr[i].getHealth());
			System.out.println();

		} while (player.getHealth() > 0 && enemyArr[i].getHealth() > 0);
		
		System.out.println("Slaughtering manbeasts, is that what your life has come to?");
		System.out.println("As you practice your power pose, you see the manbeast (for whom you have rising levels of disdain) slowly dissipate, and another key shard/note combo appear.");
		System.out.println("Something tells you this is going to happen again...but damn if you don't love slaying manbeasts!");
		System.out.println("You pick up the note and read...");
		System.out.println();
		System.out.println(player.getName() + ", oh how you've grown from the wee youth I once knew...");
		
		System.out.println();
		System.out.println("Well, that sure was a poorly written letter. Who takes the time to write this drivel?");
		player.setHealth(100);
		System.out.println("Anyway, might as well go check out that other room, through the other particularly drab door. \nThere's probably a manbeast in there that needs slaying, anyway, and you've now got a taste for manbeast blood.");
		
		System.out.println("You walk away from the shitty kite and through the drab door to the other drab door, and go inside, lusting for the thrill of killing manbeasts.");
		System.out.println("Somewhat disappointingly, all you see is a mediocre, small, red wagon, sitting atop yet another pile of rocks, ensconced in yet more light.");
		System.out.println("You're getting kind of sick of the routine of this, and also are somewhat curious where all this light is coming from...");
		System.out.println("You look up to find an open window through which you could easily escape...although now you find there's no sweeter smell than that of manbeast blood mixed with sweat.");
		System.out.println("Honestly, it's the best way to start the day.");
		System.out.println();
		System.out.println("Behind you, you hear the warbling cry of an enraged manbeast. The hunt is on!");
		System.out.println("You turn around to see another manbeast who is holding the broken handle for what you now realize is your old, childhood wagon!");
		System.out.println("This means manbeast blood!");
		System.out.println();
		
		System.out.println("3");
		System.out.println("2");
		System.out.println("1");
		System.out.println("FIGHT");
		System.out.println();

		Enemies[] enemyArr2 = new Enemies[3];
		Level1 lev12 = new Level1(20, 20);
		Level2 lev22 = new Level2(30, 30);
		Level3 lev32 = new Level3(40, 40);

		enemyArr2[0] = lev12;
		enemyArr2[1] = lev22;
		enemyArr2[2] = lev32;

		i = (int) (Math.random() * 2);

		do {

			System.out.println("1) Punch");
			System.out.println("2) Kick");
			System.out.println("3) Throw sand in manbeasts eyes");
			System.out.println("4) Emotionally disarm the manbeast");
			int entry = kb.nextInt();
			if (player.getHealth() > 0) {
				double playerDamage = player.attack(entry);
				enemyArr2[i].setHealth(enemyArr2[i].getHealth() - playerDamage);
			} else {
				System.out.println("You are dead, get over yourself.");
				return;
			}
			if (enemyArr2[i].getHealth() > 0) {
				double enemyDamage = enemyArr2[i].attack(player.getAgility());
				player.setHealth(player.getHealth() - enemyDamage);
			}
			System.out.println(player.getName() + "'s remaining health: " + player.getHealth());
			System.out.println("Manbeast's remaining health: " + enemyArr2[i].getHealth());
			System.out.println();

		} while (player.getHealth() > 0 && enemyArr2[i].getHealth() > 0);
		
		System.out.println();
		System.out.println("Damn but that was satisfying.");
		System.out.println("Big surprise, the manbeast disappears, leaving behind the final key shard, and one last note...");
		System.out.println("You pick up the key and leave the note, because whoever has been writing them has been doing a terrible job of keeping your attention.");
		System.out.println("Now that you have all three key shards, you assemble them into one giant, golden key. You feign shock.");
		System.out.println();
		System.out.println("You walk towards the beautiful, welcoming door, now confident that you will go inside and unravel ALL of the mysteries that have been presented to you today.");
		System.out.println("Somewhat annoyingly, whoever is inside has UNLOCKED the door, preventing you from using your now finished/defunct key. How irritating.");
		System.out.println();
		System.out.println("You enter to the sounds of organ music reverberating around a cathedral, with ceilings at least 50 feet high and gothic arches.");
		System.out.println("Tapestries of lineage hang from the walls.");
		System.out.println("You look ahead, and see someone playing the organ somewhat menacingly at the end of the cathedral.");
		System.out.println("You walk down the center of the cathedral to confront whoever this mysterious, hooded figure is, and to find out where he learned to play the organ.");
		System.out.println("As you reach the final tapestry, you notice your embossed image ensconced in light (god you're getting sick of all this ensconcing).");
		
		System.out.println();
		System.out.println("The organ stops, and its player turns around to face you.");
		System.out.println("\"Good evening, child of mine\", he says menacingly.");
		System.out.println();
		System.out.println("Memories begin to flash in front of your very eyes...years ago, after a long day flying red kites, and riding in red wagons...");
		System.out.println("You feel a single tear welling in your eye, as you remember the day your father left you all those years ago. He said he was just going to get cigarettes, but he never returned...");
		System.out.println();
		System.out.println("\"Hello.....father\", you reply with disdain.");
		System.out.println();
		System.out.println("As you watch in horror, the father you now remember removes a flesh mask from his face, revealing the manbeast beneath!!");
		System.out.println();
		System.out.println("But wait...if your father is a manbeast, then...YOU must be a manbeast! And you've spent what was previously a lovely afternoon, KILLING YOUR OWN KIND!!!");
		System.out.println();
		System.out.println("You crumple to your knees and shout \"NOOOOOOOOOOO\" in dramatic fashion");
		System.out.println();
		System.out.println("In a moment of clarity, you realize that you actually ENJOY killing your own kind (or at least the smell of it), and are now quite keen on descending into depravity.");
		System.out.println();
		System.out.println("You begin laughing maniacally and forecefulluy get to your feet, one foot at a time. You look up at your father with murder in your eyes.");
		System.out.println();
		
		System.out.println("3");
		System.out.println("2");
		System.out.println("1");
		System.out.println("FIGHT");
		System.out.println();

		Boss father = new Boss(50, 30);
		
		do {

			System.out.println("1) Punch");
			System.out.println("2) Kick");
			System.out.println("3) Throw sand in manbeasts eyes");
			System.out.println("4) Emotionally disarm the manbeast");
			int entry = kb.nextInt();
			if (player.getHealth() > 0) {
				double playerDamage = player.attack(entry);
				father.setHealth(father.getHealth() - playerDamage);
			} else {
				System.out.println("You are dead, get over yourself.");
				return;
			}
			if (father.getHealth() > 0) {
				double enemyDamage = father.attack(player.getAgility());
				player.setHealth(player.getHealth() - enemyDamage);
			}
			System.out.println(player.getName() + "'s remaining health: " + player.getHealth());
			System.out.println("Father's remaining health: " + father.getHealth());
			System.out.println();

		} while (player.getHealth() > 0 && father.getHealth() > 0);
		System.out.println("You've defeated your father. Well done! That makes you a bastard, doesn't it?");
		System.out.println("Game over. You...win(?) Now you can go on the manbeast killing rampage of your dreams!");
		kb.close();
	}
}
