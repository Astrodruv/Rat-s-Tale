package objects.platforms.gamePlatforms;

import objects.platforms.Platform;
import ui.images.ImageRenderer;

public class SewerPlatformLeft extends Platform {
    public SewerPlatformLeft(int x, int y){
        super(x,y, ImageRenderer.stationaryPlatformLeft);
    }
}
