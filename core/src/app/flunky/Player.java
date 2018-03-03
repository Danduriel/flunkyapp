package app.flunky;

public class Player {

	protected String name;	
	protected String picturePath;
	
	protected String[] formerNames;
	protected String team;
	
	
	
	public Player(String name, String path, String team) {
		this.name = name;
		this.picturePath = path;
		this.team = team;
	}
	
	public Player(String name, String team) {
		this.name = name;
		this.team = team;
	}
	public Player(String name) {
		this.name = name;
	}
	
	
	
	
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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
	
	
	
	
	
}
