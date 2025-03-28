package objects.platforms.gamePlatforms;

import objects.platforms.Platform;
import ui.images.ImageRenderer;


public class SewerPlatform extends Platform
{
    public SewerPlatform(int x, int y) {
        super(x, y, ImageRenderer.movingPlatform);
    }

}
