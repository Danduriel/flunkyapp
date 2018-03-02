package app.flunky;

import java.util.ArrayList;

public class Team {
	
	protected String name; 
	

	protected int playerCount; 
	protected ArrayList<Player> players;
	//protected Player playerOne;
	//protected Player playerTwo;
	
	protected String logoPath;
	
	protected ArrayList<String> formerNames;
	protected String description;

	protected ArrayList<Game> games;
	protected ArrayList<Tournament> tourneyWins;
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
