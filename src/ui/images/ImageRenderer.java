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

    public static Image sewerBackground;
    public static Image movingPlatform;
    public static Image ratIdle;

    public static Image cockroachIdle;
    public static Image cockroachWalking;

    public static void loadImages()
    {
        try {
            sewerBackgroundUnscaled = new Image("res/Sewer_Background.png");
            movingPlatformUnscaled = new Image("res/Moving_Platform.png");
            ratIdleUnscaled = new Image("res/Rat_Idle1.png");

            sewerBackground = sewerBackgroundUnscaled.getScaledCopy(Main.getScreenWidth(), Main.getScreenHeight());
            ratIdle = ratIdleUnscaled.getScaledCopy(screenRatio);
            movingPlatform = movingPlatformUnscaled.getScaledCopy(screenRatio);

            System.out.println(screenRatio);
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
}