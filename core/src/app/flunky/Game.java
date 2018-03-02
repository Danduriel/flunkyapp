package app.flunky;

import java.util.ArrayList;


public class Game {

	protected int gid;
	protected Team teamOne;
	protected Team teamTwo;
	
	protected ArrayList<Throw> throwes = new ArrayList<Throw>();
	//throwes.add(new Throw(teamone.getPlayerOne, true);
	protected int throwCount;
	protected int hitCount;
	protected String desc;
	
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
		this.desc = teamOne.getName() + "vs. "+ teamTwo.getName();
				
	}
	protected void addThrow(Throw wurf) {
		throwes.add(wurf);
	}
	protected void addThrow(Player pitcher, boolean hit) {
		throwes.add(new Throw(pitcher, hit));
	}
	
	
	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public Team getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(Team teamOne) {
		this.teamOne = teamOne;
	}

	public Team getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(Team teamTwo) {
		this.teamTwo = teamTwo;
	}

	public ArrayList<Throw> getThrowes() {
		return throwes;
	}

	public void setThrowes(ArrayList<Throw> throwes) {
		this.throwes = throwes;
	}

	public int getThrowCount() {
		return throwCount;
	}

	public void setThrowCount(int throwCount) {
		this.throwCount = throwCount;
	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Team getWinner() {
		return winner;
	}

	public void setWinner(Team winner) {
		this.winner = winner;
	}
	
	
	
	
}
