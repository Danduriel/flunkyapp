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
	
	protected ArrayList teams;
	protected ArrayList games;
	//numbers.add(new PhoneNumber("Home", "206-555-1234"));
	//teams.add(new Throw("Martin", true)
	
	public Tournament(String name, String date) {
		this.name = name;
		this.date = date;
	}
	
	
	protected void setMVP() {
		//this.mvp = ;
	}

	
}

