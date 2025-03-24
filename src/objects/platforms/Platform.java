package objects.platforms;

import engine.Main;
import objects.GameObject;
import org.newdawn.slick.Image;

public class Platform extends GameObject
{
    public float xPlayer;
    public float yPlayer;

    public Image image;


    public Platform(int x, int y)
    {
        this.xPlayer = x;
        this.yPlayer = y;
    }

    public boolean groundCheck(int x, int y)
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
}
