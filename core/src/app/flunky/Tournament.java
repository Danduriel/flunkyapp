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
	
	protected ArrayList<Team> teams= new ArrayList<Team>();
	protected ArrayList<Game> games= new ArrayList<Game>();

	
	public Tournament(String name, String date, String format) {
		this.name = name;
		this.date = date;
		this.format = format;
	}
	
	
	protected void countTeams() {
		countTeams = teams.size();
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPicturePath() {
		return picturePath;
	}


	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}


	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
	}


	public int getCountTeams() {
		return countTeams;
	}


	public void setCountTeams(int countTeams) {
		this.countTeams = countTeams;
	}


	public Team getWinner() {
		return winner;
	}


	public void setWinner(Team winner) {
		this.winner = winner;
	}


	public Throw getBestThrow() {
		return bestThrow;
	}


	public void setBestThrow(Throw bestThrow) {
		this.bestThrow = bestThrow;
	}


	public Player getMvp() {
		return mvp;
	}


	public void setMvp(Player mvp) {
		this.mvp = mvp;
	}


	public ArrayList<Team> getTeams() {
		return teams;
	}


	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}


	public ArrayList<Game> getGames() {
		return games;
	}


	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}

	
}

