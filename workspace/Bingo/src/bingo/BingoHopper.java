package bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoHopper  {
	List<PingPongBall> bingoBalls = new ArrayList<>();
	
	public void shuffleBalls(){
		
		BallFactory factory = new BallFactory();
		bingoBalls = factory.makeBingoBalls();
		
		Collections.shuffle(bingoBalls);
		
	}
	
	public PingPongBall pullWinner(){
		System.out.println(this.bingoBalls.get(0).getNumber());
		return this.bingoBalls.remove(0);
	}
	
}
