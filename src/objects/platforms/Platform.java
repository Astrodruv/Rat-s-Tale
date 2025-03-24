package objects.platforms;

import engine.Main;
import objects.GameObject;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class Platform extends GameObject
{
    public float xPlayer;
    public float yPlayer;

    public float x = 0;
    public float y = 400;

    public Image image;


    public Platform(int x, int y)
    {
        this.xPlayer = x;
        this.yPlayer = y;
    }

    public boolean groundCheck(float x, float y)
    {
        boolean xCheck = false;
        boolean yCheck = false;
        if(xPlayer > 0 && xPlayer < Main.getScreenWidth())
        {
            xCheck = true;
        }
        if(yPlayer > image.getHeight())
        {
            yCheck = true;
        }
        if (xCheck && yCheck)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public void render(Graphics g)
    {
        g.drawRect(x, y, Main.getScreenWidth(), 400);
        System.out.println(groundCheck(x,y));
    }
}
