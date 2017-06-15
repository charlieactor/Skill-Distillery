package Labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NBAHopper extends Hopper {
	List <NBAPingPongBall> hopperBalls = new ArrayList<>();
	public NBAHopper() {
	BallFactory nbaballs= new BallFactory();	
	hopperBalls = nbaballs.MakeBalls(NBAteams.PHILADEPHIA76ERS, NBAteams.LOSANGELESLAKERS, NBAteams.BROOKLYNNETS, NBAteams.SUNS, NBAteams.TWOLVES, NBAteams.PELICANS, NBAteams.KNICKS, NBAteams.KINGS, 
			NBAteams.NUGGETS, NBAteams.BUCKS, NBAteams.MAGIC, NBAteams.JAZZ, NBAteams.WIZARDS, NBAteams.BULLS);
	}
	
	public NBAPingPongBall ShuffleAndFindWinningTeam () {
		Collections.shuffle(hopperBalls);
		return hopperBalls.get((int)Math.random()*1000);
	} 
}
