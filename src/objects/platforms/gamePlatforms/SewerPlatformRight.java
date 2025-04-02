package objects.platforms.gamePlatforms;
import objects.platforms.Platform;
import ui.images.ImageRenderer;

public class SewerPlatformRight extends Platform{
    public SewerPlatformRight(int x, int y){
        super(x, y, ImageRenderer.stationaryPlatformRight);
    }
}
