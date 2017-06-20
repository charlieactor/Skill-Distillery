package Labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LotteryHopper extends Hopper {
	List <LotteryBall> whiteHopperBalls = new ArrayList<>();
	List <LotteryBall> redHopperBalls = new ArrayList<>();
	public LotteryHopper() {
	BallFactory lotteryballs= new BallFactory();	
	whiteHopperBalls = lotteryballs.Make69WhiteLotteryBalls();
	redHopperBalls = lotteryballs.Make26RedLotteryBalls();
	}
	
	public List<LotteryBall> find5WinningWhiteBalls () {
		Collections.shuffle(whiteHopperBalls);
		List<LotteryBall> fiveWinners = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			int index = (int)(Math.random()*whiteHopperBalls.size()); 
			LotteryBall winner = whiteHopperBalls.get(index);
			fiveWinners.add(winner);
			whiteHopperBalls.remove(index);  //takes ball out of hopper so it is Not Replaced
		}
		return fiveWinners;
	}
	public LotteryBall find1WinningPowerBall () {
		Collections.shuffle(redHopperBalls);
		
			int index = (int)(Math.random()*redHopperBalls.size()); //takes ball out of hopper so it is Not Replaced
			LotteryBall winner = redHopperBalls.get(index);
			redHopperBalls.remove(index);  //takes ball out of hopper so it is Not Replaced
		return winner;
	}
}
