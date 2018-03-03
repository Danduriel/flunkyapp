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
	protected int hitCountTeamOne;
	protected int hitCountTeamTwo;
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
		throwCount++;
	}
	protected void addThrow(Player pitcher, boolean hit) {
		throwes.add(new Throw(pitcher, hit));
		throwCount++;
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
	public void setThrowCount() {
		this.throwCount = throwes.size();
	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	//Iterate through all Throws and count hits. 
	public void setHitCount() {
		hitCount = 0;
		for (int i = 0; i < throwes.size(); i++) {
			if(throwes.get(i).getHit()) {
				hitCount++;
			}
		}
	}
	
	
	public int getHitCountTeamOne() {
		return hitCountTeamOne;
	}
/*// Zirkelbezug wenn der pitcher ein team und nicht nur nen string fürs team hat. 
	public void setHitCountTeamOne() {
		hitCountTeamOne = 0;
		for (int i = 0; i < throwes.size(); i++) {
			if(throwes.get(i).getHit() && throwes.get(i).getPitcher = "derp") {
				hitCount++;
			}
		}
	}
*/ 
	public int getHitCountTeamTwo() {
		return hitCountTeamTwo;
	}
/* Zirkelbezug wenn der pitcher ein team und nicht nur nen string fürs team hat. 
	public void setHitCountTeamTwo() {
		hitCountTeamTwo = 0;
		for (int i = 0; i < throwes.size(); i++) {
			if(throwes.get(i).getHit()) {
				hitCount++;
			}
		}
	}
*/
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		this.desc = teamOne.getName() + "vs. "+ teamTwo.getName();
	}
	public void setDesc() {
		this.desc = teamOne.getName() + "vs. "+ teamTwo.getName();
	}

	public Team getWinner() {
		return winner;
	}

	public void setWinner(Team winner) {
		this.winner = winner;
	}
	
	
	
	
}
