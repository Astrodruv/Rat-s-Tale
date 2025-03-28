package objects.entities.enemy.boss.attacking;

import engine.Main;
import objects.entities.Entity;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import ui.images.ImageRenderer;


public class Cockroach extends Entity
{
    private int xSpeed = 15;
    private int ySpeed = 0;
    public int health = 100;

    public int xPos = Main.getScreenWidth();
    public int yPos;

    public Cockroach()
    {
        super(Main.getScreenWidth(), 400, 15, 0, 100, 20, ImageRenderer.cockroachIdle);

    }

    public void render(Graphics g)
    {
        image.draw(x, y);
    }

    public void update(GameContainer gc)
    {
        if(x > 0) {
            x = x - xSpeed;
        }
        else {
            x = x + xSpeed;
        }
    }

    public void damaged(int amount)
    {
        health = health - amount;
    }



    public void collisions() {

    }
}
