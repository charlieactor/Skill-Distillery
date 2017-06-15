package Labs;

import java.util.ArrayList;
import java.util.List;

public class BallFactory {
	
	private List <NBAPingPongBall> nbateams = new ArrayList <>();
	private List <LotteryBall> whitelotteryballs = new ArrayList<>();
	private List <LotteryBall> redlotteryballs = new ArrayList<>();
	
	public List<LotteryBall> Make69WhiteLotteryBalls() {
		for (int i = 0; i < 69; i++) {
			LotteryBall white = new LotteryBall("white", (int)(Math.random()*100));
			whitelotteryballs.add(white);
		}
		return whitelotteryballs;
	}
	
	public List<LotteryBall> Make26RedLotteryBalls() {
		for (int i = 0; i < 26; i++) {
			LotteryBall red = new LotteryBall("red", (int)(Math.random()*100));
			redlotteryballs.add(red);
		}
		return redlotteryballs;
	}
	
	
	public List<NBAPingPongBall> MakeBalls(NBAteams nbateam1, NBAteams nbateam2, NBAteams nbateam3, NBAteams nbateam4, NBAteams nbateam5, 
			NBAteams nbateam6, NBAteams nbateam7, NBAteams nbateam8, NBAteams nbateam9, NBAteams nbateam10, 
			NBAteams nbateam11, NBAteams nbateam12, NBAteams nbateam13, NBAteams nbateam14) {
		for( int i = 0; i < 250; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam1);
		nbateams.add(ball);
	}
		for( int i = 0; i < 199; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam2);
			nbateams.add(ball);
		}
		for( int i = 0; i < 156; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam3);
			nbateams.add(ball);
		}
		for( int i = 0; i < 119; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam4);
			nbateams.add(ball);
		}
		for( int i = 0; i < 88; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam5);
			nbateams.add(ball);
		}
		for( int i = 0; i < 63; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam6);
			nbateams.add(ball);
		}
		for( int i = 0; i < 43; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam7);
			nbateams.add(ball);
		}
		for( int i = 0; i < 28; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam8);
			nbateams.add(ball);
		}
		for( int i = 0; i < 17; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam9);
			nbateams.add(ball);
		}
		for( int i = 0; i < 11; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam10);
			nbateams.add(ball);
		}
		for( int i = 0; i < 8; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam11);
			nbateams.add(ball);
		}
		for( int i = 0; i < 7; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam12);
			nbateams.add(ball);
		}
		for( int i = 0; i < 6; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam13);
			nbateams.add(ball);
		}
		for( int i = 0; i < 5; i++) {
			NBAPingPongBall ball = new NBAPingPongBall(nbateam14);
			nbateams.add(ball);
		}
		return nbateams;


	}
}
