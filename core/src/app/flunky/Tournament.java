package app.flunky;

import java.util.Vector;

public class Tournament {
	protected String name; 
	protected String date;
	
	protected String location;
	protected String description;
	
	protected String picturePath;
	
	protected String format;
	
	protected int countTeams;
	protected Team winner;
	protected Player bestThrow;
	protected Player mvp; // Best quota of Hit / Throws
	
	protected Vector<Team> teams;
	protected Vector<Game> games;
	
	
	
	
	protected void setMVP() {
		//this.mvp = ;
	}

	
}

