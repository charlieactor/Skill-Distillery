package Labs;

public class NBAdraft {
	public static void main(String[] args) {
		actualNBADraft100times();
	}

	
	public static void actualNBADraft100times() {
		int lineCounter = 0; 
		for(int i = 0; i < 100; i++) {
			lineCounter++;
			
		Hopper hopper = new Hopper();
		hopper.ShuffleAndFindWinningTeam();
	    PingPongBall ping = hopper.ShuffleAndFindWinningTeam();
		System.out.println("lineCounter: " + lineCounter + " " + ping.getNBAteams());
	}
	}
}
