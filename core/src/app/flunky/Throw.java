package app.flunky;

public class Throw {

	private Player pitcher;
	protected boolean hit;
	protected String desc; // For best Throw purposes
	protected String path; 
	
	public Throw(Player pitcher, Boolean hit ) {
		this.pitcher = pitcher;
		this.hit = hit;
	}
	
	public Throw(Player pitcher, Boolean hit, String desc ) {
		this.pitcher = pitcher;
		this.hit = hit;
		this.desc = desc;
	}
	
	public Player getPitcher() {
		return pitcher;
	}

	public void setPitcher(Player pitcher) {
		this.pitcher = pitcher;
	}

	public boolean getHit() {
		return hit;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	
	
	
}
