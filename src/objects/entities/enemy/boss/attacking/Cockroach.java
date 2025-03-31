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

    public Cockroach()
    {

        super(500, 400, 15, 25, 100, 20, ImageRenderer.cockroachIdle);

        xSpeed = 15;
        ySpeed = 25;
        yAccel = 0;
        timer = 360;

        health = 100;
        jump = true;
        inAir = false;

        leftDirection = false;
    }

    public void render(Graphics g)
    {
        g.drawString(String.valueOf(leftDirection), 500, 500);
        image.draw(x,y);
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
                image = rightFacingImage;
            }
        }
        if(!leftDirection)
        {
            x = x + xSpeed;
            if(x + w > Main.getScreenWidth())
            {
                leftDirection = true;
                image = image.getFlippedCopy(true, false);
            }
        }
        collisions();
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
        yAccel -= 1.5f;
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
                Player.damaged(5);
            }
        }

    }
}
