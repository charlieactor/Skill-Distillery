package Labs;

import java.util.ArrayList;
import java.util.List;

public class BallFactory {
	//list of teams
	private List <PingPongBall> nbateams = new ArrayList <>();
	
	public List<PingPongBall> MakeBalls(NBAteams nbateam1, NBAteams nbateam2, NBAteams nbateam3, NBAteams nbateam4, NBAteams nbateam5, 
			NBAteams nbateam6, NBAteams nbateam7, NBAteams nbateam8, NBAteams nbateam9, NBAteams nbateam10, 
			NBAteams nbateam11, NBAteams nbateam12, NBAteams nbateam13, NBAteams nbateam14) {
		for( int i = 0; i < 250; i++) {
			PingPongBall ball = new PingPongBall(nbateam1);
		nbateams.add(ball);
	}
		for( int i = 0; i < 199; i++) {
			PingPongBall ball = new PingPongBall(nbateam2);
			nbateams.add(ball);
		}
		for( int i = 0; i < 156; i++) {
			PingPongBall ball = new PingPongBall(nbateam3);
			nbateams.add(ball);
		}
		for( int i = 0; i < 119; i++) {
			PingPongBall ball = new PingPongBall(nbateam4);
			nbateams.add(ball);
		}
		for( int i = 0; i < 88; i++) {
			PingPongBall ball = new PingPongBall(nbateam5);
			nbateams.add(ball);
		}
		for( int i = 0; i < 63; i++) {
			PingPongBall ball = new PingPongBall(nbateam6);
			nbateams.add(ball);
		}
		for( int i = 0; i < 43; i++) {
			PingPongBall ball = new PingPongBall(nbateam7);
			nbateams.add(ball);
		}
		for( int i = 0; i < 28; i++) {
			PingPongBall ball = new PingPongBall(nbateam8);
			nbateams.add(ball);
		}
		for( int i = 0; i < 17; i++) {
			PingPongBall ball = new PingPongBall(nbateam9);
			nbateams.add(ball);
		}
		for( int i = 0; i < 11; i++) {
			PingPongBall ball = new PingPongBall(nbateam10);
			nbateams.add(ball);
		}
		for( int i = 0; i < 8; i++) {
			PingPongBall ball = new PingPongBall(nbateam11);
			nbateams.add(ball);
		}
		for( int i = 0; i < 7; i++) {
			PingPongBall ball = new PingPongBall(nbateam12);
			nbateams.add(ball);
		}
		for( int i = 0; i < 6; i++) {
			PingPongBall ball = new PingPongBall(nbateam13);
			nbateams.add(ball);
		}
		for( int i = 0; i < 5; i++) {
			PingPongBall ball = new PingPongBall(nbateam14);
			nbateams.add(ball);
		}
		return nbateams;


	}
}
