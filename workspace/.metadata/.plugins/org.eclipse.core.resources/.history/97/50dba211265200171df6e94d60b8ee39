package Labs;

import java.util.ArrayList;
import java.util.List;

public class Lottery {
	public static void main(String[] args) {
		whites();
		reds();
	}
	
	public static void whites() {
		LotteryHopper whiteHopper = new LotteryHopper();

		List<LotteryBall> whitewinners = new ArrayList<>();
	    whitewinners = whiteHopper.find5WinningWhiteBalls();
	    System.out.println("...and your lottery numbers are....");
	    for (int i = 0; i < 5; i++) {
	    	System.out.println(whitewinners.get(i).getNumber()); 
	    }
}
	public static void reds() {
		LotteryHopper redHopper = new LotteryHopper();
		
		LotteryBall powerballwinner = redHopper.find1WinningPowerBall();
		System.out.println("Drum roll please....");
		System.out.println("Your final, powerball number is:");
        System.err.println(powerballwinner.getNumber());  
	}
}
