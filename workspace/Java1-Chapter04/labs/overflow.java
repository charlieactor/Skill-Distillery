package labs;

public class overflow {

	public static void main(String[] args) {
		int big = 2_147_483_647;
		int bigger = big + 1;
		//2,147,483,647 is the maximum number for an int
		//Adding 1 to int big will flip the final bit to 0, making the int the largest possible negative.
		
		System.out.println("" + big + " " + bigger);
	}

}
