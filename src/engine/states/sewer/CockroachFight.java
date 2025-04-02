package engine.states.sewer;

import engine.Main;
import objects.GameObject;
import objects.entities.Entity;
import objects.entities.enemy.boss.attacking.Cockroach;
import objects.platforms.Platform;
import objects.platforms.gamePlatforms.SewerPlatform;
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import ui.images.ImageRenderer;

import java.util.ArrayList;

public class CockroachFight extends BasicGameState
{
	private int id;
	private Image background;

	private Cockroach cockroach;

	private SewerPlatform platform1;
	private SewerPlatform platform2;
	private SewerPlatform platform3;

	public static ArrayList<GameObject> roaches;

	public CockroachFight(int id)
	{
		this.id = id;
		roaches = new ArrayList<>();
	}
	
	public int getID() 
	{
		return id;
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		// This code happens when you enter a game state for the *first time.*
		gc.setShowFPS(true);

		background = ImageRenderer.sewerBackground;

		cockroach = new Cockroach();
		platform1 = new SewerPlatform(0, 700);
		platform2 = new SewerPlatform(200, 700);
		platform3 = new SewerPlatform(400,700);

		roaches.add(cockroach);
		roaches.add(platform1);
		roaches.add(platform2);
		roaches.add(platform3);

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{	
		// This updates your game's logic every frame.  NO DRAWING.
		cockroach.update(gc);
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		// This code renders shapes and images every frame\\

		background.draw();
		cockroach.render(g);

		platform1.render(g);
		platform2.render(g);
		platform3.render(g);
	}
	
	public void enter(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		// This code happens when you enter a gameState.
	}

	public void leave(GameContainer gc, StateBasedGame sbg) 
	{
		// This code happens when you leave a gameState. 
	}

	public void keyPressed(int key, char c)
	{
		// This code happens every time the user presses a key
	}
	
	public void mousePressed(int button, int x, int y)
	{
		// This code happens every time the user presses the mouse
	}
	
	


}
