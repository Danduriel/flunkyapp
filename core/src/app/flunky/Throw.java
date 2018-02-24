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
	
}
