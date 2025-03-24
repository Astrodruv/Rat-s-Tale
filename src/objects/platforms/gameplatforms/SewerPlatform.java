package objects.platforms.gameplatforms;

import objects.platforms.Platform;
import org.newdawn.slick.Image;
import ui.images.ImageRenderer;


public class SewerPlatform extends Platform
{

    public SewerPlatform(int x, int y)
    {
        super(x, y);
        image = ImageRenderer.movingPlatform;
    }
}
