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
	protected Throw bestThrow;
	protected Player mvp; // Best quota of Hit / Throws
	
	protected ArrayList<Team> teams;
	protected ArrayList<Game> games;

	
	public Tournament(String name, String date, String format) {
		this.name = name;
		this.date = date;
		this.format = format;
	}
	
	//Omitting more Constructors out of lazyness
	
	
	protected void setMVP(Player player) {
		this.mvp = player;
	}
	
	protected void addGame(int gid, Team teamone, Team teamtwo, Team winner) {
		games.add(new Game(gid, teamone, teamtwo,winner));
	}
	protected void addGame(int gid, Team teamone, Team teamtwo) {
		games.add(new Game(gid, teamone, teamtwo));
	}
	
	protected void addTeam(Team team) {
		teams.add(team);
		countTeams++;
	}

	
}

