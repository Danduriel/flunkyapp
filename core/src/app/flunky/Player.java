package app.flunky;

public class Player {

	protected String name;	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	protected String picturePath;
	
	protected String[] formerNames;
	protected Team team;
	
	public Player(String name, String path, Team team) {
		this.name = name;
		this.picturePath = path;
		this.team = team;
	}
	
	public Player(String name, Team team) {
		this.name = name;
		this.team = team;
	}
	public Player(String name) {
		this.name = name;
	}
	
	
	
}
