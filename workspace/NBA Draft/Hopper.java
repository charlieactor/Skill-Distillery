package Labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hopper {
	List <PingPongBall> hopperBalls = new ArrayList<>();
	public Hopper() {
	BallFactory nbaballs= new BallFactory();	
	hopperBalls = nbaballs.MakeBalls(NBAteams.PHILADEPHIA76ERS, NBAteams.LOSANGELESLAKERS, NBAteams.BROOKLYNNETS, NBAteams.SUNS, NBAteams.TWOLVES, NBAteams.PELICANS, NBAteams.KNICKS, NBAteams.KINGS, 
			NBAteams.NUGGETS, NBAteams.BUCKS, NBAteams.MAGIC, NBAteams.JAZZ, NBAteams.WIZARDS, NBAteams.BULLS);
	}
	
	public PingPongBall ShuffleAndFindWinningTeam () {
		Collections.shuffle(hopperBalls);
		return hopperBalls.get((int)Math.random()*1000);
	}
}

