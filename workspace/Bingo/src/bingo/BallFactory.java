package bingo;

import java.util.ArrayList;
import java.util.List;

public class BallFactory {
	
	public List<PingPongBall> makeBingoBalls() {
		List<PingPongBall> bingoBallsList = new ArrayList<>();
		for (int i = 0; i < 75; i++){
			PingPongBall newBall = new PingPongBall(i);
			bingoBallsList.add(newBall);
		}
		return bingoBallsList;
	}
	
}
