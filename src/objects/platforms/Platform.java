package objects.platforms;

import engine.Main;
import objects.GameObject;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class Platform extends GameObject
{
    public float xPlayer;
    public float yPlayer;

    public float xSpeed;

    public float x;
    public float y;

    public Image image;


    public Platform(int x, int y, Image image) {
        super(x, y);
        this.image = image;
        this.x = x;
        this.y = y;
        w = image.getWidth();
        h = image.getHeight();
    }

    public void render(Graphics g) {
        image.draw(x,y);
    }

    public void collisions() {

    }
}