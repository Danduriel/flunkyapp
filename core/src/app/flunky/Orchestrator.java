package app.flunky;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Json;

public class Orchestrator extends ApplicationAdapter {
	
	
	public int GID; 
	
	public ArrayList<Tournament> tournaments = new ArrayList<Tournament>();
	public ArrayList<Team> teams= new ArrayList<Team>();
	public ArrayList<Player> players= new ArrayList<Player>();
	
	//Tournament testtournament = new Tournament("Birkenstock 2018", "Sepember 2018","Double Elim");
	
	//System.out.println("Deasdadsrp3");
	
	public void testdata() {
		//Tournaments
		System.out.println("Derp2");
		//Tournament testtournament = new Tournament("Birkenstock 2018", "Sepember 2018","Double Elim");
		//tournaments.add(testtournament);
		tournaments.add(new Tournament("Birkenstock 2018", "Sepember 2018","Double Elim"));
		System.out.println("Derp3");
		
		
		// Teams
		teams.add(new Team("Infosaurier",2));
		teams.add(new Team("Hangover 96",2));
		teams.add(new Team("Pürietten",2));
		teams.add(new Team("Redbeards",2));
		teams.add(new Team("BHood Jillaz",2));
		teams.add(new Team("Robin zur Turnierleitung bitte",2));
		teams.add(new Team("Morio Muskat",2));
		teams.add(new Team("To beer or not to beer", 2));
		
		System.out.println("Derp4");
		
		//Player
		players.add(new Player("Alex", "Infosaurier"));
		players.add(new Player("Sven", "Infosaurier"));
		players.add(new Player("Till", "Hangover 96"));
		players.add(new Player("Felix", "Hangover 96"));
		players.add(new Player("Lara", "Pürietten"));
		players.add(new Player("Philo", "Pürietten"));
		players.add(new Player("Robin", "Redbeards"));
		players.add(new Player("Merlin","Redbeards"));
		players.add(new Player("Dustin", "BHood Jillaz"));
		players.add(new Player("Lukas", "BHood Jillaz"));
		players.add(new Player("BonnDude1", "Robin zur Turnierleitung bitte"));
		players.add(new Player("BonnDude2","Robin zur Turnierleitung bitte"));
		players.add(new Player("Jana", "Morio Muskat"));
		players.add(new Player("Morio2", "Morio Muskat"));
		players.add(new Player("Kiddie1", "To beer or not to beer"));
		players.add(new Player("Kiddie2", "To beer or not to beer"));
		
		System.out.println("Derp5");

		//Teamfilling
		teams.get(0).addPlayer(players.get(0));
		teams.get(0).addPlayer(players.get(1));
		teams.get(1).addPlayer(players.get(2));
		teams.get(1).addPlayer(players.get(3));
		teams.get(2).addPlayer(players.get(4));
		teams.get(2).addPlayer(players.get(5));
		teams.get(3).addPlayer(players.get(6));
		teams.get(3).addPlayer(players.get(7));
		teams.get(4).addPlayer(players.get(8));
		teams.get(4).addPlayer(players.get(9));
		teams.get(5).addPlayer(players.get(10));
		teams.get(5).addPlayer(players.get(11));
		teams.get(6).addPlayer(players.get(12));
		teams.get(6).addPlayer(players.get(13));
		teams.get(7).addPlayer(players.get(14));
		teams.get(7).addPlayer(players.get(15));
		
		System.out.println("Derp6");
		
		tournaments.get(0).addTeam(teams.get(0));
		tournaments.get(0).addTeam(teams.get(1));
		tournaments.get(0).addTeam(teams.get(2));
		tournaments.get(0).addTeam(teams.get(3));
		tournaments.get(0).addTeam(teams.get(4));
		tournaments.get(0).addTeam(teams.get(5));
		tournaments.get(0).addTeam(teams.get(6));
		tournaments.get(0).addTeam(teams.get(7));
		
		System.out.println("Derp7");
		
		tournaments.get(0).countTeams();
		
		System.out.println("Derp8");
		
		// No nested clases / zirkelschlüsse
		Json json = new Json();
		System.out.println(json.prettyPrint(tournaments.get(0)));
	}
	
	
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		System.out.println("Derp");
		testdata();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
