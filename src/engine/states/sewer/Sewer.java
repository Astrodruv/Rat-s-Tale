package engine.states.sewer;

import engine.Main;
import objects.entities.player.Player;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import objects.platforms.gameplatforms.SewerPlatform;
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import ui.images.ImageRenderer;

public class Sewer extends BasicGameState
{
	Image sewer;
	Image scaled;
	private int id;
	private static Player player;

	public SewerPlatform sp;

	public Sewer(int id)
	{
		this.id = id;
	}
	
	public int getID() 
	{
		return id;		
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		// This code happens when you enter a game state for the *first time.*
		gc.setShowFPS(true);
		player = new Player(0,0,5,5,100,50, ImageRenderer.rat);

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		player.render(g);
//		sp.groundCheck();
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
