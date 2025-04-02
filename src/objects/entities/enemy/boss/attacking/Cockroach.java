package objects.entities.enemy.boss.attacking;

import engine.Main;
import engine.states.sewer.CockroachFight;
import engine.states.sewer.Sewer;
import objects.GameObject;
import objects.entities.Entity;
import objects.entities.player.Player;
import objects.platforms.Platform;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import ui.images.ImageRenderer;


public class Cockroach extends Entity
{
    private float xSpeed;
    private float ySpeed;
    private float yAccel;
    private float permYSpeed;
    private int timer;

    public int health;
    private boolean canJump;
    private boolean inAir;

    private boolean leftDirection;
    private static double directionater = Math.random() * 1;

    public Cockroach()
    {

        super(500, 400, 15, 25, 100, 20, ImageRenderer.cockroachIdle);

        xSpeed = 15;
        ySpeed = 25;
        yAccel = 0;
        permYSpeed = 25;
        timer = 130;

        health = 100;
        canJump = false;
        inAir = false;

        if(directionater < 0.5)
        {
            leftDirection = true;
            image = image.getFlippedCopy(true, false);
        }
        else
        {
            leftDirection = false;
        }
    }

    public void render(Graphics g)
    {
        g.drawString(String.valueOf(canJump), 500, 500);
        g.drawString(String.valueOf(timer), 550, 500);
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
        if(timer < 0)
        {
            if (canJump) {
                jumps();
            }
        }
    }

    public void jumps()
    {
        y = y - (ySpeed - yAccel);
        yAccel += 1.5f;
    }

    public void collisions()
    {
        for(GameObject g: CockroachFight.roaches)
        {
            if(g instanceof Platform && g.collidesWithBottomOf(g))
            {
                canJump = true;
                if(ySpeed == permYSpeed)
                {
                    canJump = false;
                    y = g.getY() - h;
                }
            }
//            if(g instanceof Platform && g.collidesWithTopOf(g))
//            {
//                y = g.getY() - h;
//                ySpeed = 0;
//                yAccel = -1.125F;
//            }
//            else if(g instanceof Player && g.collidesWith(g))
//            {
//                Player.damaged(5);
//            }
        }

    }
}
