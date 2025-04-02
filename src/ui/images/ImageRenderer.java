package ui.images;

import engine.Main;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class ImageRenderer
{
    public static final float screenRatio = 1 / ((float) (Main.getScreenWidth() * Main.getScreenHeight()) / 1000000);

    public static Image sewerBackgroundUnscaled;
    public static Image movingPlatformUnscaled;
    public static Image ratIdleUnscaled;
    public static Image stationaryPlatformRight;
    public static Image stationaryPlatformLeft;
    public static Image sewerBackground;
    public static Image movingPlatform;
    public static Image ratIdle;
    public static Image sewerFloor;
    public static Image sewerFloorScaled;

    public static Image cockroachIdle;
    public static Image cockroachWalking;

    public static void loadImages()
    {
        try {
            sewerBackgroundUnscaled = new Image("res/Sewer_Background.png");
            movingPlatformUnscaled = new Image("res/Moving_Platform.png");
            ratIdleUnscaled = new Image("res/RatIdle.png");
            stationaryPlatformRight = new Image("res/Stationary_Platform_Right.png");
            stationaryPlatformLeft = new Image("res/Stationary_Platform_Left.png");
            sewerFloor = new Image("res/Sewer_Floor.png");
            cockroachIdle = new Image("res/Cockroach_Idle.png");

            sewerBackground = sewerBackgroundUnscaled.getScaledCopy(Main.getScreenWidth(), Main.getScreenHeight());
            ratIdle = ratIdleUnscaled.getScaledCopy(screenRatio);
            movingPlatform = movingPlatformUnscaled.getScaledCopy(screenRatio);
            sewerFloorScaled = sewerFloor.getScaledCopy(Main.getScreenWidth(), 70);
            stationaryPlatformLeft = stationaryPlatformLeft.getScaledCopy(400,70);

          System.out.println("Screen ratio scaling: " + screenRatio);
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
}