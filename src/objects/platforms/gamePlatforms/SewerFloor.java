package objects.platforms.gamePlatforms;

import objects.platforms.Platform;
import ui.images.ImageRenderer;

public class SewerFloor extends Platform {
    public SewerFloor(int x, int y){
        super(x,y, ImageRenderer.sewerFloorScaled);
    }
}
