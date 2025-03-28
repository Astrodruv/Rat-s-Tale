package engine.states.sewer;

import engine.Main;
import objects.GameObject;
import objects.entities.enemy.boss.attacking.Cockroach;
import objects.entities.player.Player;
import objects.platforms.Platform;
import objects.platforms.gamePlatforms.SewerPlatform;
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import ui.images.ImageRenderer;

import java.util.ArrayList;

public class Sewer extends BasicGameState
{
	public static ArrayList<GameObject> levelObjects;

	private int id;
	private static Player player;
	private Image background;
	private static SewerPlatform platform1;
	private static SewerPlatform platform2;
	private static SewerPlatform platform3;

	public Sewer(int id) {
		this.id = id;
		levelObjects = new ArrayList<>();
	}
	
	public int getID() 
	{
		return id;		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		player = new Player();
		background = ImageRenderer.sewerBackground;
		platform1 = new SewerPlatform(0, 800);
		platform2 = new SewerPlatform(300, 700);
		platform3 = new SewerPlatform(600, 1100);


		levelObjects.add(player);
		levelObjects.add(platform1);
		levelObjects.add(platform2);
		levelObjects.add(platform3);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{
		player.update(gc, sbg, delta);
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		g.setBackground(Color.white);
		background.draw();
		player.render(g);
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
		player.keyPressed(key, c);
	}
	
	public void mousePressed(int button, int x, int y)
	{

	}
	
	


}
