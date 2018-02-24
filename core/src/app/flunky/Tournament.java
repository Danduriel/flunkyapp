package app.flunky;

import java.util.ArrayList;


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
	
	protected ArrayList<Team> teams;
	protected ArrayList<Game> games;
	//numbers.add(new PhoneNumber("Home", "206-555-1234"));
	//teams.add(new Throw("Martin", true)
	
	public Tournament(String name, String date, String format) {
		this.name = name;
		this.date = date;
		this.format = format;
	}
	
	
	protected void setMVP() {
		//this.mvp = ;
	}
	
	protected void addGame() {
		
	}
	
	protected void addTeam() {
		
	}

	
}

