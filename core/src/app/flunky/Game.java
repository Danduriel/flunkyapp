package app.flunky;

import java.util.ArrayList;


public class Game {

	protected int gid;
	protected Team teamOne;
	protected Team teamTwo;
	
	protected ArrayList<Throw> throwes;
	//throwes.add(new Throw(teamone.getPlayerOne, true);
	protected int throwCount;
	protected int hitCount;
	
	protected Team winner;
	
	
	protected Game(int gid, Team teamone, Team teamtwo) {
		this.gid = gid;
		this.teamOne = teamone;
		this.teamTwo = teamtwo;
	}
	
	protected Game(int gid, Team teamone, Team teamtwo, Team winner) {
		this.gid = gid;
		this.teamOne = teamone;
		this.teamTwo = teamtwo;
		this.winner = winner;
	}
	protected void addThrow(Throw wurf) {
		throwes.add(wurf);
	}
	protected void addThrow(Player pitcher, boolean hit) {
		throwes.add(new Throw(pitcher, hit));
	}
}
