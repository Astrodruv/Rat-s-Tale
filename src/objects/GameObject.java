package objects;

import org.newdawn.slick.Image;
import ui.images.ImageRenderer;

import java.util.ArrayList;

public abstract class GameObject {

    protected Image image;
    protected float x;
    protected float y;
    protected float w;
    protected float h;

    public GameObject(float x, float y){
        image = null;
        this.x = x;
        this.y = y;
    }

    public boolean collidesWithTopOf(GameObject o) {
        return this.x <= o.x + o.w && this.x + this.w >= o.x && this.y + this.h >= o.y && this.y <= o.y;
    }

    public boolean collidesWithBottomOf(GameObject o) {
        return this.x <= o.x + o.w && this.x + this.w >= o.x && this.y >= o.y && this.y <= o.y + o.h;
    }

    public boolean collidesWith(GameObject o)
    {
        return this.x <= o.x + o.w && this.x + this.w >= o.x && this.y + this.h >= o.y && this.y <= o.y + o.h;
    }

    public abstract void collisions();

        public float getX()
    {
        return x;
    }

    public float getY(){
        return y;
    }

    public float getW(){
        return w;
    }

    public float getH(){
        return h;
    }

}
