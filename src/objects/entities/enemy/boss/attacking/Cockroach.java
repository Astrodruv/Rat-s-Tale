package objects.entities.enemy.boss.attacking;

import engine.Main;
import engine.states.sewer.Sewer;
import objects.GameObject;
import objects.entities.Entity;
import objects.platforms.Platform;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import ui.images.ImageRenderer;


public class Cockroach extends Entity
{
    private int xSpeed;
    private int ySpeed;

    public int health;
    public boolean onGround;


    private boolean leftDirection;
    protected Image image;

    public Cockroach()
    {
        super(Main.getScreenWidth(), 400, 15, 0, 100, 20, ImageRenderer.cockroachIdle);
        xSpeed = 15;
        ySpeed = 0;

        health = 100;
        onGround = true;

        leftDirection = true;
        image = ImageRenderer.cockroachIdle;
    }

    public void render(Graphics g)
    {
        if(!leftDirection) {
            image.draw(x,y);
        }
        else
        {
            image.getFlippedCopy(true, false);
            image.draw(x, y);
        }
    }

    public void update(GameContainer gc)
    {
        if(leftDirection)
        {
            x = x - xSpeed;
            if(x < 0)
            {
                leftDirection = false;
            }
        }
        if(!leftDirection)
        {
            x = x + xSpeed;
            if(x > Main.getScreenWidth())
            {
                leftDirection = true;
            }
        }
    }

    public void collisions()
    {
        for(GameObject go: Sewer.levelObjects)
        {
            if(go instanceof Platform && go.collidesWithTopOf(go))
            {
                onGround = true;
            }
            else {
                onGround = false;
            }
        }

    }
}
