package ui.images;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class ImageRenderer
{
    public static Image sewerBackground;

    public static Image rat;

    public static void loadImages()
    {
        try {
            sewerBackground = new Image("res/Sewer_Background.png");
            rat = new Image("res/Rat_Idle1.png");
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
}
