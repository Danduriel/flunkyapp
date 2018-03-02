package app.flunky;

import java.util.ArrayList;

public class Team {
	
	protected String name; 
	

	protected int playerCount; 
	protected ArrayList<Player> players= new ArrayList<Player>();
	//protected Player playerOne;
	//protected Player playerTwo;
	
	protected String logoPath;

	protected ArrayList<String> formerNames = new ArrayList<String>();
	protected String description;

	protected ArrayList<Game> games = new ArrayList<Game>();
	protected ArrayList<Tournament> tourneyWins = new ArrayList<Tournament>();
	protected int wins;
	
	
	// Constructors	
	
	protected Team(String name, int playercount, Player one, Player two, String path, String desc) {
		this.name = name;
		this.playerCount = playercount;
		this.players.add(one);
		this.players.add(two);
		this.logoPath = path;
		this.description = desc;
	}
	
	protected Team(String name, int playercount, Player one, Player two, String path) {
		this.name = name;
		this.playerCount = playercount;
		this.players.add(one);
		this.players.add(two);
		this.logoPath = path;

	}
	
	protected Team(String name, int playercount, Player one, Player two) {
		this.name = name;
		this.playerCount = playercount;
		this.players.add(one);
		this.players.add(two);
	}
	
	protected Team(String name, int playercount) {
		this.name = name;
		this.playerCount = playercount;
	}
	
	
	
	public int getPlayerCount() {
		return playerCount;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	public ArrayList<String> getFormerNames() {
		return formerNames;
	}

	public void setFormerNames(ArrayList<String> formerNames) {
		this.formerNames = formerNames;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}

	public ArrayList<Tournament> getTourneyWins() {
		return tourneyWins;
	}

	public void setTourneyWins(ArrayList<Tournament> tourneyWins) {
		this.tourneyWins = tourneyWins;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}


	
	//Just adding add methods. 
	//Removal will be done on demand. 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	protected void addPlayer(Player player) {
		this.players.add(player);
	}
	
	protected void addGame(Game game) {
		this.games.add(game);
	}
	
	protected void addWin(Tournament win) {
		this.tourneyWins.add(win);
		wins++;
	}
	
	
}
