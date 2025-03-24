package ui.images;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class ImageRenderer
{
public static Image sewerBackground;

    public static void loadImages()
    {
        try {
            sewerBackground = new Image("res/Sewer_Background.png");
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
}
