package ui.images;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class ImageRenderer
{
    public static Image sewerBackground;
    public static Image movingPlatform;
    public static Image ratIdle;
    public static void loadImages()
    {
        try {
            sewerBackground = new Image("res/Sewer_Background.png");
            movingPlatform = new Image("res/movingPlatform.png");
            ratIdle = new Image("res/Rat_Idle.png");
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
}
