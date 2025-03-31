package objects.entities.enemy.boss.attacking;

import engine.Main;
import engine.states.sewer.Sewer;
import objects.GameObject;
import objects.entities.Entity;
import objects.entities.player.Player;
import objects.platforms.Platform;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import ui.images.ImageRenderer;


public class Cockroach extends Entity
{
    private float xSpeed;
    private float ySpeed;
    private float yAccel;
    private int timer;

    public int health;
    private boolean jump;
    private boolean inAir;


    private boolean leftDirection;
    protected Image image;

    public Cockroach()
    {
        super(Main.getScreenWidth(), 400, 15, 25, 100, 20, ImageRenderer.cockroachIdle);

        xSpeed = 15;
        ySpeed = 25;
        yAccel = 0;
        timer = 360;

        health = 100;
        jump = true;
        inAir = false;

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
        timer--;
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
            if(x + w > Main.getScreenWidth())
            {
                leftDirection = true;
            }
        }
        if(jump)
        {
            if (timer < 0) {
                jumps();
            }
        }
    }

    public void jumps()
    {
        y = y + (ySpeed - yAccel);
        yAccel -= 1.125F;
    }

    public void collisions()
    {
        for(GameObject g: Sewer.levelObjects)
        {
            if(g instanceof Platform && g.collidesWithBottomOf(g))
            {
                jump = false;
                timer = 360;
                y = g.getY() + h;
            }
            if(g instanceof Platform && g.collidesWithTopOf(g))
            {
               ySpeed = 0;
               yAccel = -1.125F;
               y = g.getY() - h;
               timer = 360;
            }
            else if(g instanceof Player && g.collidesWith(g))
            {
                Player.damage(5);
            }
        }

    }
}
